/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l2_24.pkg1_melgar;

/**
 *
 * @author mell1
 */
public class Medico extends Persona{
    private String CMP; 
    private Especialidad especialidad; //agregado -> un atributo de una clase es una clase 
    private  String numero_registro; 
    
    public String getCMP() {
        return CMP;
    }
    //constructor -> reutiliza el constructor de la clase base 
    //new Medico("18282901", "NATALI", "LEIVA", "REYES", esp01,"062258", "030568");
    public Medico(String DNI, String nombre, String paterno, String materno,
            Especialidad especialidad,String CMP, String numero_registro){
        super(DNI,nombre,materno,paterno); 
        this.CMP = CMP; 
        this.especialidad= especialidad; 
        this.numero_registro = numero_registro; 
    }
    
    
    public void setCMP(String CMP) {
        this.CMP = CMP;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public String getNumero_registro() {
        return numero_registro;
    }

    public void setNumero_registro(String numero_registro) {
        this.numero_registro = numero_registro;
    }
    
    @Override
    public String devolverInformacion(){
        return "MEDICO: " + nombre + " - CMP: " + CMP
                + " - ESPECIALIDAD:  "+ especialidad.getNombre() + "\n";
    }
    
    
    
    
    
    
}
