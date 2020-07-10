package lectures

object PatternMatching extends App {

  val awesomeFeminists =  List("Michelle Obama", "AOC", "RBG", "Gloria Steinam")

  val badassWoman = awesomeFeminists.map(_ + " is a badass woman")

  //badassBabes.foreach(println)
  //println(badassBabes)

  val role = List("first lady", "congresswoman", "supreme court justice", "author")

  //println(awesomeFeminists.sorted)
  //println(awesomeFeminists.reverse)

  println(awesomeFeminists.zip(role))

  val dayOfWeek = "Friday"

  val typeOfDay = dayOfWeek match {
    case "Monday" => "Manic Monday"
    case "Friday" => "Ice skating day!!!"
  }

  println(typeOfDay)

}
