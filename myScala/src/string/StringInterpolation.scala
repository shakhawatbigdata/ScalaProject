package string
/*/Scala offers a new mechanism to create strings from  data  
It is called string interpolation.

Scala provides three string interpolation methods: s, f and raw.
 */
// $ = indicate variable, 
// In <f > Method, % is use to define dataType like:,%s= String, %d= Int , %f = Float
//=========================


//object StringInterpolation{  
//    def main(args:Array[String]){  
//      val name = "Hossain"
//      val age = 18.5
//      val ages = 18
//      //WITHOUT INTERPOLATION
//      println(name + " is "+ age + " years old")
//      //s sting Interpolation
//      println(s"$name   is  $age years old")
//      //f sting Interpolation //%d =int
//      println(f"$name%s  is  $ages%d years old")
//      //f sting Interpolation //%f =float. it is type save Interpolation
//      println(f"$name%s  is  $age%f years old")
//      println(s"Hello \nWorld")
//      //raw string Interpolation does not accept skip
//      println(raw"Hello \nWorld") 
//    }  
//} 

//========================
//Without using s Method

//class StringExample{  
//    var pi = 3.14  
//    def show(){  
//        println("value of pi = "+pi)          
//    }  
//}  
//object StringInterpolation{  
//    def main(args:Array[String]){  
//        var s = new StringExample()  
//        s.show()  
//    }  
//} 

//=========================
//class StringExample{  
//    
//    def show(){  
//        println()          
//    }  
//}  





//===================================


//
//class StringExample{  
//    var pi = 3.14  
//    def show(){  
//        println(s"value of pi = $pi")  
//    }  
//}  
//  
//object StringInterpolation{  
//    def main(args:Array[String]){  
//        var s = new StringExample()  
//        s.show()  
//    }  
//}  

//=====we did not use < + >operator to concatenate string objects.===================
//=====String Interpolation Example By using < s > Method

//class StringExample{  
//    var s1 = "Scala string example"  
//    
//    var s2 ="I love Scala"
//    def show(){  
//        println(s"This is $s1 $s2 ")  
//    }  
//}  
//  
//  
//object StringInterpolation{  
//    def main(args:Array[String]){  
//        var s = new StringExample()  
//        s.show()  
//    }  
//}  

//================================

//class StringExample{  
//    var s1 = "Scala string example"  
//    var version = 2.12  
//    def show(){  
//        println(f"This is $s1%s, scala version is $version")  //%2.2f
//    }  
//}  
//  
//  
//object StringInterpolation{  
//    def main(args:Array[String]){  
//        var s = new StringExample()  
//        s.show()  
//    }  
//} 


//===========
/*/The raw method of string interpolation is used to produce raw string. 
It does not interpret special char present in the string.*/

//class StringExample{  
//    var s1 = "Scala \tstring \nexample"      
//    var s2 = raw"Scala \tstring \nexample"      
//    def show(){  
//        println(s1)  
//        println(s2)  
//    }  
//}  
//  
//object StringInterpolation{  
//    def main(args:Array[String]){  
//        var s = new StringExample()  
//        s.show()  
//    }  
//}  

//object StringInterpolation {
//  
//}

//====String interpolators can also take arbitrary expressions==========
//== Any arbitrary expression can be embedded in ${}

//object StringInterpolation{  
//    def main(args:Array[String]){  
//
//        println(s"1 + 1 = ${1 + 1}") 
//    }  
//} 

//=============================

object StringInterpolation{  
    def main(args:Array[String]){  

        println(s" ${10 + 15 - 7 * 2 /2}") 
        
        //TO PRINT SPECIAL CHARACTER
        
        println(s"New offers starting at $$14.99")
        
        
    }  
} 