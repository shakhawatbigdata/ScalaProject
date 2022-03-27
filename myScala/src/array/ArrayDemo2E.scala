package array
//object ArrayDemo2 {
//  def main(args: Array[String]): Unit = {
//    val number = Array(10,20, 30, 40)
//       // Get first number in array with <apply>.
//       val first = number.apply(0)
//       println(first)
//       
//       var firstNum = number(0)
//       println(firstNum)
//       // Get last number Using Method <apply>.
//       val lastNum =number.apply(number.length-1)
//       println(lastNum)
//       
//       var last =number(number.length-1)
//       println(last)
//  }
//}

//=====================

object ArrayDemo2 {
  def main(args: Array[String]): Unit = {
    var nums:Array[Int] = new Array[Int](5)
    nums(0)=12
    nums(1)=24
    nums(3)=36
    nums(4)=48
    
    // before overridding value at 4th index:
    println(nums.mkString(" "))
    
    // after overridding value at 4th index:
    println(" after overridding ")
    nums(4)= 1000
    println(nums.mkString(" "))
    
      // after adding new value at 2nd index:
    println(" after adding ")
    nums(2)= 224
    println(nums.mkString(" "))
  }
}

//object ArrayDemo2E {
//  
//}