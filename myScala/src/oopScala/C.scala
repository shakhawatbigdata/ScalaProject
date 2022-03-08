package oopScala

class C extends Bb{  
    def show(){  
        println("salary1 = "+salary1)  
        println("salary2 = "+salary2)  
    }  
}  
  
object MainObject{  
    def main(args:Array[String]){   
        var c = new C()  
        c.show()  
      
    }  
} 