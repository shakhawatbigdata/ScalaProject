package array

//object ArrayDemo1E {
//  def main(args: Array[String]): Unit = {
//    
//    //Array of Array
//    var tda1 = Array(Array(1,3,5,7,9),Array(2,4,6,8,10))
//    // getting an individual value:
//    println("The first value from the first array: " + tda1(0)(0))
//    
//    println("Max: "+ tda1.map(_.max).max)
// 
//  
//  
//  
//  
//  }//mainEnd
//}

//==================

//object ArrayDemo1E {
//  def main(args: Array[String]): Unit = {
//    
//    //Array of Array
//    var tda1 = Array(Array(1,3,5,7,9),Array(2,4,6,8,10),Array(11,12,13,14,15))
//    // getting an individual value:
//    println("The first value from the first array: " + tda1(2)(0))
//    
//    println("Max: "+ tda1.map(_.max).max)
// 
//   println("Min: "+ tda1.map(_.min).min)
//  
//  
//  
//  }//mainEnd
//}

//================

//object ArrayDemo1E {
//  def main(args: Array[String]): Unit = {
//    
//    //Array of Array
//    var tda1 = Array(Array(1,3,5,7,9),Array(2,4,6,8,10),Array(11,12,13,14,15))
//    // getting an individual value:
//    println("The first value from the Third array: " + tda1(2)(0))
//    
//  //// print the flatten max value:
//    println("Max value: " + tda1.flatten.max)
//    
// // print the min value:
//    println("Min value: " + tda1.flatten.min)
//  
//  
//  
//  }//mainEnd
//}

////==============
//object ArrayDemo1E {
//  def main(args: Array[String]): Unit = {
//    
//    //Array of Array
//    var tda1 = Array(Array(1,3,5,7,9),Array(11,12,13,14,15))
//                              
//    for (i<- 0 to 1){         //i0=(1,3,5,7,9) and //i1=(11,12,13,14,15)
//      for(j <- 0 to 4){       //i0j0=1 , i1j0=11
//        println(tda1(i)(j)+" ")
//      }
//    }
//  
//  
//  
//  }//mainEnd
//}

//==============
//object ArrayDemo1E {
//  def main(args: Array[String]): Unit = {
//    
//    //Array of Array
//    var tda1 = Array(Array(1,3,5,7,9),Array(11,12,13,14,15),Array(10,20,30,40,50))
//                              
//    for (i<- 0 to 2){         //i0=(1,3,5,7,9) and //i1=(11,12,13,14,15)
//      for(j <- 0 to 5){       //i0j0=1 , i1j0=11
//        println(tda1(i)(j)+" ")
//      }
//    }
//  
//  
//  
//  }//mainEnd
//}

//=============

object ArrayDemo1E {
  def main(args: Array[String]): Unit = {
    
    // declaration 1:
    var tda1 = Array(Array(1,3,5,7,9),Array(11,12,13,14,15),Array(10,20,30,40,50))
                              
  // declaration 2:
  
  var tda2 = Array.ofDim[Int](2,5)
   // adding values to the first array:
  tda2(0)(0)=10
  tda2(0)(1)=30
  tda2(0)(2)=50
  tda2(0)(3)=70
  tda2(0)(4)=90
 
  // adding values to the first array:
  
  tda2(1)(0)=20
  tda2(1)(1)=40
  tda2(1)(2)=60
  tda2(1)(3)=80
  tda2(1)(4)=100
  
  for (i<- 0 to 1){
    for (j<- 0 to 4){
      println(tda2(i)(j) +" ")
    }
  }
  
  }//mainEnd
}