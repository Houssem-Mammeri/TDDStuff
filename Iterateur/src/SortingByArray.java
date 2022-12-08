
public class SortingByArray {

	protected int[] items;

	public SortingByArray(int nbrItems) {
		this.items=new int [nbrItems];
	}

	protected void addItem(int valeur) {
		this.items[valeur]+=1;
	}

	protected boolean itemFound(int valeur) {
		return this.items[valeur] > 0;
	}


public SortedItemsIterator createIterator()

{
return new SortedItems();
}

class SortedItems implements SortedItemsIterator {
private int curseur=-1;
	@Override
	public boolean hasNext() {
		for (int i=curseur+1;i <items.length;i++)
		{
			if(itemFound(i))
				 return true;}
			
			return false;}
	@Override
	public int next() {
		for (int i=curseur+1;i <items.length;i++)
		{
			if(itemFound(i))
				 return i;}
			
			return -1;
	}
		
}}


	
	
	

