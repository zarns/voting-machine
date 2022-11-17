package votingMachine

class Ballot {
    private var preferences: IntArray

    companion object {
        fun ballotFromString(ballotString: String) : Ballot {
            val preferences: IntArray = ballotString.split(",").map{it.toInt()}.toIntArray()
            return Ballot(preferences)
        }
    }

    constructor(preferencesArray: IntArray) {
        preferences = preferencesArray
    }
    override fun toString(): String {
        return preferences.contentToString()
    }
    fun get(): IntArray {
        return this.preferences
    }
}