package array
import scala.collection.mutable.ArrayBuffer
//object rrayBufferInt {
//  def main(args: Array[String]): Unit = {
//    var num =ArrayBuffer[Int]()
//    
//    num +=1;
//    num +=50;
//    println(num);
//    num ++=Seq(14,23)
//    println(num);
//    num.append(12,18);
//    println(num);
//    
//    num.remove(1, 2);
//    println(num);
//    
//    num --=Seq(23,12);
//    println(num);
//  }
//}
//======================

object rrayBufferInt {
  def main(args: Array[String]): Unit = {
    var num =ArrayBuffer[Int]()
    
    num +=1;
    num +=50;
    println(num);
    num ++=Seq(14,23)
    num.clear()
    println(num);
  }
}
