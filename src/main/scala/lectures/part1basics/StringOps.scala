package lectures.part1basics

object StringOps extends App{

  val str: String = "hello I am learning Scala"
  def dummy(s: String): String = {
    s+"abc"
  }
  println(str.charAt(2))
  println(s"find char at 2: ${dummy("vbd")}")
}
