package kr.or.dgit.refactoring_study.statement;

import java.util.List;

import kr.or.dgit.refactoring_study.Customer;
import kr.or.dgit.refactoring_study.Rental;

public class Htmlstatement extends Statement {

	protected String eachRentalString(Rental aEach) {
		return String.format("%s : %s<br>%n", aEach.getMovie().getTitle(), aEach.getCharge());
	}

	protected String footerString(Customer aCustomer) {
		return String.format("<p>누적 대여료 : <EM>%s</EM>%n<p>적립 포인트 : <EM>%s</EM><p>", aCustomer.getTotalCharge(),
				aCustomer.getFrequentRenterPoints());
	}

	protected String headerString(String customerName) {
		return String.format("<H1><EM>%s 고객님의 대여기록 </EM><H1><P>%n", customerName);
	}

}
