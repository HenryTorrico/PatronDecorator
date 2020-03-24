package example;

public class AireAcondicionado extends AutoDecorator {

	public AireAcondicionado(Vehiculo vehiculo) {
		super(vehiculo);
	}

	@Override
	public String getDescription() {
		return getVehiculo().getDescription()+"+ Aire Acondicionado"; 
	}

	@Override
	public int getPrecio() {
		return getVehiculo().getPrecio()+1500;
	}
	

}
