import spock.lang.Specification
/**
 * Created by Andrew on 12/29/2016.
 */
class CalculatorTest extends Specification
{
    void setup()
    {

    }

    def "Calculator's add method calls andrewMath.add"() //Interaction testing using mocks ("half-classes")
    {
        given:
        AndrewMath math = Mock(AndrewMath)
        Calculator calc = new Calculator()
        calc.andrewMath = math

        when:
        7.times {calc.add(1, 1)} //x.times { } needed to match amount of invocations in "then"

        then:
        7 * math.add(_,_) //"x *" tells program to call function x amount of times [invocations]
    }
}
