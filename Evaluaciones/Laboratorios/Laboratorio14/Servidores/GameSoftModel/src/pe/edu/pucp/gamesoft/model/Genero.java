package pe.edu.pucp.gamesoft.model;
import java.util.ArrayList;
import java.io.Serializable;

public class Genero implements Serializable{
    private int idGenero;
    private ArrayList<Videojuego> videojuegos;
    private String nombre;
    private boolean activo;

    public int getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    public ArrayList<Videojuego> getVideojuegos() {
        return videojuegos;
    }

    public void setVideojuegos(ArrayList<Videojuego> videojuegos) {
        this.videojuegos = videojuegos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
}