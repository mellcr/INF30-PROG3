/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pe.edu.pucp.inf30.sesiones.publicaciones01.publicaciones.estandardAPA;

import pe.edu.pucp.inf30.sesiones.publicaciones01.publicaciones.Publicacion;

/*
 * NO SABE A QUE CLASE PUBLICACION TE REFIERES , solciones
 *   - existe la clase pero esta en otro paquete
 *   - la clase no existe y se debe crear en el mismo paquete 
 * 
 *  2do error:  La clase publicacion es abstract->falta implementar los constructores y su referncia 
 *  obligatoriedad en clases diferentes -> interfaz 

    3er error-> somos dueños del celeste y verde -> NO REPETIR CODIGO (atributos, metodos) 
            -> crear una clase padre abstracta en el package amarillo 
 */

public class Articulo extends Publicacion {
    private String revista;
    private Integer volumen;
    private Integer numero;
    private String mes;

    public Articulo(String nombre, String nombre_completo_autor, Integer año, String revista, Integer volumen, Integer numero, String mes) {
        super(nombre, nombre_completo_autor, año);
        this.revista = revista;
        this.volumen = volumen;
        this.numero = numero;
        this.mes = mes;
    }

    public Articulo(String nombre, String nombres_completos_autores[], Integer año, String revista, Integer volumen, Integer numero, String mes) {
        super(nombre, nombres_completos_autores, año);
        this.revista = revista;
        this.volumen = volumen;
        this.numero = numero;
        this.mes = mes;
    }

    @Override
    public void referenciar() {
        
    }
}
