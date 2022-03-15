package collections

import scala.collection.immutable.HashSet 
/*HashSet is a sealed class. It extends AbstractSet and immutable Set trait. 
It uses hash code to store elements.

It neither maintains insertion order nor sorts the elements.*/

 
object MainObject{  
    def main(args:Array[String]){  
        var hashset = HashSet(4,2,8,0,6,3,45)  
        hashset.foreach((element:Int) => println(element+" "))     
   }  
}  


//object HashSet {
//  
//}