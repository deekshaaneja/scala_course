package lectures.part2oops

object OOBasics extends App {
  val person = new Person("John", 26)
  println(person.age)
  person.greet("Dan")
  person.greet()
  val author = new Writer("Charles", "Dickens", 1812)
  val imposter = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectation", 1861, author)
  println(s"novel authorAge: ${novel.authorAge}")
  println(s"is novel written by ${author.fullname()}: ${novel.isWrittenBy(author)}")
  println(s"is novel written by ${imposter.fullname()}: ${novel.isWrittenBy(imposter)}")

  val counter=new Counter
  counter.incrementCount.print
  counter.incrementCount.incrementCount.incrementCount.print
  counter.incrementCount(10).print


  // Constructor
  class Person(name: String, val age: Int) {
    val x = 2
    println(1 + 3)

    def greet(name: String): Unit = {
      println(s"${this.name} says: Hi, $name")
    }

    // overloading
    def greet(): Unit = {
      println(s"Hi, I am $name")
    }

    // multiple constructors
    def this(name: String) = this(name, 0)

    def this() = this("John Doe")
  }
    /* Novel and writer class */

    class Writer(firstName: String, surName: String, val year: Int) {
      def fullname() = {
        this.firstName + " " + this.surName
      }

    }

    class Novel(name: String, yearOfRelease: Int, author: Writer) {
      def authorAge = {
        yearOfRelease - author.year
      }

      def isWrittenBy(author: Writer) = {
        author == this.author
      }

      def copy(newYear: Int): Novel = {
        new Novel(this.name, System.nanoTime().toInt, author)
      }
    }

    class Counter(value: Int=0) {

      def currentCount() = {
        this.value
      }

      def incrementCount = {
        new Counter(value+1) //immutability
      }

      def decrementCount=new Counter(value-1)

      def incrementCount(n: Int): Counter={
        if (n<=0) this
        else incrementCount.incrementCount(n-1)
      }
      def decrementCount(n: Int): Counter={
       if (n<=0) this
       else decrementCount.decrementCount(n-1)
      }

      def print = println(s"value $value")
    }

  }
