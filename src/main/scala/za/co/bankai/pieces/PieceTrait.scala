package za.co.bankai.pieces

trait PieceTrait {
  case class Location(x: Int,y: Int)
  case class MoveSet(availableLoc: Array[Location])

  val loc: Location
  val moveSet: MoveSet


}
