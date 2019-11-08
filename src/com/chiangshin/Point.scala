package com.chiangshin

class Point(xc: Int, yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx:Int, dy:Int): Unit ={
    x = x + dx
    y = y + dy
    println(s"x = ${x}")
    println(s"y = ${y}")
  }

}
