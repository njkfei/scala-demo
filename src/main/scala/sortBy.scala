import org.apache.spark.{SparkContext,SparkConf}
object sortBy {



  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local").setAppName("sortBy")
    val sc = new SparkContext(conf)

    val arr = sc.parallelize(Array(("helli",3), ("world",2), ("scala",5),("one",3),("two",9),("world",7)))
    val arr2 = arr.sortBy(word => word._1,true)

    arr2.foreach(println)

  }

}