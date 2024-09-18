/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pe.edu.pucp.inf30.sesiones.publicaciones01.publicaciones.estandardAPA;

import pe.edu.pucp.inf30.sesiones.publicaciones01.publicaciones.Clase_de_Tesis;
import pe.edu.pucp.inf30.sesiones.publicaciones01.publicaciones.FabricaDePublicaciones;
import pe.edu.pucp.inf30.sesiones.publicaciones01.publicaciones.Publicacion;

/**
 * 
 * 
 */
public class FabricaDePublicacionesAPA extends FabricaDePublicaciones {
    @Override
    public  Publicacion crearArticulo(String nombre, String nombre_completo_autor, Integer año, 
            String revista, Integer volumen, Integer numero, String mes){
        return new Articulo(nombre,nombre_completo_autor,año,revista,volumen,numero,mes); 
        
        //el padre espera una publicacion -> pero publicacion es abstract -> entonces se retorna una ref de una clase hija 
        //estoy en el paquete de APA -> no se necesita hacer un import 
    }
    @Override
    public  Publicacion crearArticulo(String nombre, String nombres_completos_autores[], Integer año, 
            String revista, Integer volumen, Integer numero, String mes){
        return new Articulo( nombre,  nombres_completos_autores,  año, 
             revista,  volumen,  numero,  mes);
    }
    @Override
   public Publicacion crearLibro(String nombre, String nombre_completo_autor, Integer año, 
           String edicion, String lugar, String editorial){
       return new Libro(nombre, nombre_completo_autor, año, edicion, lugar, editorial);
   }
   @Override
   public Publicacion crearLibro(String nombre, String nombres_completos_autores[], Integer año, 
           String edicion, String lugar, String editorial){
       
   }
   @Override
    public Publicacion crearTesis(String nombre, String nombre_completo_autor, Integer año, Clase_de_Tesis clase, 
            String departamento, String institucion, String ciudad, String estado){
        return new Tesis(nombre, nombre_completo_autor, año, clase, departamento,  institucion,  ciudad,  estado);
    }
    @Override
    public Publicacion crearTesis(String nombre, String nombres_completos_autores[], Integer año, 
            Clase_de_Tesis clase, String departamento, String institucion, String ciudad, String estado){
        return new Tesis( nombre,  nombres_completos_autores,  año, 
             clase,  departamento,  institucion,  ciudad,  estado); 
    }


}
