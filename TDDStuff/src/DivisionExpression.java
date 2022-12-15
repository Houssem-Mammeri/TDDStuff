import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DivisionExpression extends ArithmeticExpression {

    public DivisionExpression() {
        super();
    }

    public int evaluate() {
        int sum=0;
        Iterator<Evaluable> it=createIterator();
        if(it.hasNext())
        {sum=it.next().evaluate();}

        while(it.hasNext())

        {  int eval = it.next().evaluate();
            if(eval==0)
              {sum=Integer.MAX_VALUE;}
           else
        {sum=sum/eval;}

        }
        return sum;
    }
}
