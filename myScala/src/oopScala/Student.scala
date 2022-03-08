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

//class Arithmetic{ 
//  def add(a:Int, b:Int){
//    var add = a+b;
//    println("sum = "+add);
//  }
//}
//
//  object FunctionsHigherOrder  {
//  def main(args:Array[String]){
//       new Arithmetic().add(10, 10);
//  }
//  }
  
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
  
//  case class CaseClass(a:Int, b:Int)  
//  
//  object MainObject{  
//      def main(args:Array[String]){  
//          var c = CaseClass(10,10)       // Creating object of case class  
//          println("a = "+c.a)               // Accessing elements of case class  
//          println("b = "+c.b)  
//      }  
//  } 
  
  //===Case Class and Pattern Matching==========================
  
//      trait SuperTrait  
//    case class CaseClass1(a:Int,b:Int) extends SuperTrait  
//    case class CaseClass2(a:Int) extends SuperTrait         // Case class  
//    case object CaseObject extends SuperTrait               // Case object  
//    object MainObject{  
//        def main(args:Array[String]){  
//            callCase(CaseClass1(10,10))  
//            callCase(CaseClass2(10))  
//            callCase(CaseObject)  
//        }  
//        def callCase(f:SuperTrait) = f match{  
//            case CaseClass1(f,g)=>println("a = "+f+" b ="+g)  
//            case CaseClass2(f)=>println("a = "+f)  
//            case CaseObject=>println("No Argument")  
//        }  
//    }  
  
  
  
  //=============================

//class Student{  
//println("Hello from default constructor");  
//} 
  
  //====Primary Constructor============================
////You don't need to define explicitly constructor if your code has only one constructor. 
//class Student(id:Int, name:String){  
//    def showDetails(){  
//        println(id+" "+name);  
//    }  
//}  
//  
//object MainObject{  
//    def main(args:Array[String]){  
//        var s = new Student(101,"Rama");  
//        s.showDetails()  
//    }  
//} 
  
//===Scala Secondary (auxiliary) Constructor===============================
//   <this > keyword is used to call constructor from other constructor. 
//   When calling other constructor make it first line in your constructor.

//      class Student(id:Int, name:String){  
//        var age:Int = 0  
//        def showDetails(){  
//            println(id+" "+name+" "+age)  
//        }  
//        def this(id:Int, name:String,age:Int){  
//            this(id,name)       // Calling primary constructor, and it is first line  
//            this.age = age  
//        }  
//    }  
//      
//    object MainObject{  
//        def main(args:Array[String]){  
//            var s = new Student(101,"Rama",20);  
//            s.showDetails()  
//        }  
//    }  
//  
//===Constructor Overloading================================================

//    class Student(id:Int){  
//        def this(id:Int, name:String)={  
//            this(id)  
//            println(id+" "+name)  
//        }  
//        println(id)  
//    }  
//      
//    object MainObject{  
//        def main(args:Array[String]){  
//            new Student(101)  
//            new Student(100,"India")  
//        }  
//    }  

//====Method Overloading===using Different Parameters===========================
    
//    class Arithmetic{  
//        def add(a:Int, b:Int){  
//            var sum = a+b  
//            println(sum)  
//        }  
//        def add(a:Int, b:Int, c:Int){  
//            var sum = a+b+c  
//            println(sum)  
//        }  
//    }  
//      
//    object MainObject{  
//        def main(args:Array[String]){  
//            var a  = new Arithmetic();  
//            a.add(10,10);  
//            a.add(10,10,10);  
//            
//        }  
//    }  


//====Method Overloading===using Different Data Type===========================

//class Arithmetic{  
//    def add(a:Int, b:Int){  
//        var sum = a+b  
//        println(sum)  
//    }  
//    def add(a:Double, b:Double){  
//        var sum = a+b  
//        println(sum)  
//    }
//    
//     def add(a:Int, b:String){  
//        var sum = a+b  
//        println(sum)  
//    }
//}  
//object MainObject{  
//    def main(args:Array[String]){  
//        var b = new Arithmetic()  
//        b.add(10,10)  
//        b.add(10.0,20.0)
//        b.add(1001, " Aira")
//  
//    }  
//} 




