package lectures

object PatternMatching extends App {

  val awesomeFeminists =  List("Michelle Obama", "AOC", "RBG", "Gloria Steinam")

  val badassBabes = awesomeFeminists.map(_ + " is a Badass babe")

  //badassBabes.foreach(println)
  //println(badassBabes)

  val role = List("first lady", "congresswoman", "supreme court justice", "author")

  //println(awesomeFeminists.sorted)
  //println(awesomeFeminists.reverse)

  println(awesomeFeminists.zip(role))

}
