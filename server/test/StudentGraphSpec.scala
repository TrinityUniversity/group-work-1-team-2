import org.scalatestplus.play._
import models._

class StudentGraphSpec extends PlaySpec {
    "StudentGraphSpec" must {
        "return friends for user" in {
            StudentGraph.getFriends("Paul Abila") mustBe Array[String]("bmalik","mbarton","dclaesse","hfulton","khardee","emiller6","cweisenb")
        }
        "return no friends for invalid user" in {
            StudentGraph.getFriends("mark lewis") mustBe Array[String]("No friends")
        }
        "return no friends for no user" in {
            StudentGraph.getFriends("") mustBe Array[String]("No friends")
        }
    }
}