package OOP

object MethodNotation extends App {

  class Person (val name: String, favoriteMovie: String) {
    def likes(movie: String): Boolean = movie == favoriteMovie
  }

  val mary = new Person("Mary", "EuroTrip")
  println(mary.likes("EuroTrip"))
  println(mary likes "EuroTrip") //infix notation = operator notation

}
