package lectures.part1basics

import java.text.MessageFormat

object ValuesVariablesTypes extends App {
 // immutable, Type is Optional
  val x: Int = 42
//  val x = 42

  val aString: String = "Hello";

  val aBoolean: Boolean = false
  val aChar: Char = 'a';
  val aInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 777777777777L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14
  println(aDouble + " " + aFloat)

  var aVariable = 4.0
  aVariable = 5 //side-effects
  println(aVariable)

}
