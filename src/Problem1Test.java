import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

public class Problem1Test {

	public int a[], aValue, aResult;
	public int b[], bValue, bResult;
	
	public int nullArray[], cValue, cResult;

	public Problem1Test() {
		this.a = new int[] {2,3,5};
		this.aValue = 2;
		this.aResult = 0;
		
		
		this.b = new int[] {2,3,5};
		this.bValue = 3;
		this.bResult = 1;
		this.nullArray = null;
		this.cValue = 1;
		this.cResult = -1;
	}


	@Test
	public void testA() {
		assertTrue("Testerz", aResult == Problem1.findLast(a, aValue));
	}
	
	@Test
	public void testB() {
		assertTrue("Testerz", bResult == Problem1.findLast(a, bValue));
	}
	
	@Test
	public void testC() {
		try{
			Problem1.findLast(nullArray, cValue);
			assertTrue("Testerz", false);
		}catch(NullPointerException e){
			assertTrue("Testerz", true);
		}
	}
	
}
