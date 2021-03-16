package models

import scala.io.Source

object StudentGraph {
    val fileLines = Source.fromFile("C:/Users/charg/WebApps/group-work-1-team-2/server/app/models/StudentGraph.csv").getLines
    val students: Map[String, Array[String]] = fileLines.map(line => (
        line.substring(0,line.indexOf(",")), 
        line.substring(line.indexOf(",")+1).split(","))).toMap
    

    def getFriends(name: String): Array[String] = students.get(name).getOrElse(Array[String]("No friends"))

}