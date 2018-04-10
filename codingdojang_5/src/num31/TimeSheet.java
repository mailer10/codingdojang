package num31;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TimeSheet {

	Date startDate;
	Date endDate;
	
	public TimeSheet(String startTime, String endTime){

		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		
		try {
			this.startDate = sdf.parse(startTime);
			this.endDate = sdf.parse(endTime);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<TimeSheet> log = new ArrayList<>();
		
		log.add(new TimeSheet("09:12:23", "11:14:35"));
		log.add(new TimeSheet("10:34:01", "13:23:40"));
		log.add(new TimeSheet("10:34:31", "11:20:10"));
		
		Scanner sc = new Scanner(System.in);
		
		String checkPoint = sc.next();
		
		sc.close();
		
		int count = 0;
		
		Calendar c = Calendar.getInstance();
		
		Date d = c.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		
		try {
			d = sdf.parse(checkPoint);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0; i<log.size(); i++){
			if(log.get(i).getStartDate().getTime() <= d.getTime()){
				if(d.getTime() <= log.get(i).getEndDate().getTime()){
					count++;
				}
			}
		}
		
		System.out.println(count);
		
	}

}
