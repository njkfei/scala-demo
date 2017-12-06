package mllib
import org.apache.spark.mllib.linalg
import org.apache.spark.mllib.linalg.Vectors
import org.apache.spark.{SparkConf, SparkContext}
object testVector {
  def main(args: Array[String]): Unit = {
/*    val conf = new SparkConf().setAppName("testVector").setMaster("local")
    val sc = new SparkConf(sc)*/

    val vd:linalg.Vector = Vectors.dense(2,0,6)
    println(vd(2))

    val vd2:linalg.Vector = Vectors.sparse(9,Array(0,3,5,8),Array(0,1,2,8))
    println(vd2(3))

  }
}
