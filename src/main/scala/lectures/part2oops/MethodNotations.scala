package lectures.part2oops
import scala.language.postfixOps


object MethodNotations extends App{

  class Person(val name: String, favouriteMovie: String, val age: Int=0){
    def likes(movie: String): Boolean={
      movie==favouriteMovie
    }
    def hangOutWith(person:Person): String  = s"${this.name} is hanging out with ${person.name}"
    def +(person:Person): String  = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"$name, what the heck"
    def isAlive: Boolean = true
    def apply(): String = s"Hi, my name is $name and I like $favouriteMovie"
//    def abc(): String = s"Hi, my name is $name and I like $favouriteMovie abc"

    def +(string: String): Person = {
      new Person(s"${this.name}($string)", this.favouriteMovie)
    }

    def unary_+ : Person ={
      new Person(this.name, this.favouriteMovie, this.age+1)
    }

    def learns(thing: String): Unit ={
      println(s"$name is learning $thing")
    }

    def learnsScala ={
      this learns "scala"
    }

    def apply(int: Int): Unit = {
      println(s"$name watched $favouriteMovie $int times")
    }
  }

    val mary = new Person("Mary", "Inception")

    println(mary.likes("Inception"))
    println(mary likes "Inception")
    // Infix Notation = operator notation

    // "operators in scala"
    val tom = new Person("Tom", "Fight Club")
    println(mary hangOutWith tom)
    println(mary.+(tom))
    println(1.+(2))

    // All operators are Methods
    // Akka actors have ! ?

    // prefix notation

    val x = -1
    val y = 1.unary_-
    println(s"x and y ${x==y}")
    println(!mary)
    println(mary.unary_!)

    // unary _prefix works with only a few operators - + ~ !

    // Postfix Notation
    println(mary.isAlive)
    println(mary isAlive)

    println(mary.apply())
    println(mary())


    // Exercises
    println((mary + "the Rockstar").apply())
    println((+mary).age)
    println(mary learnsScala)
    println(mary(10))
  }
