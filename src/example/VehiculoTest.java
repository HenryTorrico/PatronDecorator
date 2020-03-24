package example;

import org.junit.Test;

import junit.framework.Assert;



public class VehiculoTest {
	
	@Test
	public void testForFiatPrice() {
		Vehiculo fiat=new FiatUno();
		fiat=new AireAcondicionado(fiat);
		fiat=new Mp3Player(fiat);
		Assert.assertEquals(16850,fiat.getPrecio()); 
	}
	
	@Test
	public void testForFordPrice() {
		Vehiculo ford=new FordFiesta();
		ford=new AireAcondicionado(ford);
		ford=new CdPlayer(ford);
		Assert.assertEquals(26650,ford.getPrecio()); 
	}
	
	@Test
	public void testForFiatDescription() {
		Vehiculo fiat=new FiatUno();
		fiat=new AireAcondicionado(fiat);
		fiat=new Mp3Player(fiat);
		Assert.assertEquals("Fiat Uno Modelo 2006+ Aire Acondicionado+ MP3 Player",fiat.getDescription()); 
	}
	
	@Test
	public void testForFordDescription() {
		Vehiculo ford=new FordFiesta();
		ford=new AireAcondicionado(ford);
		ford=new CdPlayer(ford);
		Assert.assertEquals("Ford Fiesta Modelo 2008+ Aire Acondicionado+ CD Player",ford.getDescription()); 
	}
	

	

}

