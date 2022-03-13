package abstractPack
//== All the <<traits>> will be extended <<after this class or abstract class>>.===================

//trait Print{  
//    def print()  
//}  
//  
//abstract class PrintA4{  
//    def printA4()  
//}  
//  
//class A66 extends PrintA4 with Print{            // First one is abstract class second one is trait  
//    def print(){                                        // Trait print  
//        println("print sheet")  
//    }  
//    def printA4(){                                      // Abstract class printA4  
//        println("Print A4 Sheet")  
//    }  
//}  
//  
//object TraitMixins{  
//    def main(args:Array[String]){  
//        var a = new A66()  
//        a.print()  
//        a.printA4()  
//    }  
//}


//=====we extend trait during object creation.======================================


trait Print{  
    def print()  
}  
  
abstract class PrintA4{  
    def printA4()  
}  
  
class AA extends PrintA4 {  
    def print(){                             // Trait print  
        println("print sheet")  
    }  
    def printA4(){                              // Abstract class printA4  
        println("Print A4 Sheet")  
    }  
}  
  
object TraitMixins{  
    def main(args:Array[String]){  
        var a = new AA() with Print             // You can also extend trait during object creation  
        a.print()  
        a.printA4()  
    }  
}  



