package com.tns.framework;

public  class NormalAcc extends ShopAcc {
	protected static float deliveryCharge=50;
	
	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges);
		this.setDeliveryCharge(deliveryCharge);
	}
	public void bookProduct(float deliveryCharge ) {
		
	}
	@Override
	public String toString() {
		return "NormalAcc [deliveryCharge=" + getDeliveryCharge() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	public float getDeliveryCharge() {
		return deliveryCharge;
	}
	public void setDeliveryCharge(float deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}


}
