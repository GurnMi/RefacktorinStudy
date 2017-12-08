package kr.or.dgit.refactoring_study.price;

import kr.or.dgit.refactoring_study.Movie;

public abstract class Price {
	public abstract MovieKind getPriceCode();
	
	public abstract double getCharge(int aDaysRented);
	
	public int getFrequentRenterPoint(int aDaysRented) {
		return 1;
	};
}
