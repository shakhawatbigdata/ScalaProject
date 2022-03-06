package oopScala

//class Student {
//  var id:Int =0;                    // All fields must be initialized 
//  var name:String =null;
//}
//
//  object FunctionsHigherOrder  {
//  def main(args:Array[String]){
//       var s = new Student()               // Creating an object  
//        println(s.id+" "+s.name); 
//  }
//  }

//=====Example of Class===========================================

//class Student (id:Int,name:String){  // Primary constructor
//  def show(){
//    println(id+" "+name)
//  }
//}
//
//  object FunctionsHigherOrder  {
//  def main(args:Array[String]){
//       var s = new Student(100,"Martin")   // Passing values to constructor    
//       s.show()                // Calling a function by using an obj 
//  }
//  }
  
//====class that maintains the records of students============================================

//class Student (id:Int,name:String){  // Primary constructor
//  def getRecord(){
//    println(id+" "+name)
//  }
//}
//
//  object FunctionsHigherOrder  {
//  def main(args:Array[String]){
//       var student1 = new Student(101,"Martin");
//       var student2 = new Student(102,"Roin");
//       student1.getRecord();
//       student2.getRecord();
       
//  }
//  }

//====Anonymous object===========================================

class Arithmetic{ 
  def add(a:Int, b:Int){
    var add = a+b;
    println("sum = "+add);
  }
}

  object FunctionsHigherOrder  {
  def main(args:Array[String]){
       new Arithmetic().add(10, 10);
  }
  }
  
 //==== Scala Singleton Object Example=======================
 //// object which is declared by using object keyword instead by class

//    object Singleton{  
//        def main(args:Array[String]){  
//            SingletonObject.hello()         // No need to create object.  
//        }  
//    }  
//      
//      
//    object SingletonObject{  
//        def hello(){  
//            println("Hello, This is Singleton Object")  
//        }  
//    }
    
 //=====Scala Companion Object====================================   
  
//      class ComapanionClass{  
//        def hello(){  
//            println("Hello, this is Companion Class.")  
//        }  
//    }  
//    object CompanoinObject{  
//        def main(args:Array[String]){  
//            new ComapanionClass().hello()  
//            println("And this is Companion Object.")  
//        }  
//    }  
  //====Scala Case Class Example=========================================
  
  case class CaseClass(a:Int, b:Int)  
  
  object MainObject{  
      def main(args:Array[String]){  
          var c = CaseClass(10,10)       // Creating object of case class  
          println("a = "+c.a)               // Accessing elements of case class  
          println("b = "+c.b)  
      }  
  } 
  
  
  
  
  
  
  
  
  
  
  
  
  