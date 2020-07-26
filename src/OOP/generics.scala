package OOP

object generics extends App {

  abstract class Climber {
    def climbs: Unit = {
      println("We love sandstone!")
    }
  }


  val iceClimber: Climber = new Climber {
    override def climbs: Unit = println("Is it winter yet?")
  }

  println(iceClimber climbs)

  trait femaleClimber {
    def pees: Unit = println("Never underestimate the trouble of peeing in a climbing harness.")
  }

  class Julie extends Climber with femaleClimber {

  }

  val julie = new Julie

  julie.pees
  //this is equivalent to declaring a class IceClimber which extends Climber and overrides climbs
}
