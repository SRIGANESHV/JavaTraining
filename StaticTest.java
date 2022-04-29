
public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}

class Kite{
	
	private String kiteColor;
	private String kiteOwner;
	private int length;
	static int kiteCount; // Class's data/Shared data across the object
	
	@Override
	public String toString() {
		return "Kite [kiteColor=" + kiteColor + ", kiteOwner=" + kiteOwner + ", length=" + length + "]";
	}

	

	public Kite(String kiteColor, String kiteOwner, int length) {
		super();
		this.kiteColor = kiteColor;
		this.kiteOwner = kiteOwner;
		this.length = length;
	}
}
