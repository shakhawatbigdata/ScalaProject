package fileHandling
import java.io._
import java.io.PrintWriter
import java.io.File

import java.io._
object FileHandle {
  def main(args: Array[String]): Unit = {
   
    val writer = new PrintWriter(new File("D:\\test.txt"))


    for (i <- 1 to 10) {
      writer.write(i + ": Hello Scala\n")

    }

    writer.close()

  }
}  
 


//object FileHandle {
//  
//}