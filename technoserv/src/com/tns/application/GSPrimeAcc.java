package com.tns.application;

import com.tns.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc{
	private static final float charges=0;

	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		// TODO Auto-generated constructor stub
	}	
public GSPrimeAcc() {
		// TODO Auto-generated constructor stub
	super(accNo, accNm, charges, isPrime);
	}
public	void bookProduct(float charges)
	{
	System.out.println("Dear Prime User, Your Product Charges are: "+charges);
	}

@Override
public String toString() {
	return "GSPrimeAcc [accNo=" + accNo + ", accNm=" + accNm + ", getCharges()=" + getCharges() + ", toString()="
			+ super.toString() + ", isPrime()=" + isPrime() + ", getAccNo()=" + getAccNo() + ", getAccNm()="
			+ getAccNm() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}
public float getCharges() {
	return charges;
}
	
}
