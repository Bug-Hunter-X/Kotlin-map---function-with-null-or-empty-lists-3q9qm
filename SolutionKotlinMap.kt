fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result) // Output: [2, 4, 6, 8, 10]

    val emptyList = emptyList<Int>()
    val emptyResult = emptyList.map { it * 2 }
    println(emptyResult) // Output: []

    val nullList: List<Int?>? = null
    val nullResult = nullList?.map { it * 2 } ?: emptyList<Int>()
    println(nullResult) // Output: []
    
    val nullList2: List<Int?>? = listOf(1, null, 3)
    val nullResult2 = nullList2?.map { it?.times(2) ?: 0 }
    println(nullResult2) // Output: [2, 0, 6] 
} 