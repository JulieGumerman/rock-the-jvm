package OOP

object generics extends App {

  //variance problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  //1, yes, List[Cat] extends List[Animal] = covariance
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]

  //2, no = invariance
  class InvariantList[A]
  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

  //3, hell no = contravariance
  class Trainer[-A]
  val contravariantList: Trainer[Cat] = new Trainer[Animal]

  //bounded types
  class Cage[A <: Animal](animal: A)
  val cage = new Cage(new Dog)

  abstract class Climber {
    def climbs: Unit = {
      println("We love sandstone!")
    }

    class MyMap[Key, Value]

    class MyList[A]

    val listOfIntegers = new MyList[Int]
    val listOfStrings = new MyList[String]


  }


  val iceClimber: Climber = new Climber {
    override def climbs: Unit = println("Is it winter yet?")
  }

  println(iceClimber climbs)

  trait femaleClimber {

  }

  class Julie extends Climber with femaleClimber {

  }

  val julie = new Julie


  //this is equivalent to declaring a class IceClimber which extends Climber and overrides climbs
}
