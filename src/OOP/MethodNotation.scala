package OOP

object MethodNotation extends App {

  class Person (val name: String, favoriteMovie: String) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def hangOutWith(person: Person): String = s"${this.name} hangs out with ${person.name}"
  }

  val bob = new Person("Bob", "The Little Mermaid")
  val mary = new Person("Mary", "EuroTrip")
  
  println(mary.likes("EuroTrip"))
  println(mary likes "EuroTrip") //infix notation = operator notation
  println(mary.hangOutWith(bob))


}
