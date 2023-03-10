package ustbatchno3.junit5testcases;

import java.time.LocalDate;

/**
 * @author Administrator
 *
 */
public class Empgoldcoins {

	public String  findcoins(LocalDate date) {
		int dayOfYear=date.getDayOfYear();
		System.out.println(dayOfYear+"+");
		if(dayOfYear<=80&dayOfYear>0)
			return "*****";
		else if (dayOfYear>=80||dayOfYear<172) {
			return "***";
		}else if (dayOfYear>=172||dayOfYear<266) {
			return "*";
		
		}else {
			return "0";
		}
		
		
	}

};


	