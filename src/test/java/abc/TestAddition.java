package abc;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class TestAddition {
	Addition d=new Addition(); 

	@Test
	void test() {
		assertEquals(8,d.add(6,2));
	}
	@Test 
	void testdivision() {
		AdditionService service=mock(AdditionService.class);
		Addition obj=new Addition(service);
		when(service.addition(6, 2)).thenReturn(8);
		assertEquals(8,obj.addition(6,2));
	}
	

}

