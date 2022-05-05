package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App{

  def factorial(n: Int): Int={
    if (n==1) 1 else n*factorial(n-1)
  }

  def anotherFactorial(n: Int): BigInt={
    def factorialHelper(x: Int, accumulator: BigInt): BigInt={
      if (x<=1) accumulator
      else factorialHelper(x-1, x*accumulator)

    }
    factorialHelper(n, 1) //TAIL RECURSION
  }

//  println(s"factorial 5000: "+ anotherFactorial(5000))

  def concatenationStr(n: Int, s:String): String = {
    @tailrec
    def concatenateHelper(num: Int, acc:String): String= {
      if (num==1) s+acc
      else concatenateHelper(num-1, acc+s)
    }
    concatenateHelper(n, "")
  }
  println(concatenationStr(3, "hello"))


  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeRec(x: Int, cnt: Int): Boolean={
      if (cnt==1) true
      else if (x%cnt==0) false
      else isPrimeRec(x, cnt-1)
    }
    isPrimeRec(n, n/2)
  }
  println(isPrime(2003))
  println(isPrime(629))

  def Fibonacci(n: Int): Int = {
    def FibHelper(x: Int, last: Int, nextToLast: Int): Int = {
      if (x >= n) last
      else FibHelper(x + 1, last + nextToLast, last)
    }

    if (n <= 2) 1
    else FibHelper(2, 1, 1)
    }

  println(Fibonacci(5))
  println(Fibonacci(8))
}
