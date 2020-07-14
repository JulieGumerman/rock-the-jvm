package lectures

object tuples extends App{

  val personInfo =("Julie", "Gumerman", 37, "F")
  val skating = ("figure skating", "rollerskating", "snowboarding", "longboarding", "skateboarding")
  skating.productIterator.foreach{i => println("Activity: " + i)}

}
