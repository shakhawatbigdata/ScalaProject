package array

// HashMap is used to store element. It use hash code to store elements and return a map.

import scala.collection.immutable._  


//object HashMapScala{  
//    def main(args:Array[String]){  
//        var hashMap = new HashMap()  
//        var hashMap2 = HashMap("A"->"Apple","B"->"Ball","C"->"Cat")  
//        println(hashMap)  
//        println(hashMap2)  
//    }  
//}  

//===============

object HashMapScala{  
    def main(args:Array[String]){  
        var hashMap = HashMap("A"->"Apple","B"->"Ball","C"->"Cat")  
        hashMap.foreach {  
            case (key, value) => println (key + " -> " + value)       // Iterating elements  
        }  
        println(hashMap("B"))               // Accessing value by using key  
        var newHashMap = hashMap+("D"->"Doll")  
        newHashMap.foreach {  
            case (key, value) => println (key + " -> " + value)  
        }  
          
    }  
}  
//object HashMapScala {
//  
//}