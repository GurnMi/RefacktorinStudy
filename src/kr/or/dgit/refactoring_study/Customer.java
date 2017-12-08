package kr.or.dgit.refactoring_study;

import java.util.ArrayList;
import java.util.List;

import kr.or.dgit.refactoring_study.statement.Htmlstatement;
import kr.or.dgit.refactoring_study.statement.Statement;
import kr.or.dgit.refactoring_study.statement.StatementFactory;
import kr.or.dgit.refactoring_study.statement.StatementKind;
import kr.or.dgit.refactoring_study.statement.TextStatement;

public class Customer {
	private String name;
	private List<Rental> rentals = new ArrayList<>();

	public Customer(String name) {
		super();
		this.name = name;
	}

	public void addRental(Rental aRental) {
		this.rentals.add(aRental);
	}

	public String getName() {
		return name;
	}

	public List<Rental> getRentals() {
		return rentals;
	}

	public String statement(StatementKind isText) {
		Statement stmt = StatementFactory.getStatement(isText);
		return stmt.value(this);
		//return new TextStatement().value(this);
	}
	
//	public String htmlStatement() {		
//		return new Htmlstatement().value(this);
//	}

	
	
	public int getFrequentRenterPoints() {
		int frequentRenterPoints = 0;
		for(Rental each:rentals) {
			frequentRenterPoints += each.getFrequentRenterPoint();
		}
		return frequentRenterPoints;
	}

	public double getTotalCharge() {
		double totalAmount = 0;
		for(Rental each:rentals) {
			totalAmount +=each.getCharge();
		}
		return totalAmount;
	}

	
/*	private int getFrequentRenterPoint(Rental each) {
		return each.getFrequentRenterPoint();
	}*/

/*	private int getFrequentRenterPoint(Rental each) {
		if((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented()>1)
			return 2;// TODO Auto-generated method stub
		else
			return 1;
	}*/
	
//	private double amountFor(Rental aRental) {
//		return aRental.getCharge();
//	}
	
	/*private double amountFor(Rental aRental) {
		double result =0;
		switch (aRental.getMovie().getPriceCode()) {
		case Movie.REGULAR:
			result += 2;
			if(aRental.getDaysRented()>2)
				result += (aRental.getDaysRented()-2)*1.5;
			break;
		case Movie.NEW_RELEASE:
			result += aRental.getDaysRented()*3;
			break;
		case Movie.CHILDRENS:
			result += 1.5;
			if(aRental.getDaysRented()>3)
				result += (aRental.getDaysRented()-3)*1.5;
			break;
		default:
			break;
		}
		return result;
	}*/
}
