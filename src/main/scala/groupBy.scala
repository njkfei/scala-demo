import org.apache.spark.SparkContext
import org.apache.spark.SparkConf
object groupBy {

  def myfilter1(num: Int): Unit = {
    num > 4
  }

  def myfilter2(value: Int): Unit = {
    value <= 4
  }

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local").setAppName("groupBy")
    val sc = new SparkContext(conf)

    val arr = sc.parallelize(Array(1,2,3,4,5,6))

    val arr2 = arr.groupBy(myfilter1(_),1)
    arr2.foreach(println)
    var arr3 = arr.groupBy(myfilter2(_),2)
    arr3.foreach(println)
  }
}
