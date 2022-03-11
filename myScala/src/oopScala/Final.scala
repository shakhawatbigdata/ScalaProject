package oopScala

/*Final is a keyword, which is used to prevent inheritance of 
super class members into derived class.*/

class Vehicle{  
     final val speed:Int = 60  
}  
class Bike extends Vehicle{  
   //override val speed:Int = 100  
    def show(){  
        println(speed)  
    }  
}  
  
object Final{  
    def main(args:Array[String]){  
        var b = new Bike()  
        b.show()  
    }  
}  