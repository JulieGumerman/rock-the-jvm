package OOP

object OOPbasics extends App {

  val person = new Person("Julie", 37)
  println(person.name)
  println(person.greet("Your mom"))

  val MayaAngelou = new Author("Maya", "Angelou", 1928)
  val CagedBird = new Novel("I Know Why The Caged Bird Sings", author = MayaAngelou, 1969)


  println(CagedBird.authorAge())
  println(CagedBird.isWrittenBy(MayaAngelou))
  println(MayaAngelou.fullName())
}


//how to write a class
//constructor
class Person( val name: String, val age: Int) {
//body
  def greet(greeter_name: String): String = s"$greeter_name says: Hi, $name"
}


//Exercise 1: Author and Novel classes

class Author(val firstName: String, val lastName: String, val birthYear: Int) {

  def fullName(): Unit = {
    return firstName + lastName
  }
  def about(): Unit = {
    return firstName + " " + lastName + " was born in " + birthYear
  }
}


class Novel(title: String, author: Author, publishYear: Int) {

  def authorAge(): Int = {
    return publishYear - author.birthYear
  }

  def isWrittenBy(author: Author) = author == this.author
}

class Counter (value: Int) {

}


