/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l2_24.pkg1_melgar;

/**
 ** CLASE ABSTRACTA
 */
public abstract class AmbienteClinico implements IConsultable{
    protected Double metraje; 
    protected char torre; 
    protected Integer piso;
    
    public AmbienteClinico(Double metraje, char torre, Integer piso){
        this.metraje = metraje; 
        this.torre = torre; 
        this.piso = piso; 
                
    }
    
}
