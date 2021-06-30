
public class main {

	public static void main(String[] args) {
		Diem A = new Diem(0,0);
		Diem B = new Diem(1,1);
		Diem C = new Diem(2,2);
		Duongthang dt = new Duongthang(A,B);
		double AB = dt.tinhdodai();
		System.out.println("do dai AB: "+ AB);
		Duongthang dt1 = new Duongthang(A,C);
		double AC = dt1.tinhdodai();
		System.out.println("do dai AC: "+ AC);
		Duongthang dt2 = new Duongthang(B,C);
		double BC = dt.tinhdodai();
		System.out.println("do dai BC: "+ BC);
		// tam giac
		Tamgiac tg = new Tamgiac(AB, AC, BC);
		System.out.println("Chu vi tam giac: "+ tg.Chuvi());
		System.out.println("Dien tich tam giac: "+ tg.Dientich());
		//chu nhat
		Chunhat cn = new Chunhat(AB, AC);
		System.out.println("Chu vi Chu nhat: "+ cn.Chuvi());
		System.out.println("Dien tich Chu nhat: "+ cn.Dientich());
		//hinh tron
		Hinhtron ht = new Hinhtron(A, 5);
		System.out.println("Chu vi hinh tron: "+ ht.Chuvi());
		System.out.println("Dien tich hinh tron: "+ ht.Dientich());
	}

}
