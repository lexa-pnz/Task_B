fun main(args: Array<String>) {
    val inputList: ArrayList<String>
    val formattingInputList: ArrayList<String>

    val workingWithFiles = WorkingWithFiles()
    val findingFastestWay = FindingFastestWay()

    inputList = workingWithFiles.readFile("стандартный ввод.txt")
    formattingInputList = workingWithFiles.formattingInputFileData(inputList)
    findingFastestWay.distanceBetweenCities(formattingInputList)

    val fastestWay = findingFastestWay.findFastestWay()
    workingWithFiles.writeFile("стандартный вывод.txt", fastestWay)

    Utils.printList(inputList)
    println("Fastest Way = $fastestWay")
}
