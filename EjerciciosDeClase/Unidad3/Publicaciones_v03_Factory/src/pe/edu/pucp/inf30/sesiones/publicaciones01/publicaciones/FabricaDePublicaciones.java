/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pe.edu.pucp.inf30.sesiones.publicaciones01.publicaciones;

/**
 * SIRVE UNICAMENTE PARA OBLIGAR QUE LAS CLASES QUE IMPLEMENTEN TENGAN IMPLEMENTACION
 * Permitira crear un factory tanto para IEEE como para APA 
 */
public abstract class FabricaDePublicaciones {
    //metodos abstracto
    public abstract Publicacion crearArticulo(String nombre, String nombre_completo_autor, Integer año, String revista, Integer volumen, Integer numero, String mes); 
    public abstract Publicacion crearArticulo(String nombre, String nombres_completos_autores[], Integer año, String revista, Integer volumen, Integer numero, String mes); 
    
    public abstract Publicacion crearLibro(String nombre, String nombre_completo_autor, Integer año, String edicion, String lugar, String editorial); 
    public abstract Publicacion crearLibro(String nombre, String nombres_completos_autores[], Integer año, String edicion, String lugar, String editorial); 

    public abstract Publicacion crearTesis(String nombre, String nombre_completo_autor, Integer año, Clase_de_Tesis clase, String departamento, String institucion, String ciudad, String estado);
    public abstract Publicacion crearTesis(String nombre, String nombres_completos_autores[], Integer año, Clase_de_Tesis clase, String departamento, String institucion, String ciudad, String estado);
}
