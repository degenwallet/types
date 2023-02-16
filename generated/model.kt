@Serializable
data class MyStruct (
	var my_name: String,
	var my_age: UInt
)

@Serializable
sealed class BestHockeyTeams {
	@Serializable
	@SerialName("MontrealCanadiens")
	object MontrealCanadiens: BestHockeyTeams()
	@Serializable
	@SerialName("Lies")
	data class Lies(val content: String): BestHockeyTeams()
}

