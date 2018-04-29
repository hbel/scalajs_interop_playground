import scala.scalajs.js.JSApp

import scala.scalajs.js.annotation._
import scala.scalajs.js.JSConverters._
import scala.backend._

@JSExportAll
trait MaybeApartment extends Apartment
{
  def maybeApartment = apartment.orUndefined
}

@JSExportAll
@JSExportTopLevel("BackendForFrontend")
class BackendForFrontend {
  def getPerson() : Person = Person("Donald", "Trump", getAddress)
  def getAddress() = new Address("White House 1", "Washington DC", 12345, Some("1A")) with MaybeApartment
}