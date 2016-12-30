import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by Andrew on 12/29/2016.
 */
class AndrewMathTest extends Specification
{
    void setup()
    {

    }

//    def "Test that add works"()
//    {
//        given: //test data that is being used/retrieved
//        AndrewMath andrew = new AndrewMath()
//
//        when: //call method to be tested and gather results
//        int result = andrew.add(0, 0)
//
//        then: //test results against what is expected
//        result == 0
//    }
//
//    def "One plus one equals two"()
//    {
//        given:
//        AndrewMath andrew = new AndrewMath()
//
//        when:
//        int result = andrew.add(1, 1)
//
//        then:
//        result == 2
//    }
//
//    def "three plus five equals 8"()
//    {
//        given:
//        AndrewMath andrew = new AndrewMath()
//
//        when:
//        int result = andrew.add(3, 5)
//
//        then:
//        result == 8
//    }

    @Unroll
    def "#a + #b = #c"()
    {
        given:
        AndrewMath andrew = new AndrewMath()

        when:
        int result = andrew.add(a, b)

        then:
        result == c

        where:
        a || b || c
        1 || 1 || 2
        5 || 5 || 10
    }

    @Unroll
    def "#a / #b = #c"()
    {
        given:
        AndrewMath andrew = new AndrewMath()

        when:
        int result = andrew.div(a, b)

        then:
        result == c
        noExceptionThrown()

        where:
        a || b || c
        1 || 1 || 1
        3 || 2 || 1
    }

    def "Divide by Zero Test"()
    {
            given:
            AndrewMath andrew = new AndrewMath()

            when:
            andrew.div(3, 0)

            then:
            thrown(ArithmeticException)
    }
}