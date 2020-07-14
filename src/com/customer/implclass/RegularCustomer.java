package com.customer.implclass;

import com.customer.discount.CustomerDiscount;
import com.customer.discount.StepExecution;
import com.customer.impl.Customer;

public class RegularCustomer extends Customer {

    public int amount = 0;

    int finalAmount = 0;

    private int originalAmount = 0;

    public RegularCustomer(String custType, int amount) {
	this.amount = amount;
	this.custType = custType;
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

	StepExecution currentStep = StepExecution.STEP_1;
	switch (currentStep) {
	case STEP_1:
	    executeNoDiscount(currentStep, amount);
	case STEP_2:
	    executeTenPercentDiscount(currentStep, originalAmount);
	case STEP_3:
	    executeFifteenPercentDiscount(currentStep);
	case STEP_4:
	    executeTwenteyPercentDiscount(currentStep, amount);
	case STEP_5:
	    executeThirtyPercentDiscount(currentStep);
	default:
	    noExecution();
	}
    }

    private StepExecution executeNoDiscount(StepExecution currentStep, int amount) {
	CustomerDiscount customerDiscount = CustomerDiscount.NILL;
	this.finalAmount = this.finalAmount + customerDiscount.getDiscount(amount - 5000 >= 0 ? 5000 : amount);
	originalAmount = amount > 5000 ? amount - 5000 : 0;
	return currentStep.nextStep();
    }

    private StepExecution executeTenPercentDiscount(StepExecution currentStep, int originalAmount) {
	if ((5000 <= originalAmount && originalAmount <= 10000) || 5000 - originalAmount < 5000) {
	    CustomerDiscount customerDiscount = CustomerDiscount.TENPERCENT;
	    this.finalAmount = this.finalAmount + customerDiscount.getDiscount(originalAmount - 5000 >= 0 ? 5000 : originalAmount);
	    this.originalAmount = originalAmount - 5000 >= 5000 ? originalAmount - 5000 : originalAmount;
	}
	return currentStep.nextStep();
    }

    private StepExecution executeFifteenPercentDiscount(StepExecution currentStep) {
	return currentStep.nextStep();
    }

    private StepExecution executeTwenteyPercentDiscount(StepExecution currentStep, int amount) {
	if (amount > 10000) {
	    CustomerDiscount customerDiscount = CustomerDiscount.TWENTYPERCENT;
	    this.finalAmount = this.finalAmount + customerDiscount.getDiscount(originalAmount - 10000 >= 10000 ? 10000 : originalAmount);
	}
	return currentStep.nextStep();
    }

    private StepExecution executeThirtyPercentDiscount(StepExecution currentStep) {
	return currentStep.nextStep();
    }

    private StepExecution noExecution() {
	return StepExecution.ACCOMPLISHED;
    }
}
