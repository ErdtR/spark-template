import org.apache.spark.sql.SparkSession
import org.apache.log4j.{Level, Logger}

object Main {
  def main(args: Array[String]): Unit = {
    //decrease number of log messages in console
    Logger.getLogger("org").setLevel(Level.WARN)

    //get session for local spark master
    val spark = SparkSession.builder()
      .master("local[*]")
      .appName("app-name")
      .getOrCreate()

    //SPARK CODE

    //stop session
    spark.stop()
  }
}