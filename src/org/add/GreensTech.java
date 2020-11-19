package org.add;

public class GreensTech {
	public void greensOmr(int n,String name) {
		System.out.println("student id num and Name :"+(n+name));

	}
	public void greensOmr( int n) {
		System.out.println("Omr Student Id :"+n);

	}
	public void greensOmr(String name) {
		System.out.println("Student Name :" + name);

	}
	public void greensOmr(long mobile,String name) {
		System.out.println("Student Mobile num and Name :"+(mobile + name));

	}
	public void greensOmr(double sal) {
		System.out.println("Staf Salary :"+ sal);

	}
	public void greensOmr(String name, long mobile) {
		System.out.println("Student name and Mobile num :"+(name+mobile));

	}
	public static void main(String[] args) {
		GreensTech g=new GreensTech();
		g.greensOmr(5252);
		g.greensOmr(5235.50);
		g.greensOmr("Tharaniventhan");
		g.greensOmr(6524, "Mathi");
		g.greensOmr(8564259874l, "Seemon");
		g.greensOmr("Mullai", 9652498655l);
		
	}

}
