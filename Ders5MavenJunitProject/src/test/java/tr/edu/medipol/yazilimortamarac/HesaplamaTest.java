package tr.edu.medipol.yazilimortamarac;

import org.junit.Test;
import org.junit.*;

public class HesaplamaTest {

	@Test
	public void testToplama() {
		int asilSonuc = Hesaplama.toplama(2, 2);
		Assert.assertEquals(4, asilSonuc);
		
		Assert.assertEquals(0, Hesaplama.toplama(-2, 2) );
		
		Assert.assertEquals(0, Hesaplama.toplama(2, -2) );
		
		Assert.assertEquals(99999, Hesaplama.toplama(0, 99999) );
	}
	
	@Test
	public void testCikarma() {
		int asilSonuc = Hesaplama.cikarma(2, 2);
		Assert.assertEquals(0, asilSonuc);
		
		Assert.assertEquals(2, Hesaplama.cikarma(4, 2) );
		
		Assert.assertEquals(6, Hesaplama.cikarma(10, 4) );
	}
	
	@Test
	public void testCarpma() {
		int asilSonuc = Hesaplama.carpma(2, 2);
		Assert.assertEquals(4, asilSonuc);
		
		Assert.assertEquals(8, Hesaplama.carpma(4, 2) );
		
		Assert.assertEquals(40, Hesaplama.carpma(10, 4) );
	}
	
	@Test
	public void testBolme() {
		int asilSonuc = Hesaplama.bolme(2, 2);
		Assert.assertEquals(1, asilSonuc);
		
		Assert.assertEquals(2, Hesaplama.bolme(4, 2) );
		
		Assert.assertEquals(3, Hesaplama.bolme(12, 4) );
	}
	
}