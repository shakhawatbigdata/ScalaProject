package collections


import scala.collection.immutable._  


//object ListMapScala{  
//    def main(args:Array[String]){  
//        var listMap = ListMap("Rice"->"100","Wheat"->"50","Gram"->"500")    // Creating listmap with elements  
//        var emptyListMap = new ListMap()            // Creating an empty list map  
//        var emptyListMap2 = ListMap.empty           // Creating an empty list map  
//        println(listMap)  
//        println(emptyListMap)  
//        println(emptyListMap2)  
//    }  
//}  

//=========================

object ListMapScala{  
    def main(args:Array[String]){  
        var listMap = ListMap("Rice"->"100","Wheat"->"50","Gram"->"500")    // Creating listmap with elements  
        listMap.foreach{  
            case(key,value)=>println(key+"->"+value)  
        }  
        println(listMap("Gram"))  
        var newListMap = listMap+("Pulses"->"550")  
        newListMap.foreach {  
            case (key, value) => println (key + " -> " + value)  
        }     
    }  
} 

//object ListMapScala {
//  
//}