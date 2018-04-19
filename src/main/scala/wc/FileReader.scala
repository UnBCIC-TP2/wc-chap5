package wc

import scala.io.Source

object FileReader {
  val readLines = (path: String)  => Source.fromFile(path).getLines.toList
}
