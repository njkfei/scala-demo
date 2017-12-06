import org.apache.spark.{SparkContext,SparkConf}

object wordCount {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local").setAppName("wordCount")
    val sc = new SparkContext(conf)

    val data = sc.textFile("C:\\source-git\\Scala\\src\\main\\data\\wordCount")

    data.flatMap(_.split(" ")).map((_,1)).reduceByKey(_+_).foreach(println)

  }
}
