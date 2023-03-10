package ustbatchno3.junit5testcases;


import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

public class Testgoldcoins {
	@Test
	public void testofgoldcoins() {
		
		Empgoldcoins s= new Empgoldcoins();
		assertEquals("*****",s.findcoins(LocalDate.of(2023, 2, 14)));
		assertEquals("***",s.findcoins(LocalDate.of(2023, 4, 14)));
		assertEquals("*",s.findcoins(LocalDate.of(2023,7, 11)));
		assertEquals("0",s.findcoins(LocalDate.of(2023,12,12)));
		
		
	}
}
