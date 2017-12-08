package kr.or.dgit.refactoring_study.price;

import kr.or.dgit.refactoring_study.Movie;

public class PriceFactory {
/*	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	public static final int CHILDRENS = 2;
	*/
	public static Price getFactory(MovieKind priceCode) {

		Price price = null;
		switch(priceCode){
			case REGULAR:
				price = new RegularPrice();
				break;
			case CHILDRENS:
				price = new ChildrenPrice();
				break;
			case NEW_RELEASE:
				price = new NewReleasePrice();
				break;
			default:
				throw new IllegalArgumentException("가격코드가 잘못 됐습니다.");
		}
		return price;
	}

}
