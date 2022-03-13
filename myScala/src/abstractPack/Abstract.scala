package abstractPack
/*/A class which is declared with abstract keyword is known as abstract 
  class. An abstract class can have abstract methods and 
  non-abstract methods as well. Abstract class is used to achieve 
  abstraction. Abstraction is a process in which we hide complex 
  implementation details and show only functionality to the user.
  ***
  A class that extends an abstract class must provide implementation 
  of its all abstract methods. You can't create object of an abstract class.
  
  * */

//***abstract METHOD DOESN'T HAVE BODY
//abstract class Bike{  
//    def run()          //***abstract METHOD
//}  
//  
//class Hero extends Bike{  
//    def run(){  
//        println("running fine...")  
//    }  
//}  
//  
//object Abstract{  
//    def main(args: Array[String]){  
//        var h = new Hero()  
//        h.run()  
//    }  
//}  
//=========Constructor, Variables and Abstract Methods=====================================
abstract class Bike(a:Int){             // Creating constructor  
    var b:Int = 20                      // Creating variables  
    var c:Int = 25  
    def run()                           // Abstract method  
    def performance(){                  // Non-abstract method  
        println("Performance awesome")  
    }  
}  
  
class Hero(a:Int) extends Bike(a){  
    c = 30  
    def run(){       //// Implement of Abstract method 
        println("Running fine...")  
        println("a = "+a)  
        println("b = "+b)  
        println("c = "+c)  
    }  
}  
  
object MainObject{  
    def main(args: Array[String]){  
        var h = new Hero(10)  
        h.run()  
        h.performance()  
    }  
}  

