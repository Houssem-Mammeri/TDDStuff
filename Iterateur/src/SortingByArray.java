
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

}