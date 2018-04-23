import wc.FileReader._
import wc.StringUtil._ 
import wc.Indexer._
import wc.StopWord._

import org.backuity.clist._

object MainProgram extends CliMain[Unit] (
  name="Word Count",
  description="a simple word count implementation using the \"Things\" style") {

  var input = arg[String](description = "the input file")
  var size  = opt[Int](default = 20)

  def run: Unit = {
    val fw = (frequentWords(size) compose wordCount compose removeStopWords compose allWords compose readLines)(input)
    println(fw) 
  }
}


// object Main extends App {
//   val w = (frequentWords(5) compose wordCount compose allWords compose readLines)("/Users/rbonifacio/tmp/frankstein.txt")
//   println(w) 
// }
