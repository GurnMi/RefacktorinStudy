package kr.or.dgit.refactoring_study.statement;

import kr.or.dgit.refactoring_study.Customer;
import kr.or.dgit.refactoring_study.Rental;

public class XmlStatement extends Statement {
	private static final XmlStatement instance = new XmlStatement();
	
	public static XmlStatement getInstance() {
		return instance;
	}
	
	private XmlStatement() {}

	protected String eachRentalString(Rental aEach) {
		return String.format("<title>%s\t%s%n", aEach.getMovie().getTitle(), aEach.getCharge());
	}
	
	protected String footerString(Customer aCustomer) {
		return String.format("<movie>누적 대여료 : %s%n적립 포인트 : %s", aCustomer.getTotalCharge(), aCustomer.getFrequentRenterPoints());
	}
	
	protected String headerString(String customerName) {
		return String.format("<footer>%s 고객님의 대여기록 %n", customerName);
	}

}
