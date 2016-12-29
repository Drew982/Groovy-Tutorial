/**
 * Created by Andrew on 12/28/2016.
 */
class Main
{
    public static void main (args)
    {
//        println "Hello World!"
//
//        def var = 7 //def lets compiler choose best var type
//        println var.class
//
//        def str = 'Andrew'
//        println str.class
//
//        int[] array = new int[5] //java array
//        def array2 = [] //Groovy array
//        println array
//        println array2
//
//        array2.add(2)
//        array2.add('Andrew')
//        println array2 //prints int AND string in same array
//        println array2.class //Creates ArrayList type class
//
////        array[0] = 'Andrew'
////        println array //Type mismatch - int to string
//
//        def intArray = [3, 2, 7, 9, 0] //Groovy integer array
//        def strArray = ['Andrew'] //Groovy string array
//
////        for(int i = 0; i < 5; i++)
////        {
////            println intArray[i]
////        }
//
//        def name = { current -> println current } //declares variable as type closure -- "it" renamed to current
//
////        intArray.each { println it } // "it" is current item -- closure performs as a function
//        intArray.each(name)
//
//        println intArray.sum() //Performs sum of the array
//        println intArray.sort() //Sorts the array

        def map = [
                age: 37, //Entry
                name: 'Andrew',
                speak: {
                    println 'Hi'
                }
        ]

        println map.age //Calls entry
        println map.name
        println map.speak //Displays the closure address and entry type
        println map.speak() //Calls closure, once closure is finished, returns null

        map.speak() //Operates closure to allow actual closure call

        println method()
        println 3 << 1
    }

    static def method()
    {
//        'Andrew' //Groovy default return when using def is whatever the last line is
    }
}
