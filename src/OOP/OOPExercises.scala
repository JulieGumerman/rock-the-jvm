package OOP

object OOPExercises extends App {


  class Person (val name: String, val favMovie: String, val age: Int) {

    def likes (movie: String): Boolean = movie == favMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(nickname: String): Person = new Person(s"${name}, ($nickname)", favMovie, age)
    def learns (topic: String): String = s"${name} learns ${topic}."

    def unary_! : String = s"${name}, what the heck!?!?!"
    def unary_+ : Person = new Person (name, favMovie, age + 1)

    def isAlive: Boolean = true
    def apply(): String = s"Hi, my name is ${name} and I like ${favMovie}"

    def learnsScala = this learns "Scala"
  }

  val julz = new Person("Julie", "Return of the Jedi", 37)

  println((julz + "The Textbook").apply())
  println((+julz).age)
  println(julz learnsScala)

}
