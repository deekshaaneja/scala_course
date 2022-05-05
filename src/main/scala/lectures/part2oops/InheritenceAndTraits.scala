package lectures.part2oops

object InheritenceAndTraits extends App{

  // Single Class inheritence
class Animal{
  protected def eat=println("nomnom")
}

class Cat extends Animal{
  def crunch = {
    eat
    println("crunch crunch")
  }
}
val cat = new  Cat
cat.crunch


// constructors

class Person(name: String, age: Int){
  def this(name: String) = this(name, 0)
}
class Adult(name: String, age: Int, idCard: String) extends Person(name, age)
class Adult1(name: String, age: Int, idCard: String) extends Person(name)


// overriding

class Dog extends Animal{
  override def eat= println("crunch. crunch")
}
val dog = new Dog
dog.eat

}
