package lectures

object Expressions extends App{


  val x = 1 + 3
  println(x)

  println(!(x==3))

  val blackDeath: Int = 1348

  val blackDeathStatement = if (blackDeath == 1348) "It was rough" else "At least it wasn't 2020"

  println(blackDeathStatement)


  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hey" else "boo"
  }

  println(aCodeBlock)
}
