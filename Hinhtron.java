
public class Hinhtron {
	Diem a = new Diem();
	double r;
	public Hinhtron(Diem a, double r) {
		this.a = a;
		this.r = r;
	}
	double Chuvi() {
		return (2 * Math.PI * r);
	}
	double Dientich() {
		return (Math.PI * r * r);
	}
}
