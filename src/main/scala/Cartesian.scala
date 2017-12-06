import org.apache.spark.{SparkContext,SparkConf}
object Cartesian {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local").setAppName("testCartesian")
    val sc = new SparkContext(conf)

    val arr = sc.parallelize(Array(1,2,3,4,5,6))
    val arr2 = sc.parallelize(Array(6,5,4,3,2,1))
    val resual = arr.cartesian(arr2)
    println(resual)
    resual.foreach(println)

  }

}
