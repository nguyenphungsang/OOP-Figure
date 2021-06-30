
public class Tamgiac {
	double a, b, c;
	public Tamgiac(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	double Chuvi() {
		return a + b + c;
	}
	double Dientich() {
		double p = (a + b + c)/2;
		return Math.sqrt(p * (p-a)* (p-b)*(p-c));
	}
}
