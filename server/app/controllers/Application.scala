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
}
