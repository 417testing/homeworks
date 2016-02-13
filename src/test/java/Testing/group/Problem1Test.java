package Testing.group;

import java.util.Arrays;
import java.util.Collection;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Problem1Test extends TestCase{

	public int a[], aValue, aResult;
	public int b[], bValue, bResult;
	
	public int nullArray[], cValue, cResult;

	public Problem1Test(String testName) {
		super(testName);
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
	
	public static Test suite()
    {
        return new TestSuite( Problem1Test.class );
    }


	public void testA() {
		assertTrue("Testerz", aResult == Problem1.findLast(a, aValue));
	}
	
	public void testB() {
		assertTrue("Testerz", bResult == Problem1.findLast(a, bValue));
	}
	
	public void testC() {
		try{
			Problem1.findLast(nullArray, cValue);
			assertTrue("Testerz", false);
		}catch(NullPointerException e){
			assertTrue("Testerz", true);
		}
	}
	
}
