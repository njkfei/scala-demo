import org.apache.spark.{SparkContext,SparkConf}
object Distinct {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local").setAppName("Distinct")
    val sc = new SparkContext(conf)

    val arr = sc.parallelize(Array("hello","world","hello","scala"))
    arr.distinct().foreach(println)
  }
}
