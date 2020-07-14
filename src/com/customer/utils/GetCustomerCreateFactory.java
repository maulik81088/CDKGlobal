package com.customer.utils;

import com.customer.impl.Customer;
import com.customer.implclass.PremiumCustomer;
import com.customer.implclass.RegularCustomer;

public class GetCustomerCreateFactory {

    public Customer getCustomer(String custType, int amount) {
	if (custType == null) {
	    return null;
	}
	if (custType.equalsIgnoreCase(CustomerProjConsts.RegularCustomer) || custType.equalsIgnoreCase(CustomerProjConsts.Regular)) {
	    return new RegularCustomer(CustomerProjConsts.RegularCustomer, amount);
	} else if (custType.equalsIgnoreCase(CustomerProjConsts.PremiumCustomer) || custType.equalsIgnoreCase(CustomerProjConsts.Premium)) {
	    return new PremiumCustomer(CustomerProjConsts.PremiumCustomer, amount);
	}
	return null;
    }
}
