package ustbatchno3.junit5testcases;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Testtevenodd {
	@Test
	
	public void testeven()
	{
		int n=12;
		boolean result =Iseven(n);
		assertTrue(result);
	}
	private void assertTrue(boolean result) {
		// TODO Auto-generated method stub
		
	}
	public void testodd()
	{
		int n=12;
		boolean result =Iseven(n);
		assertFalse(result);
	}
	private void assertFalse(boolean result) {
		// TODO Auto-generated method stub
		
	}
	public boolean Iseven(int n)
	{
		return n%2==0;
	}

}