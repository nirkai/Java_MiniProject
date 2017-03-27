package primitives;

import static org.junit.Assert.*;

import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

public class Junit_VectorTest {

	@Test
	public void test() {
		Vector test1 = new Vector();
		Vector test2 = new Vector(0, 0, 0);
		//System.out.println(test1);
		//System.out.println(test2);
		//Vector result1 = new Vector(1,2,3);
		//Vector result2 = new Vector(2,4,6);
		assertEquals(test1.compareTo(test2), 0);
		//fail("Not yet implemented");
	}

}
