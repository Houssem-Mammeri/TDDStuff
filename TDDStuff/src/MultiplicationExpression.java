import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MultiplicationExpression extends ArithmeticExpression{

    public MultiplicationExpression() {
        super();
    }







    public int evaluate() {
        Iterator<Evaluable> it=createIterator();
        int sum=1;
        while(it.hasNext())
        {
            sum=sum*it.next().evaluate();
        }
        return sum;
    }
}
