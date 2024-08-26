/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l2_24.pkg1_melgar;

/**
 *
 * @author mell1
 */
public class SalaEspecializada extends AmbienteClinico{
    private String nombre; 
    private Boolean posee_equipamiento_imagenologia; 
    
     public SalaEspecializada(Double metraje, char torre, Integer piso,
             String nombre, Boolean posee_equipamiento_imagenologia){
        super(metraje, torre,piso);
        this.nombre= nombre;
        this.posee_equipamiento_imagenologia= posee_equipamiento_imagenologia;
    }
    
     @Override
    public String devolverInformacion(){
        return "SALA ESPECIALIZADA:" + nombre + " - TORRE:" + torre
                + " - PISO:" + piso + " - EQ. IMAGENOLOGIA:" + (posee_equipamiento_imagenologia?"SI":"NO") 
                + "\n";  
    }
    
}
