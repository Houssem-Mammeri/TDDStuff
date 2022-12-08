
public class Loterie extends SortingByArray {
	
	public Loterie() {
		
	super(60);
	}
	
	public String boulesSorties() {
		String res = "";
		for (int i = 0; i < this.items.length; i++) {
			if (itemFound(i))
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
