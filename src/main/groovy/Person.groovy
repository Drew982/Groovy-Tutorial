import groovy.transform.ToString

/**
 * Created by Andrew on 12/29/2016.
 */

@ToString(includeNames = true) //adds groovy toString annotation -- ex. output: Person(27, Andrew, Johnson)
class Person
{
    int age
    String name
    String lastName

    /* Java version of override annotation for toString */
//    @Override
//    String toString()
//    {
//        "The age is $age"
//    }
}
