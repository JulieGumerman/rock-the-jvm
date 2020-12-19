package exercises

object ContravarianceWhee {
  //known
  val list: List[Int] = List(1, 2, 3)

  class ClimbingGear
  class QuickDraw(brand: String) extends ClimbingGear

  val petzl = new QuickDraw("Petzl")
  val bd = new QuickDraw("Black Diamond")
  val camp = new QuickDraw("Camp")
  //if QuickDraw <: ClimbingGear, does List[QuickDraw] <: List[ClimbingGear]
  //^^^ the variance question

  //if yes,
  // --> called covariant
  // --> Item in [ ] starts with a +
  val draws: List[ClimbingGear] = List(petzl, bd, camp)

  //if no,
  // --> called invariant
  class MyInvariantList[T]
  //val draws: MyInvariantList[ClimbingGear] = new MyInvariantList[QuickDraw]
  //the above code will not compile

  //not just no, but hell no: contravariance

  def main(args: Array[String]): Unit = {

  }
}
