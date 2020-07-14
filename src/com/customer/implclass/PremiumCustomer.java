package com.customer.implclass;

import com.customer.discount.CustomerDiscount;
import com.customer.impl.Customer;

public class PremiumCustomer extends Customer {

    public int amount = 0;

    int finalAmount = 0;

    private int originalAmount = 0;

    public PremiumCustomer(String premiumcustomer, int amount) {
	this.amount = amount;
	this.custType = premiumcustomer;
    }

    public String getType() {
	return custType;
    }

    public int getAmount() {
	return amount;
    }

    public int getFinalAmount() {
	return finalAmount;
    }

    public void getCalculateDiscount(int amount) {
	originalAmount = amount;

	if ((0 < amount && amount < 4000) || amount >= 4000) {
	    CustomerDiscount customerDiscount = CustomerDiscount.TENPERCENT;
	    this.finalAmount = this.finalAmount  + customerDiscount.getDiscount(amount - 4000 >= 0 ? 4000 : amount);
	    this.originalAmount = amount > 4000 ? amount - 4000 : 0;
	}
	if ((4000 <= originalAmount && originalAmount < 8000) || 4000 - originalAmount < 4000) {
	    CustomerDiscount customerDiscount = CustomerDiscount.FIFTEENPERCENT;
	    this.finalAmount = this.finalAmount + customerDiscount.getDiscount(originalAmount - 4000 >= 0 ? 4000 : originalAmount);
	    this.originalAmount = originalAmount > 4000 ? originalAmount - 4000 : 0;
	}
	if ((8000 <= originalAmount && originalAmount < 12000) || 4000 - originalAmount < 4000) {
	    CustomerDiscount customerDiscount = CustomerDiscount.TWENTYPERCENT;
	    this.finalAmount = this.finalAmount + customerDiscount.getDiscount(originalAmount - 4000 >= 0 ? 4000 : originalAmount);
	    this.originalAmount = originalAmount > 4000 ? originalAmount - 4000 : 0;
	}
	if (12000 <= amount) {
	    CustomerDiscount customerDiscount = CustomerDiscount.THIRTYPERCENT;
	    this.finalAmount = this.finalAmount + customerDiscount.getDiscount(originalAmount - 12000 >= 12000 ? 12000 : originalAmount);
	}
    }
}
