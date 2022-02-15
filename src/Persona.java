
public class Persona {
	private String nombre;
	private int edad;
	private double estatura;
	
	public Persona(String nombre, int edad, double estatura) {
		//super();
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
	}

	public Persona(String nombre){
		this.nombre = nombre;
	}
	
	public Persona(){
		
	}
	public int getEdad() {
		return edad;
	}
	
	public double getEstatura() {
		return estatura;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
