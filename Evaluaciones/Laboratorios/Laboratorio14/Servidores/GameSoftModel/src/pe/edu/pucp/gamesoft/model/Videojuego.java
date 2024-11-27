package pe.edu.pucp.gamesoft.model;
import java.io.Serializable;
import java.util.Date;

public class Videojuego implements Serializable{
    private int idVideojuego;
    private Genero genero;
    private String nombre;
    private Date fechaLanzamiento;
    private double costoDesarrollo;
    private byte[] foto;
    private Clasificacion clasificacion;

    public int getIdVideojuego() {
        return idVideojuego;
    }

    public void setIdVideojuego(int idVideojuego) {
        this.idVideojuego = idVideojuego;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public double getCostoDesarrollo() {
        return costoDesarrollo;
    }

    public void setCostoDesarrollo(double costoDesarrollo) {
        this.costoDesarrollo = costoDesarrollo;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }
    
}