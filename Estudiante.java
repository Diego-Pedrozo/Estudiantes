public class Estudiante
{
    private String codigo;
    private String nombre;
    private String telefono;
    private String email;
    private String direccion;
    private Integer edad;
    private String documento;
    private String tipoDoc;
    private Integer creditos;
    private Integer semestre;
    private String estado;
    
    private Carrera carrera;
    private Asignatura asignatura;
       
    public Estudiante(){
        this.codigo = "1151898";
        this.nombre = "Diego";
        this.telefono = "3002133750";
        this.email = "diegoarmandopvil@ufps.edu.co";
        this.direccion = "San luis";
        this.edad = 19;
        this.documento = "1193038104";
        this.tipoDoc = "CC";
        this.creditos = 40;
        this.semestre = 3;
        this.estado = "Activo";
        this.carrera = new Carrera();
    }
    
    public Estudiante(String codigo, String nombre, String telefono, String email, String direccion, Integer edad,String documento, String tipoDoc,Integer creditos,Integer semestre, String estado, Carrera carrera){
        this.codigo = codigo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.edad = edad;
        this.documento = documento;
        this.tipoDoc = tipoDoc;
        this.creditos = creditos;
        this.semestre = semestre;
        this.estado = estado;
        this.carrera = carrera;
    }
    
    //getter and setter
    public String getCodigo(){return codigo;}
    public void setCodigo(String codigo){this.codigo = codigo;}
    
    public String getNombre(){return nombre;}
    public void set(String nombre){this.nombre = nombre;}
    
    public String getTelefono(){return telefono;}
    public void setTelefono(String telefono){this.telefono = telefono;}
    
    public String getEmail(){return email;}
    public void setEmail(String email){this.email = email;}
    
    public String getDireccion(){return direccion;}
    public void setDireccion(String direccion){this.direccion = direccion;}
    
    public Integer getEdad(){return edad;}
    public void setEdad(Integer edad){this.edad=edad;}
    
    public String getDocumento(){return documento;}
    public void setDocumento(String documento){this.documento = documento;}
    
    public String getTipoDoc(){return tipoDoc;}
    public void setTipoDoc(String tipoDoc){this.tipoDoc = tipoDoc;}
    
    public Integer getCreditos(){return creditos;}
    public void setCreditos(Integer creditos){this.creditos = creditos;}
    
    public Integer getSemestre(){return semestre;}
    public void setSemestre(Integer semestre){this.semestre = semestre;}
    
    public String getEstado(){return estado;}
    public void setEstado(String estado){this.estado = estado;}
    
    public Carrera getCarrera(){return carrera;}
    public void setCarrera(Carrera carrera){this.carrera = carrera;}
    
    
    //metodos
    public void  calcularMayorEdad()
    {
        if (getEdad()>=18){
            System.out.println("El estudiante es mayor de edad");
        }
        else {
            System.out.println("El estudiante es menor de edad");}
    }
    
    public void cursoTotalCreditos()
    {
        if(getCreditos()>=carrera.getNumCreditos()){
            System.out.println("El estudiante a cursado:" +getCreditos());
            System.out.println("La carrera tiene:" +carrera.getNumCreditos());
            System.out.println("Estás a un paso de ser:   "+carrera.getTitulo());
        }
        else 
        {   System.out.println("El estudiante a cursado:" +getCreditos());
            System.out.println("La carrera tiene:" +carrera.getNumCreditos());}
    }
    
    public void promedioCreditosSemestre(){
    
       Float promedio=(float)(getCreditos()/getSemestre());
        
        System.out.println("El promedio de creditos cursados es: " + promedio);
    
    }
    
    public void actualizarEstado(){
   
        if (getSemestre()>=carrera.getNumeroSem()*2)
        {
             this.estado ="PFU";
        }
        System.out.println("Los semestres cursados son: " + getSemestre());
        System.out.println("Los semestres cursados son: " +carrera.getNumeroSem());
    
    
    }
    
}

/* Metodos: •Calcular si el estudiante es mayor de edad.
 * •Matricular proyecto de grado, el estudiante debe haber aprobado el 70%
 *  de creditos y estar en 7 semestre o superior.
 * •Obtener el promedio de creditos por semestre.
 * •Mostrar si el estudiante curso el total de creditos de la carrera.
 * •El estudiante puede tener el estado: Matriculado, PFU, 
 */

