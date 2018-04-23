package wc

object StringUtil {
  val allWords = (lst: List[String]) => lst.flatMap(s => strWords(s))  
  val strWords = (str: String) => str.split(" ").toList.map(s => s.replaceAll("[^a-zA-Z]", "").toLowerCase())
}
