import org.apache.spark.{SparkContext,SparkConf}

object testRDDMethod {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local").setAppName("testRDDMethod");
    val sc = new SparkContext(conf);

    val arr = sc.parallelize(Array(1,2,3,4,5,6))
    var result = arr.aggregate(0)(math.max(_,_),_+_)
    println(result)


    val arr2 = sc.parallelize(Array(1,2,3,4,5,6),2)
     result = arr2.aggregate(0)(math.max(_,_),_+_)
    println(result)

    val arr3 = sc.parallelize(Array(1,2,3,4,5,6),3)
    result = arr3.aggregate(1)(math.max(_,_),_*_)
    println(result)

    val arr4 = sc.parallelize(Array("abc","b","c","d","e","f"))

    println(arr4)
    println("-------------------")
    println(arr4.cache())
    arr4.foreach(println)
  }
}
