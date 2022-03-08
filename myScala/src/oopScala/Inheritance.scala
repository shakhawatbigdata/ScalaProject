package oopScala


class Inheritance extends Employees{  
 
     var bonus:Int = 5000  
    println("Salary = "+salary)  
    println("Bonus = "+bonus)  
} 
  

    object MainObject{  
    def main(args:Array[String]){  
        new Inheritance()  
    }  
}  

