package OOP

object InheritanceAndTraits extends App {


  class Board {
    def ride = println("Life is good on a board")
    val wheels = "Four"
  }

  class Snowboard extends Board {
    def bestDay = {
      ride
      println("And it's also cold and snowy out")
    }
    override val wheels =  "None!!!!!"
  }

  class Longboard extends Board {
    override def ride = println("Meh. I am so clumsy")

  }

  val neverSummer = new Snowboard
  val stupidBody = new Longboard
  neverSummer.bestDay
  println(neverSummer.wheels)
  stupidBody.ride

  class Socks (color: String, material: String) {
    def description = {
      println(s"These ${color} socks are made of ${material}. They are stinky but necessary.")
    }
  }

  class SnowboardSocks (color: String, material: String, sport: String) extends Socks (color, material) {

  }

}
