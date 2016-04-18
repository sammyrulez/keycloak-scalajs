package tutorial.webapp

import scala.scalajs.js.JSApp
import org.scalajs.dom
import dom.document
import keycloak.Keycloak

object TutorialApp extends JSApp {
  def main(): Unit = {
    appendPar(document.body, "Hello World")
  }
  def appendPar(targetNode: dom.Node, text: String): Unit = {
    val keycloakConfig = Map(
      "url"-> "http://localhost:8080/auth",
      "realm"-> "master",
      "clientId"-> "frontend",
      "credentials"-> Map(
        "secret"-> "ca8b4ea7-2a69-4510-ab20-1b98bfff6f58"
        )
      )
    var keycloak = new Keycloak(keycloakConfig)
    keycloak.init(Map(
      "onLoad" -> "login-required"
    )).success({
      val parNode = document.createElement("p")
      val textNode = document.createTextNode(text)
      parNode.appendChild(textNode)
      targetNode.appendChild(parNode)
    })

  }
}