/**
  * Created by leehwangchun on 2016. 7. 1..
  */
class Element {
    val title = "hello world"

    def output() : Unit = println(title)
}

object aboveAndbeside {
    def main(args : Array[String]) : Unit = {
        val testObject = new Element

        testObject.output()
    }
}
