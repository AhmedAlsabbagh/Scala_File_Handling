object DemoBFileRead {
  def main(args: Array[String]): Unit = {
    val sampleFile = "C:\\Users\\a84289141\\Desktop\\git\\Scala_File_Handling\\src\\Sample Files\\sampleData.txt"
    println("========== Option 1===============")
//    Option 1
    scala.io.Source.fromFile(sampleFile).foreach(x => print(x))
    println("========== Option 2===============")
//    Option 2
//    val lines = scala.io.Source.fromFile(sampleFile).getLines()
//    lines.foreach(x => println(x))
    scala.io.Source.fromFile(sampleFile).getLines().foreach(x => println(x))
  }

}
