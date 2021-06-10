
public class Trojuhelnik {
	String aStranaString = null;
	String bStranaString = null;
	String cStranaString = null;

	int aStrana = 0;
	int bStrana = 0;
	int cStrana = 0;

	@Override
	public String toString() {
		return "Trojuhelnik [aStrana=" + aStrana + ", bStrana=" + bStrana + ", cStrana=" + cStrana + "]";
	}

	public Trojuhelnik(String aStranaString, String bStranaString, String cStranaString) {
		this.aStranaString = aStranaString;
		this.bStranaString = bStranaString;
		this.cStranaString = cStranaString;
		assert this.checkInputs() : "The inputs are not valid.";
		assert this.checkTrojuhelnikStrany() : "Trojuhelnik nebyl vytvoren. Strany nejsou validni pro vytvoreni trojuhelniku.";	
	}

	public int getObvod() {
		return aStrana + bStrana + cStrana;
	}

	public int getObsah() {
		double s = (aStrana + bStrana + cStrana) / 2;
		return (int) Math.sqrt(s * (s - aStrana) * (s - bStrana) * (s - cStrana));
	}

	private boolean checkTrojuhelnikStrany() {
		if ((aStrana + bStrana) > cStrana && (aStrana + cStrana) > bStrana && (bStrana + cStrana) > aStrana) {
			return true;
		}
		return false;
	}

	private boolean checkInputs() {
		try {
			this.aStrana = Integer.parseInt(this.aStranaString);
			this.bStrana = Integer.parseInt(this.bStranaString);
			this.cStrana = Integer.parseInt(this.cStranaString);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
