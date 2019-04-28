package org.cts.test;

public class Overload {

public void emp(int id) {
System.out.println("enter id:"+id);
}		
public void emp(String name,String Addr) {
	System.out.println("enter name & Address:"+name+" "+Addr);

}
public void emp(float salary,long ph ) {
	System.out.println("enter Salary & contact:"+salary+" "+ph);

}	

public static void main(String[] args) {
	Overload s=new Overload();
	s.emp(12);
	s.emp("Neha", "Chennai");
	s.emp("20000f", "1234567890");
}
}
