package com.customer.main;

import java.util.Scanner;

import com.customer.impl.Customer;
import com.customer.utils.CustomerProjConsts;
import com.customer.utils.GetCustomerCreateFactory;

public class CalculateDiscount {

    public static void main(String[] args) {
	GetCustomerCreateFactory factoryObj = new GetCustomerCreateFactory();
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Customer amount : ");
	int amount = scanner.nextInt();
	System.out.println("Enter Customer Type (Regular) or (Premium) : ");
	scanner.nextLine();
	String custType = null;

	if (scanner.hasNextLine()) {
	    custType = scanner.nextLine();
	}
	scanner.close();
	Customer customer = factoryObj.getCustomer(custType, amount);
	int finalDicountedAmount;
	String customerType = custType.equalsIgnoreCase(CustomerProjConsts.Premium) ? CustomerProjConsts.PremiumCustomer : CustomerProjConsts.RegularCustomer;

	customer.getType().equalsIgnoreCase(customerType);
	customer.getCalculateDiscount(amount);
	finalDicountedAmount = amount - customer.getFinalAmount();
	
	System.out.println(finalDicountedAmount);
    }
}
