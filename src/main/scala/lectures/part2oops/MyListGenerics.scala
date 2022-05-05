package lectures.part2oops
import math.Numeric.Implicits.infixNumericOps
import math.Fractional.Implicits.infixFractionalOps
import math.Integral.Implicits.infixIntegralOps

abstract class MyListGenerics[+A] {

  /*
    singly linked list
    method head=1st element
    tail = remainder of the list
    isEmpty=T/F
    add(integer) = new list with this elemt added
    toString = string representation of the list
   */

  def head: A
  def tail: MyListGenerics[A]
  def isEmpty: Boolean
  def addElement[B >: A](element: B): MyListGenerics[B]
  def printElements: String
  override def toString: String = "[" + printElements + "]"
  
}

  object EmptyA extends MyListGenerics[Nothing] {
    def head: Nothing = throw new NoSuchElementException
    def tail: MyListGenerics[Nothing] = throw new NoSuchElementException
    def isEmpty: Boolean = true
    def addElement[B >: Nothing](element: B): MyListGenerics[B] = new ConsA(element, EmptyA)
    def printElements = ""
  }


  class ConsA[+A](h: A, t: MyListGenerics[A]) extends MyListGenerics[A] {
  def head: A = h
  def tail: MyListGenerics[A] = t
  def isEmpty: Boolean = false
  def addElement[B >: A](element: A): MyListGenerics[B] = new ConsA(element, this)
  def printElements: String = {
      if (t.isEmpty) "" +h
      else String.valueOf(h) + " " + t.printElements
    }
  }

  object ListTest1 extends App {
    val listOfIntegers: MyListGenerics[Int] = new ConsA(1, new ConsA(2, new ConsA(3, EmptyA)))
    val listOfStrings: MyListGenerics[String] = new ConsA("Hello", new ConsA("Scala", new ConsA("!", EmptyA)))
    
    println(s"List of Integers: ${listOfIntegers}")
    println(s"List of Strings: ${listOfStrings}")
  }