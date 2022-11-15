package paintCalculatorModel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class DimesionalCalculationsTest {

	DimensionalCalculations cal;
	
	@Test
	public void testHeight() {
		cal=new DimensionalCalculations(11,10,10);
		assertEquals(11,cal.getHeight());
		
	}
	
	@Test
	public void testWidth() {
		cal=new DimensionalCalculations(10,11,10);
		assertEquals(11,cal.getWidth());
	}
	
	@Test
	public void testLength() {
		cal=new DimensionalCalculations(10,10,11);
		assertEquals(11,cal.getLength());
	}
	
	@Test
	public void testArea() {
		cal=new DimensionalCalculations(10,10,12);
		assertEquals(100,cal.getArea());
	}
	
	@Test
	public void testVolume() {
		cal=new DimensionalCalculations(10,10,10);
		assertEquals(1000,cal.getRoomVolume());
		
	}
	
	@Test
	public void testFloorArea() {
		cal=new DimensionalCalculations(12,10,10);
		assertEquals(100,cal.getFloorArea());
	}
	
	@Test
	public void testException() throws Exception{
		assertThrows(IllegalArgumentException.class,()->{new DimensionalCalculations(0,10,0);});
		assertThrows(IllegalArgumentException.class,()->{new DimensionalCalculations(10,0,0);});
		assertThrows(IllegalArgumentException.class,()->{new DimensionalCalculations(10,10,-1);});
		
			
		
	}
}
