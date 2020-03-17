import java.util.*;

public class Carrera
{
    private String codigo;
    private String nombre;
    private String telefono;
    private Integer numeroSem;
    private Integer numCreditos;
    private String titulo;
    private String director;
    Date fechaIni;
    
    //constructor
    public Carrera(){
        this.codigo="015";
        this.nombre="Ingeniería de Sistemas";
        this.numeroSem=10;
        this.numCreditos=150;
        this.titulo="Ingeniero de Sistemas";
        this.director="Oscar Gallardo";
        this.fechaIni= new java.util.Date();
    }
    
    public String getCodigo(){return codigo;}
    public void setCodigo(String codigo){this.codigo = codigo;}
    
    public String getNombre(){return nombre;}
    public void seNombre(String nombre){this.nombre = nombre;}
    
    public String getTelefono(){return telefono;}
    public void setTelefono(String telefono){this.telefono = telefono;}
    
    public Integer getNumeroSem(){return numeroSem;}
    public void setNumeroSem(Integer numeroSem){this.numeroSem = numeroSem;}
    
    public Integer getNumCreditos(){return numCreditos;}
    public void setNumCreditos(Integer numCreditos){this.numCreditos = numCreditos;}
    
    public String getTitulo(){return titulo;}
    public void setTitulo(String titulo){this.titulo = titulo;}
    
    public String getDirector(){return director;}
    public void setDirector(String director){this.director = director;}
    
    public Date getFechaIni(){return fechaIni;}
    public void setFechaIni(Date fechaIni){this.fechaIni = fechaIni;}
}
