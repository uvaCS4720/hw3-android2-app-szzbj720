package edu.nd.pmcburne.hwapp.one.data.net

import com.google.gson.annotations.SerializedName

data class ScoreboardResponse(
    val games: List<GameWrapper> = emptyList()
)

data class GameWrapper(
    val game: ApiGame
)

data class ApiGame(
    @SerializedName("gameID") val gameId: String,
    val gameState: String = "",
    val startTime: String = "",
    val startTimeEpoch: String = "0",
    val currentPeriod: String = "",
    val contestClock: String = "",
    val finalMessage: String = "",
    val home: ApiTeam,
    val away: ApiTeam
)

data class ApiTeam(
    val score: String = "",
    val winner: Boolean = false,
    val names: ApiNames
)

data class ApiNames(
    val short: String = ""
)