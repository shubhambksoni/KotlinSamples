import java.util.Arrays

fun main() {
    //ways to create arrays
    var arr1 = arrayOf(1,2,3,4,5)
    var arr2 = IntArray(3) {i -> i*2};
    var arr = (3..9).toList().toTypedArray();
    
    //accessing elements 
    println(arr.get(3))		
    println(arr[3])
    //println(arr[33])		                    //out of bounds Exception
    //println(arr.get(23))	                  //out of bounds Exception
    
    //basic operations
    arr[0] = 4
    arr.set( 0, 5 )
    println( Arrays.toString( arr.plus(1) ) ) //creates new array with one extra element at end
    println( arr.first() )
    println( arr.last() )
    println( arr.indexOf(5) )
    println( Arrays.toString( arr.sliceArray(1..3) ) )
    
    //built-ins
    println( arr.average() )
    println( arr.count() )
    println( arr.sum() )
    println( arr.max() )
    println( arr.min() )
 	
    //filtered count 
    println( arr.count { it%2==1 } )		     //odd number count
    
    //traversal
    for(element in arr) {
        println(element)
    }
    println("--")
    arr.forEach { println(it) }
    println("--")
    
    //using iterator for traversal
    val iterator: Iterator<Int> = arr.iterator()
    while(iterator.hasNext()) {
        println(iterator.next())
    }
    
    //indexed traversal
    arr.forEachIndexed {index, item -> println("Index: $index, Item: $item")}
    
    //sorting arrays
	println(Arrays.toString(arr.sortedArray()))
    println(Arrays.toString(arr.sortedArrayDescending()))
    
    //getting a filtered array
    val newArr = arr.filter { it -> it>6 }
    println(newArr)
    
    
    //find
    println(arr.find { it%2==0 })
    println(arr.findLast { it%2==0 })
    println("--")
    
    //reduce
    println(arr.reduce {sum, item -> sum + item })		//sum is initialized with first value of arr
    
    //fold
    println(arr.fold(0, {sum, item -> sum + item}))		//sum is initialized with 0, same as reduce otherwise
    
    //all
    println(arr.all { it>0 })
    
    //any
    println(arr.any { it>8 })
}
