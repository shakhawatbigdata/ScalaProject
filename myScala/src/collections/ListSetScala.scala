package collections

import scala.collection.immutable._

//object ListSetScala{  
//    def main(args:Array[String]){  
//        var listset = ListSet(4,2,8,0,6,3,45)  
//        listset.foreach((element:Int) => println(element+" "))  
//    }  
//} 
//====Creating ListSet and Adding Elements=======

object ListSetScala{  
    def main(args:Array[String]){  
        var listset:ListSet[String] = new ListSet()                 // Creating empty ListSet by using constructor  
        var listset2:ListSet[String] = ListSet.empty                // Creating an empty listset  
        println("listset: "+listset)  
        println("listset2: "+listset2)  
        println("After adding new elements:")  
        listset+="India"            // Adding new element  
        listset2+="Russia"          // Adding new element  
        println("listset: "+listset)  
        println("listset2: "+listset2)  
    }  
} 


//object ListSetScala {
//  
//}