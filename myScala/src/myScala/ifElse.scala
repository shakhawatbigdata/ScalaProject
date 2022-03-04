package myScala

object ifElse {
  
  def main(args:Array[String]){
  var num:Int=50;
  
  if(num>=36 && num<=50){
    println("You got grade D")
  }else if (num>=51 && num<=69){
    println("You got grade C")
  }else if (num>=70 && num<=79){
    println("You got grade B")
  }else if (num>=80 && num<=100){
    println("You got grade A")
  }else{
    println("Invalid input")
  }
  //println(num);
}
}