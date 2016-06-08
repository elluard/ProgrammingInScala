/**
  * Created by leehwangchun on 2016. 6. 8..
  */
object FileMatcher {
    private def filesHere = (new java.io.File(".")).listFiles

    def filesEnding(query : String) =
        filesMatching(query, _.endsWith(_))

    def filesContaining(query : String) =
        filesMatching(query, _.contains(_))

    def filesRegex(query : String) =
        filesMatching(query, _.matches(_))

    def filesMatching(query : String, matcher: (String, String) => Boolean) = {
        for(file <- filesHere; if matcher(file.getName, query))
            yield file
    }

    def main(args : Array[String]) : Unit = {
        val value = filesEnding("iml")
        println(value)
    }
}
