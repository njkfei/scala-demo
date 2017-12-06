import org.apache.spark.{SparkContext,SparkConf}
object CountByKey {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local").setAppName("countByKey")
    val sc = new SparkContext(conf)

    val arr = sc.parallelize(Array((1,"bak"),(2,"good"),(3,"hello"),(1,"bad"),(3,"scala")))
    arr.countByKey().foreach(println)

  }
}
