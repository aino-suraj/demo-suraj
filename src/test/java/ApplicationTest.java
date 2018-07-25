import static org.junit.Assert.*;

import org.junit.Test;

public class ApplicationTest {

	@Test
	public void test() {
		SampleClass obj=new SampleClass();
			
		assertEquals(obj.getSample(),"maven_sample_two");
	
	}
	
}
