package lectures.part2oops

object Generics extends App{
  class MyList[A] {
    // use type A
  }

  class MyMap[Key, value] 
  
  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]
  
  // Generic Methods 
  object MyList {
    def empty[A]: MyList[A] = ???
    
  }
  val emptyListOfIntegers = MyList.empty[Int]
  
  // variance problem
  
  class Animal
  class Cat extends Animal
  class Dog extends Animal
  
  //1. yes List[Cat] extends List[Animal]
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList : CovariantList[Animal] = new CovariantList[Cat]
  // animalList.add(new Dog) ???
  
  //2. No. Invariance
  class InvariantList[A]
  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]
  
//  3. Hell No
  class ContravariantList[-A]
  val contravariantList: ContravariantList[Cat] = new ContravariantList[Animal]
  
//  bounded types
  class Cage[A <: Animal](animal: A)
  val cage = new Cage(new Dog)
  
  class Car
//  val newCage = new Cage(new Car)  --> Not Allowed
  
//  expand MyList to be generic
}
