package collections

import scala.collection.immutable._ 
import java.util.HashSet;
 //PROBLEMS** collections.Set.type does not take parameters
//object setScala{  
//    def main(args:Array[String]){  
//// Creating and initializing immutable sets
//        val myset1: Set[String] = Set("Geeks", "GFG", 
//                            "GeeksforGeeks", "Geek123")
//       
//          
//        // Display the value of myset1
//        println("Set 1:")
//        println(myset1)
//          
//        // Display the value of myset2 using for loop
//        println("\nSet 2:")
//      
//      
//      
//    }  
//}  

//========

//object setScala{  
//    def main(args:Array[String]){  
//        val set1 = Set()                            // An empty set  
//        val games = Set("Cricket","Football","Hocky","Golf")    // Creating a set with elements  
//        println(set1)  
//        println(games)  
//    }  
//}  

//===================

//object setScala{  
//        def main(args:Array[String]){  
//            val games = Set("Cricket","Football","Hocky","Golf")  
//            println(games.head)             // Returns first element present in the set  
//            println(games.tail)         // Returns all elements except first element.  
//            println(games.isEmpty)          // Returns either true or false  
//        }  
//    }  


//=======Merge two Set===========
//object setScala{  
//        def main(args:Array[String]){  
//            val games = Set("Cricket","Football","Hocky","Golf")  
//            val alphabet = Set("A","B","C","D","E")   
//            val mergeSet = games ++ alphabet            // Merging two sets  
//            println("Elements in games set: "+games.size)   // Return size of collection  
//            println("Elements in alphabet set: "+alphabet.size)   
//            println("Elements in mergeSet: "+mergeSet.size)  
//            println(mergeSet)  
//        }  
//    }  

//========

//object setScala{  
//        def main(args:Array[String]){  
//            val games = Set("Cricket","Football","Hocky","Golf")  
//            println(games)  
//            println("Elements in set: "+games.size)  
//            println("Golf exists in the set : "+games.contains("Golf"))  
//            println("Racing exists in the set : "+games.contains("Racing"))  
//              
//        }  
//    } 

//=====Adding and Removing Elements=============================

//object setScala{  
//        def main(args:Array[String]){  
//            var games = Set("Cricket","Football","Hocky","Golf")  
//            println(games)  
//            games += "Racing"               // Adding new element  
//            println(games)  
//            games += "Cricket"              // Adding new element, it does not allow duplicacy.  
//            println(games)  
//            games -= "Golf"             // Removing element  
//            println(games)  
//        }  
//    }  

//====Iterating Set Elements using for loop==========
//
//object setScala{  
//        def main(args:Array[String]){  
//            var games = Set("Cricket","Football","Hocky","Golf")  
//            for(game <- games){  
//                println(game)  
//            }  
//        }  
//    }  
//======Iterating Elements using foreach loop=============

//    object setScala{  
//        def main(args:Array[String]){  
//            var games = Set("Cricket","Football","Hocky","Golf")  
//            games.foreach((element:String)=> println(element))  
//        }     
//} 

//=================

//object setScala{  
//    def main(args:Array[String]){  
//        var games = Set("Cricket","Football","Hocky","Golf","C")  
//        var alphabet = Set("A","B","C","D","E","Golf")  
//        var setIntersection = games.intersect(alphabet)  
//        println("Intersection by using intersect method: "+setIntersection)  
//        println("Intersection by using & operator: "+(games & alphabet))  
//        var setUnion = games.union(alphabet)  
//        println(setUnion)  
//    }  
//} 

//=======SortedSet================
//import scala.collection.immutable.SortedSet  
//
//object setScala{  
//    def main(args:Array[String]){  
//        var numbers: SortedSet[Int] = SortedSet(5,8,1,2,9,6,4,7,2)  
//        numbers.foreach((element:Int)=> println(element))  
//    }     
//}  

//====================



//setScala






//object setScala {
//  
//}