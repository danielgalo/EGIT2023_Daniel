
public class Persona {
  private String nombre;
  private String apellidos;
  private int edad;
  
  public Persona(String nombre, String apellidos, int edad) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.edad = edad;
  }
  
  public int cumpleanios() {
    edad += 1;
    return edad;
  }

  public String datosPersona() {
    return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
  }
  
  
  
}
