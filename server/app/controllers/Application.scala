package controllers

import javax.inject._

import edu.trinity.videoquizreact.shared.SharedMessages
import play.api.mvc._

@Singleton
class Application @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index = Action {
    Ok(views.html.index(SharedMessages.itWorks))
  }

  def inclass = Action {
    val arr = Array.fill(10)(Array.fill(10)(scala.util.Random.nextInt(100)))
    Ok(views.html.inclass(arr))
  }

  def form(name: String, color: String) = Action {
    Ok(views.html.color(name, color))
  }

  def username = Action {
    Ok(views.html.username())
  }

  def usernamePost() = Action { request =>
    val postVals = request.body.asFormUrlEncoded
    postVals.map{ args =>
      val username = args("username").head
      Ok(views.html.username_homepage(username))
    }.getOrElse(Ok("Error"))

  }
}
