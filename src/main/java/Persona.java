public class Persona {


    //atributos
    private String nombre;
    private String apellido;
    private int edad;

    //constructor personalizado
    // public Persona(){
    //    nombre = "invitado";
    //}

    // constructor generado
    //public Persona(String nombre) {
    //    this.nombre = nombre;
    //}

    //Metodos
    public void mostrarInformacion(){
        System.out.println("nombre:"+nombre);
        System.out.println("apellido:"+apellido);
        System.out.println(" "+edad);
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad>0){
        this.edad = edad;
    }}
}
