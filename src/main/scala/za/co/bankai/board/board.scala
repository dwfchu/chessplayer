package za.co.bankai.board

class Board(width: Int, height: Int) {

  val xRange = getXRange(width)
  val yRange = getYRange(height)

  def getXRange(range: Int) = {
    val letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("")
    letters.take(range)
  }

  def getYRange(range: Int) = 1 to range

}
