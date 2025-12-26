package Kotlin.Practice2

import java.io.Serializable

fun main() {

	for(x in Directions.NORTH.country.sortedArrayDescending()){
		println(x)
	}
}

enum class Directions(var direction: String, var country: Array<String>) {
	NORTH("North", arrayOf("Russia", "Greenland", "Iceland")),
	SOUTH("South", arrayOf("Philippines", "Thailand")),
	EAST("East", arrayOf("korea", "China")),
	WEST("West", arrayOf("America","Italy"))
}