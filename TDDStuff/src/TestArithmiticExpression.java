import org.junit.Test;

import static org.junit.Assert.*;

public class TestArithmiticExpression {


    @Test
    public void testEvaluateOnIntegerValue()
    {
        IntegerValue first =new IntegerValue(7);
        IntegerValue second=new IntegerValue(0);
        IntegerValue third=new IntegerValue(-7);
        assertEquals(7,first.evaluate());
        assertEquals(0,second.evaluate());
        assertEquals(-7,third.evaluate());
    }

    @Test
    public void testEvaluateOnAdditionExpression()
    {
       AdditionExpression first=new AdditionExpression();
       first.add(new IntegerValue(1));
       assertEquals(1,first.evaluate());

       AdditionExpression second=new AdditionExpression();
       second.add(new IntegerValue(5));
       second.add(new IntegerValue(7));
       assertEquals(12,second.evaluate());

        AdditionExpression third=new AdditionExpression();
        third.add(new IntegerValue(1));
        third.add(new IntegerValue(2));
        third.add(new IntegerValue(-3));
        assertEquals(0,third.evaluate());

    }

    @Test
    public void testEvaluateOnSubstractionExpression()
    {
        SubstractionExpression first=new SubstractionExpression();
        first.add(new IntegerValue(1));
        assertEquals(1,first.evaluate());

        SubstractionExpression second=new SubstractionExpression();
        second.add(new IntegerValue(5));
        second.add(new IntegerValue(7));
        assertEquals(-2,second.evaluate());

        SubstractionExpression third=new SubstractionExpression();
        third.add(new IntegerValue(1));
        third.add(new IntegerValue(2));
        third.add(new IntegerValue(-3));
        assertEquals(2,third.evaluate());

    }

    @Test
    public void testEvaluateOnMultiplicationExpression()
    {
        MultiplicationExpression first=new MultiplicationExpression();
        first.add(new IntegerValue(1));
        assertEquals(1,first.evaluate());

        MultiplicationExpression second=new MultiplicationExpression();
        second.add(new IntegerValue(5));
        second.add(new IntegerValue(7));
        assertEquals(35,second.evaluate());

        MultiplicationExpression third=new MultiplicationExpression();
        third.add(new IntegerValue(1));
        third.add(new IntegerValue(2));
        third.add(new IntegerValue(-3));
        assertEquals(-6,third.evaluate());

    }

    @Test
    public void testEvaluateOnDivisionExpression()
    {
        DivisionExpression first=new DivisionExpression();
        first.add(new IntegerValue(1));
        assertEquals(1,first.evaluate());

        DivisionExpression second=new DivisionExpression();
        second.add(new IntegerValue(    15));
        second.add(new IntegerValue(0));
        assertEquals(Integer.MAX_VALUE,second.evaluate());

        DivisionExpression third=new DivisionExpression();
        third.add(new IntegerValue(24));
        third.add(new IntegerValue(2));
        third.add(new IntegerValue(-3));
        assertEquals(-4,third.evaluate());

    }

    @Test
        public  void acceptanceTest() {
            ArithmeticExpression complete;
            complete = new AdditionExpression();
            complete.add(new IntegerValue(2));
            ArithmeticExpression middle = new DivisionExpression();
            complete.add(middle);
            complete.add(new IntegerValue(7));
            ArithmeticExpression leftDiv = new MultiplicationExpression();
            middle.add(leftDiv);
            middle.add(new IntegerValue(6));
            leftDiv.add(new IntegerValue(3));
            ArithmeticExpression subtraction = new SubstractionExpression();
            leftDiv.add(subtraction);
            leftDiv.add(new IntegerValue(6));
            subtraction.add(new IntegerValue(5));
            subtraction.add(new IntegerValue(2));
            assertEquals(2 + (3 * (5 -2)) * 6 /6 + 7 ,complete.evaluate());
        }
    }
















