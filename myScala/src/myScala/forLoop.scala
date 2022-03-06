package myScala
/* for( i <- range){  
    // statements to be executed  
}*/
object forLoop {
  
//   def main(args:Array[String]){
//     for(a <- 1 to 10){
//       println(a)
//     }
//    
//  }
  
   //==========For loop using until keyword=======================
   
//   def main(args:Array[String]){
//     for(a <- 1 until 10){
//       println(a);
//     }
//   }
  
     //==========for-loop filtering=======================
   
//   def main(args:Array[String]){
//     for(a <- 1 until 10 if a%2==0){
//       println(a);
//     }
//   }
  
  //======================================================
  
//   def main(args:Array[String]){
//     for(a <- 50 to 100 if a%5==1){
//       println(a);
//     }
//   }
  
   //======================================================
  
//   def main(args:Array[String]){
//     for(a <- 50 to 100 if a%5==1){
//       println(a);
//     }
//   } 
  
   //======================================================
  
//   def main(args:Array[String]){
//     for(a <- 20 to 80 if a%5!=0){
//       println(a);
//     }
//   }   
  
//     //============using yield keyword==========================================
//  
//   def main(args:Array[String]){
//   var result = for(a <- 20 to 30) yield a
//   for(i<- result){
//       println(i);
//     }
//   }  
  
//      //============for-loop in Collection==========================================
//  
//   def main(args:Array[String]){
//   var list = List(1,2,3,4,5,6)
//   for(i<- list){
//       println(i);
//     }
//   }
//  
  
  //      //============For-each loop in Collection==========================================
  
//   def main(args:Array[String]){
//   var list = List(1,2,3,4,5,6,7)
//   list.foreach{
//       println;
//     }
//   //===================
//   list.foreach(print);
//   //===========================
//   println
//   list.foreach((element:Int)  =>print(element + " "))
//   
//   }
//  
  //      //============for-loop Example using <by> keyword==========================================
//   def main(args:Array[String]){
//   
//   for(i<- 2 to 10 by 2){
//       println(i);
//     }
//   }
//  
//  //========for-loop  using <until> and <by> keyword==================================
  ///   ===by keyword is used to skip the iteration
//   def main(args:Array[String]){
//   
//   for(i<- 2 until 10 by 2){
//       println(i);
//     }
//   }
  
  //======For loop Break====================================
  import scala.util.control.Breaks._
  
   
//  def main(args:Array[String]){
//    breakable{    // Breakable method to avoid exception  
//     for(i<-1 to 10 by 2){
//       if(i==7)
//         break
//         
//       else
//       println(i);
//       }
//     }
//    }
 //=============================================== 
  
    def main(args:Array[String]){
    
    for (i<- 1 to 3){
    breakable{   
     for(j<-1 to 3){
       if(i==2 && j==2)
         break
         
       else
         
       println(i + " " +j);
       }
     }
    }
  
  }
  
  
}//End object