/**
  * Created by leehwangchun on 2016. 6. 13..
  */
object ContainsOdd {
    def containsOdd(num : List[Int]) : Boolean = {
        var exist = false
        for(i <- num)
            if(i % 2 == 1)
                exist = true
        exist
    }

    def containsOddShrink(num : List[Int]) : Boolean = {
        var exist = false
        for(i <- num; if i % 2 == 1)
            exist = true
        exist
    }

    def containsOddMoreShrink(num : List[Int]) : Boolean = {
        num.exists( _ % 2 == 1)
    }

    def main(args : Array[String]) : Unit = {
        val ListNum = (1 to 100)
        println(ListNum.exists((x:Int) => x < 0))
    }
}
