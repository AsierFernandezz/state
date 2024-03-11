package patron.state;

public class HabitacionMantenimiento implements HabitacionEstado{

	@Override
	public HabitacionEstado ocupar() {
		System.out.println("La habitacion no puede ser ocupada");
		return this;
	}

	@Override
	public HabitacionEstado liberar() {
		System.out.println("La habitacion está ocupada vacía");
		return new HabitacionOcupadaVacia();
	}

	@Override
	public HabitacionEstado limpiar() {
		System.out.println("La habitación ya está siendo limpiada");
		return this;
	}

	@Override
	public HabitacionEstado salir() {
		System.out.println("La habitacion no cambia de estado");
		return this;
	}

}
