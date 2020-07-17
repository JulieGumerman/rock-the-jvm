package lectures

object listymclisterson extends App {

  val gear = "ice axe" :: "gummy bears" :: "microspikes" :: "wool socks" :: "hat" :: Nil


  val sewingSupplies = List("needle", "thread", "fabric", "fabric marker", "scissors")

  println(gear)

  println(gear.head)

  val stuff = List(sewingSupplies, gear).flatten
  println(stuff)
  println(stuff.size)


  for (tool <- sewingSupplies) println(tool)
}
