package PowerSchool;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PS_Test_DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate ref = LocalDate.now();
		LocalTime ref1 = LocalTime.now();
		LocalDateTime ref2 = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDate=ref2.format(myFormatObj);
		System.out.println(formattedDate);

		

	}

}
