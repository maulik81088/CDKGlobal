package com.customer.discount;

public enum CustomerDiscount {
    NILL {
	@Override
	public int getDiscount(int amount) {
	    return 0;
	}
    },
    TENPERCENT {
	@Override
	public int getDiscount(int amount) {
	    return (amount * 10) / 100;
	}
    },
    FIFTEENPERCENT {
	@Override
	public int getDiscount(int amount) {
	    return (amount * 15) / 100;
	}
    },
    TWENTYPERCENT {
	@Override
	public int getDiscount(int amount) {
	    return (amount * 20) / 100;
	}
    },
    THIRTYPERCENT {
	@Override
	public int getDiscount(int amount) {
	    return (amount * 30) / 100;
	}
    };

    public abstract int getDiscount(int amount);
}
