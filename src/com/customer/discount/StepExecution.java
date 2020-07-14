package com.customer.discount;


public enum StepExecution {
    STEP_1 {
	@Override
	public StepExecution nextStep() {
	    return STEP_2;
	}
    },
    STEP_2 {
	@Override
	public StepExecution nextStep() {
	    return STEP_3;
	}
    },
    STEP_3 {
	@Override
	public StepExecution nextStep() {
	    return STEP_4;
	}
    },
    STEP_4 {
	@Override
	public StepExecution nextStep() {
	    return STEP_5;
	}
    },
    STEP_5 {
	@Override
	public StepExecution nextStep() {
	    return this;
	}
    },
    ACCOMPLISHED {
	@Override
	public StepExecution nextStep() {
	    return this;
	}
    };

    public String value() {
	return name();
    }

    public static StepExecution fromValue(String state) {
	return valueOf(state);
    }

    public abstract StepExecution nextStep();
}