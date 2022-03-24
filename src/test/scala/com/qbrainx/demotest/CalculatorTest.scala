package com.qbrainx.demotest

import munit.FunSuite
import com.qbrainx.demo._


class CalculatorTest extends FunSuite{



  test("Addition ==== TEST CASE PASSED ") {
    assert(Calculator.add(5 , 6)== 11)
    assert(Calculator.add(-5 , 6) == 1)
    assert(Calculator.add(-5 , (-6)) == -11)
    assert(Calculator.add(5 , (-6)) == -1)
    assert(Calculator.add(-5 , 0) == -5)
  }

  test("Subtraction  ==== TEST CASE PASSED ") {
    assert(Calculator.subtract(10,-20) == -10 )
    assert(Calculator.subtract(123456789 , 210987654) == -8.7530865E7)

  }


  test("Multiplication - equals  ==== TEST CASE PASSED "){
    assert(Calculator.multiply(20,20)== 400)
    assert(Calculator.multiply(2,0)==0)
    assert(Calculator.multiply(0,2)==0)
    assert(Calculator.multiply(3,-2)== -6)

  }

  test("Divide - equals   ==== TEST CASE PASSED "){
    assert(Calculator.divide(20,10) == 2)
    assert(Calculator.divide(440,2)==220)
    assert(Calculator.divide(1500 , 2000) == 0.75)
    assert(Calculator.divide(0 , 200) == 0)
    assert(Calculator.divide(-3.123 , 5) == -0.6246)
    assert(Calculator.divide(4.21 , 3) == 1.4033333333333333)
    assert(Calculator.divide(10 , 3.123) == 3.202049311559398)




  }


  test("Modulo - equals  ==== TEST CASE PASSED  "){
    assert(Calculator.modulo(9,2) == 1)
    assert(Calculator.modulo(201,2)==1)
  }

}
