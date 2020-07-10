package lectures

object DefaultArgs extends App {

  def trFact (n: Int, acc: Int): Int = {
    if (n <= 1) acc
    else trFact(n -1, n * acc)

  }

  val fact5= trFact(5, 1)

  println(fact5)
}
