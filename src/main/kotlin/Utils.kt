class Utils {

    companion object {
        @JvmName("printListInt")
        fun printList(list: ArrayList<Int>){
            for (item in list) { println(item) }
        }

        @JvmName("printListString")
        fun printList(list: ArrayList<String>){
            for (item in list) { println(item) }
        }
    }
}