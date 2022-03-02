import java.io.File

class WorkingWithFiles {

    fun readFile(fileName: String): ArrayList<String>{
        val inputList: ArrayList<String> = arrayListOf()

        try {
            File(fileName).forEachLine { inputList.add(it) }
        } catch (e:Exception){
            println(e.message)
        }

        return inputList
    }

    fun formattingInputFileData(inputList: ArrayList<String>): ArrayList<String>{
        val formattingInputList: ArrayList<String> = arrayListOf()

        for (i in 0 .. inputList.lastIndex) {
            val lines = inputList[i]

            var symbols = ""
            for (j in lines.indices) {

                if (!lines[j].equals(' ')){
                    symbols += lines[j]
                }
                else{
                    formattingInputList.add(symbols)
                    symbols = ""
                }

                if (j == lines.length-1)
                    formattingInputList.add(symbols)
            }
        }
        return formattingInputList
    }

    fun writeFile(fileName: String, text:Int){

        try{
            val newFile = File(fileName)
            newFile.writeText(text.toString())
        } catch (e: Exception){
            println(e.message)
        }
    }
}