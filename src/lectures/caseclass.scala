package lectures

object caseclass extends App {
  case class Amount(value: Double, currency: String)
  val twoDollars = Amount(2, "USD")
  val anotherTwoDollars = Amount(2, "USD")

  println(twoDollars == anotherTwoDollars)

//  def checkIfDollar(amount: Amount): Boolean =
//    amount.currency match {
//      case "USD" => println("is a dollar"): Boolean;
//      case _ => println("not a dollar") : Boolean;
//    }
}
