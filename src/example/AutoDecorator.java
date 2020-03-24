package example;

public abstract class AutoDecorator implements Vehiculo{
	private Vehiculo vehiculo;
	
	public AutoDecorator(Vehiculo vehiculo) {
		setVehiculo(vehiculo);
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}	
}
