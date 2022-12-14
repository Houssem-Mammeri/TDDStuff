import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AdditionExpression {
private List<IntegerValue> children;

    public AdditionExpression() {
        this.children = new LinkedList<IntegerValue>();
    }

    public void add(IntegerValue integerValue) {

this.children.add(integerValue);
    }

    public int evaluate() {
        Iterator<IntegerValue> it=children.iterator();
        int sum=0;
        while(it.hasNext())
        {
            sum=sum+it.next().evaluate();
        }
        return sum;
    }
}
