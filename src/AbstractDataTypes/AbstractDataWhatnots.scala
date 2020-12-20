package AbstractDataTypes

object AbstractDataWhatnots extends App {
  //abstract
  abstract class CraftProject {
    val projectType: String
    def make: Unit
  }

  trait HotGlue {
    def use: Unit = println("uses hot glue")
  }

  abstract class makeWreath extends CraftProject with HotGlue {
    val activityType: String = "Make a wreath to hang on your door."

    def createIt(supplies: String): Unit = s"I am using ${supplies}"
  }

}
