
import factory.*;

public class Main {
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("java Main class.name.of.ConcreateFactory");	
			System.exit(1);
		}

		Factory factory = Factory.getFactory(args[0]);

		Link joins = factory.createLink("JoongAng ilbo", 	
			"http://www.joins.com");
		Link chosun = factory.createLink("Chosun ilbo", 	
			"http://www.chosun.com");

		Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com");
		Link kr_yahoo = factory.createLink("Yahoo!Kr", "http://www.yahoo.co.kr");
		Link excite = factory.createLink("Excite", "http://www.excite.com");
		Link google = factory.createLink("Google", "http://www.google.com");
		
		Tray traynews = factory.createTray("News");
		traynews.add(joins);
		traynews.add(chosun);
		Tray trayyahoo = factory.createTray("Yahoo");
		trayyahoo.add(us_yahoo);
		trayyahoo.add(kr_yahoo);

		Tray traysearch = factory.createTray("Search");
		traysearch.add(trayyahoo);
		traysearch.add(excite);
		traysearch.add(google);

		Page page = factory.createPage("LinkPage", "YoungJin");
		page.add (traynews);
		page.add (traysearch);

		page.output();
	}
}
