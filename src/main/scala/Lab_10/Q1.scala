package Lab_10
object Q1 extends App{
  def calculateAverage(tempC: List[Double]): Double = {
      val tempF = tempC.map(C => (C * 9/5 )+ 32);
      val sum = tempF.reduce((x, y) => x + y);
      return (sum / tempF.length);
    }

    val test_val = List(0.0,10.0,20.0,30.0);
  //must give in double or else line 11 will get error
    val result = calculateAverage(test_val);
    println("Average Fahrenheit temperature: " + result);
}
