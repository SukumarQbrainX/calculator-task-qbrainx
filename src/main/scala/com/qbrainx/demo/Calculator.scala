package com.qbrainx.demo


import java.lang.Math

object Calculator  extends App {


  def add(a: Int, b: Int): Int = {
    if (a < 0 || b < 0) 0
    val result = a + b
    if (result < 0) 0
    result
  }

  def subtract(a: Int, b: Int): Int = {
    if (a < 0 || b < 0) 0
    val result = a - b
    if (result < 0) 0
    result
  }

  def multiply(a: Int, b: Int): Int = {
    if (a < 0 || b < 0) 0
    val result = a * b
    if (result < 0) 0
    result
  }

  def divide(a: Double, b: Double): Double = {
    if (a < 0 || b < 0) 0
    val result = a / b
    if (result < 0) 0
    result
  }

  def modulo(a: Int, b: Int): Int = {
    if (a < 0 || b < 0) 0
    val result = a % b
    if (result < 0) 0
    result
  }

  def log(a:Double ) ={

  Math.log(a)

  }
def percentage(n1:Double,n2:Double)={
  if(n1<0 || n2<0) 0
  val result = ((100 / n2) * n1)
  if (result < 0) 0
  result
}

}