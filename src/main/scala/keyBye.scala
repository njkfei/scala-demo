import org.apache.spark.{SparkContext,SparkConf}
object keyBye {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local").setAppName("keyBy")
    val sc = new SparkContext(conf)

    val arr = sc.parallelize(Array("helli","world","scala"))
    val arr2 = arr.keyBy((word => word.size))

    arr2.foreach(println)


  }
}
