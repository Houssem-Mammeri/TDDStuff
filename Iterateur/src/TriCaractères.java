
public class TriCaractères extends SortingByArray{
	

	public TriCaractères() {
		super(26);
	}

	public String lettresTrouvées(String phrase) {
		trierCaractères(phrase);
		return occurencesLettresTriées();
	}

	private String occurencesLettresTriées() {
		String res = "";
		for (int i = 0; i < this.items.length; i++) {
			if (itemFound(i))
				for (int j = 0; j < this.items[i]; j++)
					res+= (char)('a' + i);
		}
		return res;
	}

	private void trierCaractères(String phrase) {
		for (int i = 0; i < phrase.length(); i++) {
			char c = Character.toLowerCase(phrase.charAt(i));
			if (this.isAlphabetical(c))
				this.addItem(c-'a');
		}
	}

	private boolean isAlphabetical(char c) {
		return c >= 'a' && c <= 'z';
	}

}
