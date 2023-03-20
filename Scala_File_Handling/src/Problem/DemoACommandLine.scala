//Read from Command Line scala.io._
object DemoACommandLine {
  def main(args: Array[String]): Unit = {
    println("Enter your name")
    var name = scala.io.StdIn.readLine()
    println("Hello " + name)

    println("Hello " +  name + ", Enter your Phone Number")
    var number = scala.io.StdIn.readLine()
    println("Your Phone number is " + number)

    println("Hello " +  name + ", What is your Age?")
    var age = scala.io.StdIn.readLine()
    println("Age is " + age)
  }
}
