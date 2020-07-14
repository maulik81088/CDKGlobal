package com.customer.impl;

public abstract class Customer {
    public String custType;

    public abstract String getType();

    public int amount = 0;
    
    public abstract void getCalculateDiscount(int amount);

    public int getFinalAmount() {
	// TODO Auto-generated method stub
	return 0;
    }

}
