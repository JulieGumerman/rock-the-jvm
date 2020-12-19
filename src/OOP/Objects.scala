package OOP

object Objects extends App {

  //SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY ("static")

  object person {
    val N_EYES = 2
    def canFly: Boolean = false
    //static/class-level functionality

    //factory method //sometimes called "apply"
    def from(mother: Person, father: Person): person = new person
  }

  class person {
    //instance-level functionality
  }
  //COMPANIONS

  println(person.N_EYES)

  //scala singleton
  val ruth =  new person
  val esther = new person
  println("SINGLETONS?", ruth == esther)

  //scala application is a Scala object with
  //def main(args: Array[String]): Unit


}
