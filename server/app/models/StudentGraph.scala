package models

import scala.io.Source

object StudentGraph {
    val fileLines = Source.fromFile("StudentGraph.csv").getLines
    val students: Map[String, Array[String]] = fileLines.map(line => (
        line.substring(0,line.indexOf(","), 
        line.substring(line.indexOf(",")+1).split(","))))
    println(students)

}