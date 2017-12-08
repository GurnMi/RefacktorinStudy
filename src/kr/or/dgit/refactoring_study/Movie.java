package kr.or.dgit.refactoring_study;

import kr.or.dgit.refactoring_study.price.ChildrenPrice;
import kr.or.dgit.refactoring_study.price.MovieKind;
import kr.or.dgit.refactoring_study.price.NewReleasePrice;
import kr.or.dgit.refactoring_study.price.Price;
import kr.or.dgit.refactoring_study.price.PriceFactory;
import kr.or.dgit.refactoring_study.price.RegularPrice;

public class Movie {


	private String title;
	private Price price;

	public Movie(String title, MovieKind priceCode) {
		super();
		this.title = title;
		setPriceCode(priceCode);
	}

	public MovieKind getPriceCode() {
		return price.getPriceCode();
	}

	public void setPriceCode(MovieKind priceCode){
		price = PriceFactory.getFactory(priceCode);
		
	}

	public String getTitle() {
		return title;
	}
	
	public double getCharge(int aDaysRented) {
		return price.getCharge(aDaysRented);
	}
	
	public int getFrequentRenterPoint(int aDaysRented) {
			return price.getFrequentRenterPoint(aDaysRented);
	}

	
}
