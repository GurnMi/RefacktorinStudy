package kr.or.dgit.refactoring_study.statement;

public class StatementFactory {


	public static Statement getStatement(StatementKind isText) {
		Statement stmt = null;
		switch(isText){
		case TEXT:
			stmt = new TextStatement();
			break;
		case HTML:
			stmt = new Htmlstatement();
			break;
		case Xml:
			stmt = XmlStatement.getInstance();
			break;
		default:
		}
		return stmt;
	}

}
