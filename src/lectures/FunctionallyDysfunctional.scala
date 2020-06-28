package lectures

object FunctionallyDysfunctional extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  //println(aFunction("Wheee", 3))

  def noParams(): Unit = {
    println("Look ma! No params")
  }

  def moreNoParams(): Int = 37

  //println(moreNoParams)

  //noParams()

  //in Scala, do not do loops! USE RECURSION INSTEAD!!!
  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  //println(aRepeatedFunction("Badger", 5))


  val colors = List("purple", "blue", "green", "indigo", "red")
  val paintItBlack = colors.map(_=="black")
  //println(paintItBlack)

  def greet(name: String, age: Int): Unit = {
    println("My name is " + name + " and I am " + age + "." )
  }

  greet("Myra", 4)

  def recursiveFactorial(product: Int, n: Int): Unit = {

    if (n==0) println(product)
    else recursiveFactorial(product * n, n-1)
  }
  recursiveFactorial(1, 5)

  def fibonacci(nth: Int): Int = {
    if (nth < 2 ) 1
    else fibonacci(nth -1) + fibonacci(nth - 2)
  }

  def isPrime(num: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true
      else num % t != 0 && isPrimeUntil(t-1)
    }
    isPrimeUntil(num/2)
  }


}
