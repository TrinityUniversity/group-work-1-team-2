import org.scalatestplus.play._
import org.scalatestplus.play.guice._

class UsernameSpec extends PlaySpec with GuiceOneServerPerSuite with OneBrowserPerSuite with HtmlUnitFactory{
    "UsernameSpec" must {
        "login and enter color" in {
            go to s"http://localhost:$port"
            find(cssSelector("h2")).isEmpty mustBe false
            find(cssSelector("h2")).foreach(e => e.text mustBe "Play and Scala.js share a same message")

            click on "name"
            textField("name").value = "Thomas Lauerman"
            click on "color"
            textField("color").value = "Yellow"
            submit()
        }
    }
}