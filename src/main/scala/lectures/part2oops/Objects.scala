package lectures.part2oops

object Objects {

  // Doesnt have class level functionality("static")

  object Person { // type + its only instance
    // static/class level functionality
    val N_EYES = 2

    def canFly: Boolean = false

    // factory method
    //    def from(mother: Person, father: Person): Person = new Person("Bobbie")
    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }

  class Person(val name: String) {
    // instance-level functionality
  }
  // Companions

  def main(args: Array[String]): Unit = {

    println(Person.N_EYES)
    println(Person.canFly)

    val mary = Person
    val john = Person

    //  Scala object = SINGLETON instance
    println(s"mary==john ${mary == john}")

    val mary1 = new Person("Mary")
    val john1 = new Person("John")
    println(s"mary==john ${mary1 == john1}")

    //  val bobbie = Person.from(mary1, john1)
    val bobbie = Person(mary1, john1)

    // scala Applications = scala object with
    // def main (args: Array[String]): Unit

  }
}
