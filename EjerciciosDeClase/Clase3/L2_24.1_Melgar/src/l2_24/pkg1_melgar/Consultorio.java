/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l2_24.pkg1_melgar;

/**
 *
 * @author mell1
 */
public class Consultorio extends AmbienteClinico{
    private String numero;
    
    //getters y setters 
    public Consultorio(Double metraje, char torre, Integer piso, 
            String numero){
        super(metraje, torre,piso);
        this.numero = numero;
    }
    
    @Override
    public String devolverInformacion(){
        return "CONSULTORIO:" + numero + " - TORRE:" + torre + " - PISO:" + piso + "\n";
    }
}
