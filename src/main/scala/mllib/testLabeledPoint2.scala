package mllib

import org.apache.spark.mllib.util.MLUtils
import org.apache.spark.{SparkConf, SparkContext}

object testLabeledPoint2 {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local").setAppName("testLabeledPoint2")
    val sc = new SparkContext(conf)

    val mu = MLUtils.loadLibSVMFile(sc,"C:\\source-git\\Scala\\src\\main\\data\\loadLibsSVMFile")
    mu.foreach(println)
  }
}
