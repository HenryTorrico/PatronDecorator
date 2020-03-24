package example;

public class CdPlayer extends AutoDecorator{

	public CdPlayer(Vehiculo vehiculo) {
		super(vehiculo);
	}

	@Override
	public String getDescription() {
		return getVehiculo().getDescription()+"+ CD Player"; 

	}

	@Override
	public int getPrecio() {
		return getVehiculo().getPrecio()+150;

	}	
	
	

}
