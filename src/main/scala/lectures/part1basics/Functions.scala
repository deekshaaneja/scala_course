package lectures.part1basics

object Functions extends App{
  def aFunction(a: String, b: Int): String = {
    a+" "+b
  }
  println(aFunction("hello", 3))

  def aParameterlessFunction(): Int = 42

  println(aParameterlessFunction())
//  println(aParameterlessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n==1) aString
    else aString+aRepeatedFunction(aString, n-1)
  }
  println(aRepeatedFunction("hello", 3))

  // WHEN YOU NEED LOOPS, USE RECURSION

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  println(aFunctionWithSideEffects("abc"))

  def aBigFUnctions(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a+b

    aSmallerFunction(n, n-1)
  }

  println(aBigFUnctions(3))


  def aGreeting(name: String, age: Int): Unit = {
    println(s"Hi my name is $name and I am $age years old")
  }
  aGreeting("abc", 7)

  def aFactorial(n: Int): Int = {
    if (n==1) 1 else n*aFactorial(n-1)

  }
  println(aFactorial(5))

  def aFibonacci(n: Int): Int = {
    if (Set(1, 2).contains(n)) 1 else aFibonacci(n-1)+aFibonacci(n-2)
  }
//  println(aFibonacci(2))
  println(s"fib %s".format(aFibonacci(3)))

  def isPrimeNumber(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t<=1) true
      else n%t !=0 && isPrimeUntil(t-1)
    }
    isPrimeUntil(n/2)
  }

  println(isPrimeNumber(37))
}

