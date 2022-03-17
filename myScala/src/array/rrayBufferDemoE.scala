package array
import scala.collection.mutable.ArrayBuffer
import scala.collection.script.Remove

//object rrayBufferDemoE {
//  def main(args: Array[String]): Unit = {
//    var names =ArrayBuffer[String]()
//    names +="Shahed";
//    names +="Shafin";
//    names +="Hossain";
//    
//    
//    println(names)
//    
//  }
//  
//=====================
//object rrayBufferDemoE {
//  def main(args: Array[String]): Unit = {
//    var names =ArrayBuffer[String]()
//    //also
//   val person =collection.mutable.ArrayBuffer("md","shakhawat","hossain")
//    println(person)
//   // add one element
//    person +="noor";
//    println(person)
//    // add two or more elements (method has a varargs parameter)
//    person +=("Bangladesh","Matlebur")
//    println(person)
//  }
//  
//}
//================
//object rrayBufferDemoE {
//  def main(args: Array[String]): Unit = {
//    var names =ArrayBuffer[String]()
//    //also
//   val person =collection.mutable.ArrayBuffer("md","shakhawat","hossain")
//    println(person)
//  
//  person.append("Emrul","Ekra");
//    println(person)
//    // add multiple elements with any TraversableOnce type
//    person ++= Seq("gillani", "hyderabadi")
//  println(person)
//  }
//  
//}

//================

object rrayBufferDemoE {
  def main(args: Array[String]): Unit = {
    var names =ArrayBuffer[String]()
    import scala.collection.mutable.ArrayBuffer
    names += "lily"
    names += "tulip"
    names += "dahlia"
    names += "holly"
    names += "pansy"
    names += "chrysanthemum"

    println(names)

    //also
   val person =collection.mutable.ArrayBuffer("md","shakhawat","hossain","Emrul","Ekra")
    println(person)
  //Remove one element
  person -="md"
  println(person)
  person --= Seq("shakhawat","Emrul")
  println(person)
  
  //using index// remove() 
  person.remove(1)
  println(person)
  
   person ++= Seq("shakhawat","Emrul","Abir","Babu","Joha","Latif")
   println(person)
   //remove of range
   person.remove(1,3)
   
   println(person)
   person.clear();
    println("clear: "+person)
    
    person ++= Seq("shakhawat","Emrul","Abir","Babu","Joha","Latif")
    println(person)
    
    println(person.isEmpty)
   
  }
  
}