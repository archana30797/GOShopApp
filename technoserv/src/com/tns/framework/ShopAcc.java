package com.tns.framework;

public class ShopAcc
{
	protected static int accNo;
	protected static String accNm;
	protected float charges;
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public float getCharges() {
		return charges;
	}
	public void setCharges(float charges) {
		this.charges = charges;
	}
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	
	public ShopAcc(int accNo, String accNm, float charges) {
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}
public	void bookProduct(float charges) {
	System.out.println("Product booked and charges are:"+charges);	
		
		
	}
public	void items(float charges) {
	System.out.println("Items are delivered with charges :"+charges);
		
	}
	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
