package keycloak

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  * Created by sam on 15/04/16.
  */
@JSName("Keycloak")
@js.native
trait Keycloak extends js.Object {
  def apply(config: js.Any): Keycloak = js.native
  def init(handler: js.Any): Keycloak = js.native
  def success(handler: js.Any): Keycloak = js.native

}


