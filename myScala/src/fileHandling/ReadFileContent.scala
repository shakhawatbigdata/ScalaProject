package fileHandling
import scala.io.Source

object ReadFileContent {
  def main(args: Array[String]) {
    println("Following is the content read:")
    Source.fromFile("D:\\test.txt").foreach(print)
  }
}