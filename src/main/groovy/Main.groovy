/**
 * Created by Andrew on 12/28/2016.
 */
class Main
{
    public static void main (args)
    {
        println "Hello World!"

        def var = 7 //def lets compiler choose best var type
        println var.class

        def str = 'Andrew'
        println str.class

        int[] array = new int[5] //java array
        def array2 = [] //Groovy array
        println array
        println array2

        array2.add(2)
        array2.add('Andrew')
        println array2 //prints int AND string in same array

//        array[0] = 'Andrew'
//        println array //Type mismatch - int to string
        
    }
}
