class FindingFastestWay {
    private val listDistanceBetweenCities: ArrayList<Int> = arrayListOf()

    private val inputListInt: ArrayList<Int> = arrayListOf()
    private var perimeter = 0
    private var countCities = 0

    fun distanceBetweenCities(formattingInputList: ArrayList<String>): ArrayList<Int> {

        for (i in 0 .. formattingInputList.lastIndex) {
            try {
                inputListInt.add(formattingInputList[i].toInt())
            } catch (e: NumberFormatException) {
                println(e)
            }
        }
        perimeter = inputListInt[0]
        countCities = inputListInt[1]

        for (i in 2 until inputListInt.lastIndex) {
            listDistanceBetweenCities.add(inputListInt[i + 1] - inputListInt[i])
        }

        listDistanceBetweenCities.add(perimeter - inputListInt[inputListInt.lastIndex] + inputListInt[2])

        return listDistanceBetweenCities
    }

    fun findFastestWay():Int{
        var min = perimeter

        for (i in 0 until countCities) {
            if (perimeter - listDistanceBetweenCities[i] < min)
                min = perimeter - listDistanceBetweenCities[i]
        }

        return min
    }
}