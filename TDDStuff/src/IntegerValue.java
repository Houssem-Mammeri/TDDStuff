public class IntegerValue implements Evaluable{
public int val;

    public IntegerValue(int n ) {
        this.val=n;
    }
    public int evaluate()
    {return val;}
}
