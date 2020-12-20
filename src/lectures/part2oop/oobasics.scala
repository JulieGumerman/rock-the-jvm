package lectures.part2oop

object oobasics extends App{
  val splat = new Person("Splat", age=44)
  println(splat.x)
  splat.greet("John")
}
//constructor
class Person(val name: String, val age: Int) {
  //body of class
  val x = "I am not you."
  println("unique individual")
  def greet(name: String): Unit = println(s"${this.name} says, 'hi $name''")
}

//class parameters are NOT FIELDS like in other languages