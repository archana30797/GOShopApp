package com.tns.application;

import com.tns.framework.NormalAcc;
import com.tns.framework.ShopAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;

public class GSShopFactory implements ShopFactory{

	@Override
	public PrimeAcc getNewPrimeAccount(int AccNo, String accNm, float charges, boolean isPrime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NormalAcc getNewNormalAccount(int AccNo, String accNm, float charges, float DeliveryChages) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
