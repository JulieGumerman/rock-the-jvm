package OOP

object generics extends App {

  abstract class Climber {
    def climbs: Unit
  }


  val iceClimber: Climber = new Climber {
    override def climbs: Unit = println("Is it winter yet?")
  }

  //this is equivalent to declaring a class IceClimber which extends Climber and overrides climbs
}
