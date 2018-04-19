import wc.FileReader._
import wc.StringUtil._ 
import wc.Indexer._

object Main extends App {
  val w = (frequentWords(5) compose wordCount compose allWords compose readLines)("/Users/rbonifacio/tmp/frankstein.txt")
  println(w) 
}
