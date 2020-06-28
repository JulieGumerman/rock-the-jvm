package lectures

object FunctionallyDysfunctional extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("Wheee", 3))

  def noParams(): Unit = {
    println("Look ma! No params")
  }

  def moreNoParams(): Int = 37

  println(moreNoParams)

  noParams()

  //in Scala, do not do loops! USE RECURSION INSTEAD!!!
  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("Badger", 5))


  val colors = List("purple", "blue", "green", "indigo", "red")
  val paintItBlack = colors.map(_=="black")
  println(paintItBlack)
}
