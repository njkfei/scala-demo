import org.apache.spark.{SparkContext,SparkConf}
object Coalesce {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("coalesce").setMaster("local")
    val sc = new SparkContext(conf)

    val arr = sc.parallelize(Array(1,2,3,4,5,6))
    val arr2 = arr.coalesce(2,true)

    val result = arr.aggregate(0)(math.max(_,_),_ + _ )
    println(result)

    arr2.foreach(println)
    val result2 = arr2.aggregate(0)(math.max(_,_),_ + _)
    println(result2)

    val arr3 = arr.repartition(3)
    arr3.foreach(println)

    println(arr3.partitions.length)

    arr3.countByValue().foreach(println)

  }
}
