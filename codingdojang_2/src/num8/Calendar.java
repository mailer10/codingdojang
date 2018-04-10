package num8;

public enum Calendar {

	January(31,"1월")
	, February(28,"2월")
	, March(31,"3월")
	, April(30,"4월")
	, May(31,"5월")
	, June(30,"6월")
	, July(31,"7월")
	, August(31,"8월")
	, September(30,"9월")
	, October(31,"10월")
	, November(30,"11월")
	, December(31,"12월");

	int date;
	String korName;
	
	private Calendar(int date, String korName){
		this.date = date;
		this.korName = korName;
	}
	
}
