import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AdditionExpression extends ArithmeticExpression{

    public AdditionExpression() {
        super();
    }
    public int evaluate() {
        Iterator<Evaluable> it=createIterator();
        int sum=0;
        while(it.hasNext())
        {
            sum=sum+it.next().evaluate();
        }
        return sum;
    }
}
