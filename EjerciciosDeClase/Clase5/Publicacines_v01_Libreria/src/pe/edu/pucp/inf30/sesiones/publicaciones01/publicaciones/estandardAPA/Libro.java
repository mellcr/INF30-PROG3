/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pe.edu.pucp.inf30.sesiones.publicaciones01.publicaciones.estandardAPA;

import pe.edu.pucp.inf30.sesiones.publicaciones01.publicaciones.Publicacion;

/**
 * 
 * 
 */
public class Libro extends Publicacion {
    private String edicion;
    private String lugar;
    private String editorial;

    public Libro(String nombre, String nombre_completo_autor, Integer año, String edicion, String lugar, String editorial) {
        super(nombre, nombre_completo_autor, año);
        this.edicion = edicion;
        this.lugar = lugar;
        this.editorial = editorial;
    }

    public Libro(String nombre, String nombres_completos_autores[], Integer año, String edicion, String lugar, String editorial) {
        super(nombre, nombres_completos_autores, año);
        this.edicion = edicion;
        this.lugar = lugar;
        this.editorial = editorial;
    }

    @Override
    public void referenciar() {
        
    }
}