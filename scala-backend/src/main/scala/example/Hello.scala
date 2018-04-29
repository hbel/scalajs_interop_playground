package scala.backend

import scala.scalajs.js.annotation._

trait Apartment {
  val apartment : Option[String]
}

@JSExportAll
@JSExportTopLevel("Person")
case class Person (
  name: String,
  surname: String,
  address: Address ) {}

@JSExportAll    
@JSExportTopLevel("Address")
case class Address (
  street: String, 
  city: String, 
  zipCode: Long, 
  apartment: Option[String]) extends Apartment {
}