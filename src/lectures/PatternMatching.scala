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


  val innerGoddessActivity = "face mask and read"

  val goddessActivityLog = innerGoddessActivity match {
    case "figure skating" | "roller skating" => "You are strong and graceful"
    case "rock climbing" =>  "Look at how you use your body to make it happen!!!"
    case "longboarding" | "snowboarding" => "How powerful yet how dainty"
    case "yoga" | "belly dance" => "Yeah, stretch and dance off the angst!!!"
    case _ => "Whatever you do, you are freaking awesome. Rock on, goddess!!!"

  }


  val meaningOfLife:Any = 42

  val typeOfMeaning = meaningOfLife match {
    case meaningOfLife:Int => "Because math is life"
    case meaningOfLife:String => "That's deep man."
    case meaningOfLife:Double => "It never can be easy"
    case _ => "Go with the flow, my dudes."
  }
}
