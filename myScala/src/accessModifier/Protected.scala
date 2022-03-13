package accessModifier
/*/Protected access modifier is accessible only within class,
sub class and companion object. */
class AccessExample{  
     protected var a:Int = 10  
} 

class SubClass extends AccessExample{  
    def display(){  
        println("a = "+a)  
    }  
}

object MainObject{  
    def main(args:Array[String]){  
        var s = new SubClass()  
        s.display()  
    }  
} 








object Protected {
  
}