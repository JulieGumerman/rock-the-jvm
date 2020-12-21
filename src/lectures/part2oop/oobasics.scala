package lectures.part2oop

object oobasics extends App{
  val splat = new Person("Splat", age=44)
  println(splat.x)
  splat.greet("John")

  val fyodor = new Author(firstname = "Fyodor", lastname="Dostoevsky", yob=1821)
  fyodor.fullname()
  val candp = new Novel("Crime and Punishment", 1866, fyodor)
  candp.authorage()
  val newCandP = candp.copy(1866)
  println("new Copy of CandP", newCandP.name, newCandP.yearpublished)
}
//constructor
class Person(val name: String, val age: Int) {
  //body of class
  val x = "I am not you."
  println("unique individual")
  def greet(name: String): Unit = println(s"${this.name} says, 'hi $name''")
}

//class parameters are NOT FIELDS like in other languages

//novel and writer class
//Writer: firstname, surname, year of birth, method: full name
class Author(val firstname: String, val lastname: String, val yob: Integer) {
  def fullname(): String = {
    firstname + " " + lastname
  }
}
//novel: name, year, author (as in the class), method: author age
class Novel(val name: String, val yearpublished: Int, val author: Author) {
  def authorage(): Unit = {
    val authorfullname = author.fullname();
    println("author fullname", authorfullname)
    println(s"${author.fullname} was ${this.yearpublished - author.yob} when this was published")
  }
  def copy(newYearPublished: Int): Novel = new Novel(name, newYearPublished, author)

}