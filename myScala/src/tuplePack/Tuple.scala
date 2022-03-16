package tuplePack

/*/A tuple is a collection of elements in ordered form.
If there is no element present, it is called empty tuple. 
You can use tuple to store any type of data. You can store similar type or mix type data also.
You can use it to return multiple values from a function */

//object Tuple{  
//    def main(args:Array[String]){  
//        var tuple = (1,5,8,6,4)                     // Tuple of integer values  
//        var tuple2 = ("Apple","Banana","Gavava")        // Tuple of string values  
//        var tuple3 = (2.5,8.4,10.50)                // Tuple of float values  
//        var tuple4 = (1,2.5,"India")                // Tuple of mix type values  
//        println(tuple)  
//        println(tuple2)  
//        println(tuple3)  
//        println(tuple4)  
//    }  
//} 

//============

object Tuple{  
    def main(args:Array[String]){  
        var tupleValues = (1,2.5,"India")  
        println("iterating values: ")  
        tupleValues.productIterator.foreach(println)    // Iterating tuple values using productIterator  
        println("Accessing values: ")  
        println(tupleValues._1) // Fetching first value  
        println(tupleValues._2) // Fetching second value  
    }  
}  

//object Tuple {
//  
//}

