
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class MathFunTester {

	@Mock
	CalculatorService  service;

	@InjectMocks
	MathFun fun= new MathFun(service);

	@Before
	public void create(){
		MockitoAnnotations.initMocks(this);
		//addition
		when(fun.add(10, 2)).thenReturn(12);
		when(fun.add(10, 10)).thenReturn(20);

		// subtraction
		when(fun.sub(20, 20)).thenReturn(0);
		//when(fun.sub(anyInt(), anyInt())).thenReturn(anyInt());

		//division
		//doThrow(new NotImplementedException()).when(service).add(10, 10);
		
	}


	//Integer test
	@Test
	public void tesAdd(){
		Assert.assertEquals(12, fun.add(10, 2));
		Assert.assertEquals(20, fun.add(10, 10));
	}

	//substraction test
	@Test
	public void testSub(){
		Assert.assertEquals(0, fun.sub(20, 20));
	}
	
	//division test
	@Test
	public void publ() {
		Assert.assertEquals(1, fun.add(10, 10));
	}
	
	@Test
	public void testFunctionCalls(){
		doThrow(new NotImplementedException()).when(service).div(10, 10);
		//verify(service).sub(20, 20);
		verify(service, atLeast(0)).add(10, 10);
	}
	
	
	@Test
	public void orderedTests(){
		InOrder order = inOrder(service);
		
		//order.verify(service.add(10,20));
	}

}

/**
 * Math Function Class Testing
 * @author avdm1h
 */

class MathFun{

	private CalculatorService service;

	public MathFun(CalculatorService service) {
		this.service = service;
	}

	public int add(int a, int b) {
		//return a+b;
		return service.add(a, b);
	}

	public int sub(int a, int b) {
		//return a-b;
		return service.sub(a, b);
	}
	public int mul(int a, int b) {
		//return a*b;
		return service.mul(a, b);
	}
	public int div(int a, int b) {
		//return a/b;
		return service.div(a, b);

	}
}



// 	Calculator service interface
interface CalculatorService{
	public int add(int a, int b);
	public int sub(int a, int b);
	public int mul(int a, int b);
	public int div(int a, int b);
}