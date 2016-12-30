/**
 * Created by Andrew on 12/28/2016.
 */
class Main
{
    public static void main (args)
    {
        Person person = new Person(age: 27, name: 'Andrew', lastName: 'Johnson')
        println person

        def map = [
                age: 27,
                name: 'Lee',
                lastName: 'Preswood'
        ] as Person

        println map.getClass() //displays LinkedHashMap
    }
}
