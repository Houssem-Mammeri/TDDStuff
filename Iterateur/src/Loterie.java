
public class Loterie extends SortingByArray {
	
	public Loterie() {
		
	super(60);
	}
	
	public String boulesSorties() {
		String res = "";
		SortedItemsIterator it=this.createIterator();
		
		while(it.hasNext()) {
			int i=it.next();
				if (res.equals(""))
					res += i;
				else
					res = res + " " + i;
		}
		return res;
	}



	public void addBoule(int valeur) {
		this.addItem(valeur);
		
	}
}
