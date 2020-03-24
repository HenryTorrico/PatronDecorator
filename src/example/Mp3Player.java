package example;

public class Mp3Player extends AutoDecorator {

	public Mp3Player(Vehiculo vehiculo) {
		super(vehiculo);
	}

	@Override
	public String getDescription() {
		return getVehiculo().getDescription()+"+ MP3 Player"; 

	}

	@Override
	public int getPrecio() {
		return getVehiculo().getPrecio()+350;

	}	

}
