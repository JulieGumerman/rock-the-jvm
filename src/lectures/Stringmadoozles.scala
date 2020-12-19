package lectures

object Stringmadoozles extends App {
  val str: String = "I thought tonight was Industrial night. I was wrong. Now I am sad."
  println(str.charAt(0))
  println(str.substring(7,11))
  println("wheeeee" +: str +: "Plus scala is frustrating")
}
