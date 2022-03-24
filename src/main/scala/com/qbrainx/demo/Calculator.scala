package com.qbrainx.demo

object Calculator  extends App {


  def add(n1: Int, n2: Int): Int ={
    n1 + n2
  }
  def subtract(n1: Int, n2: Int): Int = {
    n1 - n2
  }
  def multiply(n1: Int, n2: Int ): Int = {
    n1*n2
  }
  def divide(n1: Double, n2: Double): Double = {

    n1/n2
  }
  def modulo(n1:Int , n2:Int) = {

    n1%n2
  }


  println("Enter the first number: ");
  val n1: Int = scala.io.StdIn.readLine.toInt
  println("Enter the second number:")
  val n2: Int = scala.io.StdIn.readLine.toInt

  println("Select the order of operation:")
  val operator = scala.io.StdIn.readLine

  operator match {

    case "add"=> println( n1 + n2)
    case "subtract"=> println(n1 - n2 )
    case "multiply"=> println(n1 * n2 )
    case "divide"=> println(n1 / n2 )
    case "modulo"=> println(n1 % n2 )
    case _=> println("Invalid operation")
  }

}
