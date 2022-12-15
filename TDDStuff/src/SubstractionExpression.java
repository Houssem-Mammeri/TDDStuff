import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SubstractionExpression extends ArithmeticExpression{


    public SubstractionExpression() {
        super();
    }





    public int evaluate() {
        Iterator<Evaluable> it=createIterator();
        int sum=0;
         if(it.hasNext())
           {sum=it.next().evaluate();}


        while(it.hasNext())
        {
            sum=sum-it.next().evaluate();
        }
        return sum;
    }
}























