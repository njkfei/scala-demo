import org.apache.spark.{SparkContext,SparkConf}
object flatMap {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local").setAppName("flatMap")
    val sc = new SparkContext(conf)

    val arr = sc.parallelize(Array(1,2,3,4,5,6))
    //val result = arr.map((x => List(x+1))).collect()
    val result = arr.flatMap((x => List(x+1))).collect()
    result.foreach(println)
  }
}
