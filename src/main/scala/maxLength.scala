import org.apache.spark.{SparkContext,SparkConf}
object maxLength {



  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local").setAppName("maxLength")
    val sc = new SparkContext(conf)

    val arr = sc.parallelize(Array("helli", "world", "scala","one","two","world"))
    val arr2 = arr.reduce(myFun)

    arr2.foreach(print)

  }

  def myFun(str1:String,str2:String):String = {
    if(str1.size > str2.size){
      return  str1
    }
    return str2
  }
}