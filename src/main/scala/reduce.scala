import org.apache.spark.{SparkContext,SparkConf}
object reduce {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local").setAppName("reduce")
    val sc = new SparkContext(conf)

    val arr = sc.parallelize(Array("helli", "world", "scala"))
    val arr2 = arr.reduce(_ + _)

    arr2.foreach(print)

  }
}