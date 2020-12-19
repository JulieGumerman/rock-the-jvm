package exercises

object AnonymousClasses extends App{

  abstract class Animal {
    def eat: Unit = println("boop")
  }

  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("heeeheeheeheehee")
  }
}
