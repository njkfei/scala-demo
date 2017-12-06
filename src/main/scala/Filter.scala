import org.apache.spark.{SparkContext,SparkConf}
object Filter {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("Filter").setMaster("local")
    val sc = new SparkContext(conf)

    val arr = sc.parallelize(Array(1,2,3,4,5,6,7,8))
    arr.filter(_ >= 3).foreach(println)
  }
}
