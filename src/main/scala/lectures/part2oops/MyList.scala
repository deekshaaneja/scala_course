package lectures.part2oops


abstract class MyList {

  /*
    singly linked list
    method head=1st element
    tail = remainder of the list
    isEmpty=T/F
    add(integer) = new list with this elemt added
    toString = string representation of the list
   */

  def head: Int
  def tail: MyList
  def isEmpty: Boolean
  def addElement(element: Int): MyList
  def printElements: String
  override def toString: String = "[" + printElements + "]"
  
}

  object Empty extends MyList {
    def head: Int = throw new NoSuchElementException
    def tail: MyList = throw new NoSuchElementException
    def isEmpty: Boolean = true
    def addElement(element: Int): MyList = new Cons(element, Empty)
    def printElements = ""
  }


  class Cons(h: Int, t: MyList) extends MyList {
  def head: Int = h
  def tail: MyList = t
  def isEmpty: Boolean = false
  def addElement(element: Int): MyList = new Cons(element, this)
  def printElements: String = {
      if (t.isEmpty) "" +h
      else h + " " + t.printElements
    }
  }

  object ListTest extends App {
    val list = new Cons(1, Empty)
    println(s"list head: ${list.head}")
    val list1 = new Cons(1, new Cons(2, new Cons(3, Empty)))
    println(s"tail.head : ${list1.tail.head}")
    println(s"list1: ${list1.addElement(4).head}")
    println(s"list1 empty: ${list1.isEmpty}")
    println(s"String representation: ${list1.toString}")
  }