
public class Duongthang {
	private Diem a = new Diem();
	private Diem b = new Diem();

	public Duongthang(Diem a, Diem b) {
		this.a = a;
		this.b = b;
	}
	public Duongthang() {
		
	}
	public Diem getA() {
		return a;
	}

	public void setA(Diem a) {
		this.a = a;
	}

	public Diem getB() {
		return b;
	}

	public void setB(Diem b) {
		this.b = b;
	}
	public double tinhdodai() {
		return Math.sqrt(Math.pow(a.getX()-b.getX(),2)+Math.pow(a.getY()-b.getY(), 2));
	}
}
