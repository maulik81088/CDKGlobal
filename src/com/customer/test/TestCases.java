package com.customer.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.customer.impl.Customer;
import com.customer.utils.CustomerProjConsts;
import com.customer.utils.GetCustomerCreateFactory;

public class TestCases {
    
    GetCustomerCreateFactory factoryObj = new GetCustomerCreateFactory();

    @Test
    public void checkDiscountForRegularCustomer5000() {
	Customer cust = factoryObj.getCustomer(CustomerProjConsts.RegularCustomer, 5000);
	cust.getCalculateDiscount(5000);
	assertEquals("Dicounted value for 5000", 5000 - cust.getFinalAmount(), 5000);
    }

    @Test
    public void checkDiscountForRegularCustomer7000() {
	Customer cust = factoryObj.getCustomer(CustomerProjConsts.RegularCustomer, 7000);
	cust.getCalculateDiscount(7000);
	assertEquals("Dicounted value for 7000", 7000 - cust.getFinalAmount(), 6800);
    }

    @Test
    public void checkDiscountForRegularCustomer10000() {
	Customer cust = factoryObj.getCustomer(CustomerProjConsts.RegularCustomer, 10000);
	cust.getCalculateDiscount(10000);
	assertEquals("Dicounted value for 10000", 10000 - cust.getFinalAmount(), 9500);
    }

    @Test
    public void checkDiscountForRegularCustomer15000() {
	Customer cust = factoryObj.getCustomer(CustomerProjConsts.RegularCustomer, 15000);
	cust.getCalculateDiscount(15000);
	assertEquals("Dicounted value for 15000", 15000 - cust.getFinalAmount(), 13500);
    }
    
    @Test
    public void checkDiscountForPrimumCustomer4000() {
	Customer cust = factoryObj.getCustomer(CustomerProjConsts.PremiumCustomer, 4000);
	cust.getCalculateDiscount(4000);
	assertEquals("Dicounted value for 5000", 4000 - cust.getFinalAmount(), 3600);
    }

    @Test
    public void checkDiscountForPremiumCustomer8000() {
	Customer cust = factoryObj.getCustomer(CustomerProjConsts.PremiumCustomer, 8000);
	cust.getCalculateDiscount(8000);
	assertEquals("Dicounted value for 7000", 8000 - cust.getFinalAmount(), 7000);
    }

    @Test
    public void checkDiscountForPremiumCustomer12000() {
	Customer cust = factoryObj.getCustomer(CustomerProjConsts.PremiumCustomer, 12000);
	cust.getCalculateDiscount(12000);
	assertEquals("Dicounted value for 10000", 12000 - cust.getFinalAmount(), 10200);
    }

    @Test
    public void checkDiscountForPremiumCustomer20000() {
	Customer cust = factoryObj.getCustomer(CustomerProjConsts.PremiumCustomer, 20000);
	cust.getCalculateDiscount(20000);
	assertEquals("Dicounted value for 15000", 20000 - cust.getFinalAmount(), 15800);
    }
}
