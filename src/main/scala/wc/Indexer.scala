package wc

import scala.collection.mutable.HashMap
import scala.collection.immutable.ListMap

object Indexer {

  val frequentWords = (n: Int) => (map: HashMap[String, Int]) => {ListMap(map.toSeq.sortWith(_._2 > _._2):_*).take(n)}

  val wordCount = (words: List[String]) => {
    val res = new HashMap[String, Int]()
    words.foreach(w => 
      if(res.contains(w)) {
        val count = res(w) + 1
        res += (w -> count)
      }
      else {
        res += (w -> 1)
      }
    )
    res
  }
  
}
