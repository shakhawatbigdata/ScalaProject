package abstractPack
/*A trait is like an interface with a partial implementation. 
In scala, trait is a collection of abstract and non-abstract methods.
You can create trait that can have all abstract methods or 
some abstract and some non-abstract methods.
*****
* Any variable which is declared by using val or var 
* but not initialized is considered abstract.
*/

//trait Printable{  
//    def print()  
//}  
//  
//class A4 extends Printable{  
//    def print(){  
//        println("Hello")  
//    }  
//}  
//  
//object Trait{  
//    def main(args:Array[String]){  
//        var a = new A4()  
//        a.print()  
//    }  
//}  

//====If a class extends a trait but does not implement the members 
//declared in that trait, it must be declared abstract.=========================================
/*

trait Printable{  
    def print()  
}  
  
abstract class A4 extends Printable{            // Must declared as abstract class  
   def printA4(){  
       println("Hello, this is A4 Sheet")  
   }  
} 
*/

//======Implementing Multiple Traits in a Class==========================================

//trait Printable{  
//    def print()  
//}  
//  
//trait Showable{  
//   def show()  
//}  
//  
//class A6 extends Printable with Showable{  
//    def print(){  
//        println("This is printable")  
//    }  
//    def show(){  
//        println("This is showable");  
//    }  
//}  
//  
//object Trait{  
//    def main(args:Array[String]){  
//        var a = new A6()  
//        a.print()  
//        a.show()  
//    }  
//}
//=======Trait having abstract and non-abstract methods============================================

trait Printable{  
    def print()         // Abstract method  
    def show(){         // Non-abstract method  
        println("This is show method")  
    }  
}  
  
class A6 extends Printable{  
    def print(){  
        println("This is print method")  
    }  
}  
  
object Trait{  
    def main(args:Array[String]){  
        var a = new A6()  
        a.print()  
        a.show()  
    }  
}  





