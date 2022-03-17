package fileHandling
import java.io.PrintWriter
import java.io.File


object WriteAFile {
    def main(args: Array[String]): Unit = {
   
    val writer = new PrintWriter(new File("D:\\test1.txt"))


    for (i <- 1 to 10) {
      writer.write(i + ": Hello Hossain\n")

    }

    writer.close()

  }
}