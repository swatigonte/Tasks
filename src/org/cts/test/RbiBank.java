package org.cts.test;

public class RbiBank extends SbiBank{
@Override
public void fixed() {
	System.out.println("7%");
}

@Override
	public void current() {
	System.out.println("current");
}

@Override
	public void deposite() {
	System.out.println("3%");
	}
public void joint() {
System.out.println("2%");
}
	public static void main(String[] args) {
		RbiBank rb=new RbiBank();
		rb.deposite();
		rb.fixed();
		rb.current();
		rb.saving();
		rb.joint();
	}
}
