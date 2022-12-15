import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class ArithmeticExpression implements  Evaluable{
    private List<Evaluable> children;
    public Iterator<Evaluable> createIterator() {return children.iterator();}
    public ArithmeticExpression() {
        this.children = new LinkedList<Evaluable>();
    }
    public void add(Evaluable evaluable) {this.children.add(evaluable);}
    public abstract int evaluate();


}
