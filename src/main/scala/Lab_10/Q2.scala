package Lab_10
object Q2 extends App{
  def countLetterOccurrences(word: List[String]): Int = {
    val wordLen = word.map(w => w.length);
    val totalCount = wordLen.reduce((x, y) => x + y);

    return totalCount;
  }

  val inputs = List("apple", "banana", "cherry", "date");
  val output = countLetterOccurrences(inputs);
  println("Total count of letter occurrences:"+ output);
}
