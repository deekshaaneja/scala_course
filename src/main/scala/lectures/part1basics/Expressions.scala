package lectures.part1basics

object Expressions extends App{

  val x = 1+2 //Expressions
  println(x)
  println(2+3*4) // + - * / & | ^ << >> >>>
  println(1==x) // == != >= <=
  println(!(1==x))

  var aVariable = 2
  aVariable +=3
  println(aVariable)

  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)
  println(1+3)
  println(if(aCondition) 5 else 3)

  var i=0
  val aWhile = while (i<10){
    println("value is: "+ i)
    i+=1

  }

  val aWeirdValue = (aVariable=3) //Unit===void
  println("aWeirdValue: "+aWeirdValue + aWhile)

  // side effects: println, while, reassigning

  val aCodeBlock = {
    val y = 2
    val z = y+1
    if (z>2) "hello" else "goodbye"
  }
  println("aCodeBlock: "+aCodeBlock)


}
