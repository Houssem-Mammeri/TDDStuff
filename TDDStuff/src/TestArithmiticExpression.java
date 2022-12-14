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





}
