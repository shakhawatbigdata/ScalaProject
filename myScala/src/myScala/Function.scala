package myScala

/*Scala Function Declaration Syntax::
    def functionName(parameters : typeofparameters) : returntypeoffunction = {  
    // statements to be executed  
    } 
*/

//====Function without using = Operator=======================
//object Function {
//   def main(args:Array[String]){
//     fncnExp()      //// Calling function
// 
//   }
//   def fncnExp(){ // Defining a function
//     println("This is simple function !")
//   }
   //======Function with < = > Operator=========================================
//   object Function {
//   def main(args:Array[String]){
//     var result = fncnExp()      //// Calling function
//     
//     println(result)
//     
//    
//   }
//   def fncnExp()={ // Defining a function
//     var a = 10
//     a
//   }
   //============================================
   
//  object Function {
//   def main(args:Array[String]){
//     var result = fncnExp()      //// Calling function
//     
//     println(result)
//     
//   }
//   
//   def fncnExp()={ // Defining a function
//     var a = 10
//     a
//   }   
//   //======Parameterized Function======================================
//   
// object Function {
//   def main(args:Array[String]){
//     fncnExp(10,20)      //// Calling function
// 
//   }
//   def fncnExp(a:Int, b:Int) = { // Defining a function
//     var c = a+b
//     println(c)
//     
//   }
//     //======Recursion Function======================================
//   
// object Function {
//   def main(args:Array[String]){
//  
//     
//   } 
//   
   
//   //======Function Parameter example with default value======================================
//   
// object Function {
//   def main(args:Array[String]){
//    var result1 = functionExample(15,2)     // Calling with two values  
//        var result2 = functionExample(15)   // Calling with one value  
//        var result3 = functionExample()     // Calling without any value  
//        println(result1+"\n"+result2+"\n"+result3)  
//    }  
//    def functionExample(a:Int = 0, b:Int = 0):Int = {   // Parameters with default values as 0  
//        a+b  
//    }  

////======Function Named Parameter======================================
   
 object Function {
   def main(args:Array[String]){
     var result1 = functionExample(a = 15, b = 2)    // Parameters names are passed during call  
        var result2 = functionExample(b = 15, a = 2)    // Parameters order have changed during call  
        var result3 = functionExample(15,2)             // Only values are passed during call  
        println(result1+"\n"+result2+"\n"+result3)  
    }  
    def functionExample(a:Int, b:Int):Int = {  
        a+b  
    }  
     

   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
  
}//End Object