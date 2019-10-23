package com.chiangshin

object HelloWorld {

  def forTest1() = {
    for(t <-  1 to 10;s <- 1 to t){
      print(t + "*" + s + "=" + (t*s) +" ")
      if (s == t){
        println()
      }
    }
  }

  def forTest2() = {
    val arr = List(1,4,"3333",13,4234)
    for (i <- arr){
      println(i)
    }
  }

  def forTest3() = {
    val arr = List(1,4,"3333",13,4234)
    for (i <- arr
         if i.isInstanceOf[Int] ){
      println(i)
    }
  }

  def forTest4() = {
    var  x = 0
    val arr = List(1,4,3,4,1.1,156,156,4816,812,12,151,2,1112,15,1,2,1,51,32,15,64,9,2,1,321,5,15,4234)
    var retVal = for{x <- arr
                         if x < 12
    }yield x

    for ( a <- retVal){
      println(a)
    }
  }

  def m(x:Int)  = {x + 2}
  var fd = (x:Int) =>{}

  /**
    * 可变参数
    * @param n
    * @param xs
    */
  def fun1(n:Int,xs:Int*)= {
      println(n)
      for (i <- xs){
        println(i)
      }
  }

  /**
    *  可指定参数   fun2(b=1,a=33)
    * @param a
    * @param b
    */
  def fun2(a:Int,b:Int): Unit ={
    println(a)
    println(b)
  }

  /**
    * 递归
    * @param n
    * @return
    */
  def fun3(n:Int):Int = {
    if (n <= 1)
      1
    else
      n * fun3(n-1)
  }

  /**
    * 默认参数
    * fun4(7)   -> 17
    * fun4(7,3) -> 10
    *
    * @param x
    * @param y
    */
  def fun4(x:Int,y:Int=10) = {
    println(x + y)
  }

  // 函数 f 和 值 v 作为参数，而函数 f 又调用了参数 v
  def apply(f: Int => String, v: Int) = f(v)

  def layout[sA](x: sA) = "[" + x.toString() + "]"

  def main(args: Array[String]): Unit = {
    fun4(7)
    fun4(7,3)
  }


}