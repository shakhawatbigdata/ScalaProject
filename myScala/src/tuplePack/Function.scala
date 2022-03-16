package tuplePack

/* /You can return multiple values by using tuple. 
Function does not return multiple values but you can do this with the help of tuple.*/

object Function{  
    def main(args:Array[String]){  
        var tupleValues = tupleFunction()  
        println("Iterating values: ")  
        tupleValues.productIterator.foreach(println)    // Iterating tuple values using productIterator  
    }  
    def tupleFunction()={  
        var tuple = (1,2.5,"India")  
        tuple  
    }  
}  

//object Function {
//  
//}