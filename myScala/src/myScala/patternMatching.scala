package myScala

object patternMatching {
  def main(args:Array[String]){
    
    var a =1;
    
    a match{
      case 1 => println("One")
      case 2 => println("Two")
      case 3 => println("Three")
    }
    // =====supperClass ================================
    
    var result = search(121)
    print(result)
    
  }//MainEnd
  def search(a:Any):Any = a match{                   //===== HOW IT WORK ?
    case 1 => println("One")
    case "Two" => println("Two")
    case "Hossain" => println("Hossain")
    case _=> println("Default")
  }
}