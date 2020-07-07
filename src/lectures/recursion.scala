package lectures

object recursion extends App {

  def factorial(n: Int): Int =
    if (n <=1) 1
    else n * factorial(n-1)


  def anotherFactorial(n: Int): Int = {
    def factHelper(x: Int, accumulator: Int): Int =
      if (x <= 1) accumulator
      else factHelper(x-1, x * accumulator)

    factHelper(n, 1)
  }


  def concatenateTailRec(aString: String, n: Int, accumulator: String): String =
    if (n <=0 ) accumulator
    else concatenateTailRec(aString, n-1, aString + accumulator)

  println(concatenateTailRec("Yeet", 3, ""))

  def isPrime(n: Int): Boolean = {
    def isPrimeTailRec(t: Int, isStillPrime: Boolean): Boolean = {
      if (!isStillPrime) false
      if (t <= 1) true
      else isPrimeTailRec(t - 1, n % t != 0 )

      isPrimeTailRec(n/2, true)
    }

  }
}
