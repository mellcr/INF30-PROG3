
package l2_24.pkg1_melgar;

import java.util.ArrayList;
/*
 *
 * @author mell1
 */
public class Paciente extends Persona{
    private Integer HCE; 
    private ArrayList<AtencionMedica> atencionesMedicas; 

    public Paciente(String DNI, String nombre, String paterno, String materno,
            Integer HCE){
        super(DNI,nombre,materno,paterno); // SE DEBE REUTILIZAR :) 
        this.HCE = HCE;
        
        //atencionesMedicas = new ArrayList<>(); -> esto deberia ser lo correcto
        //con su metodo-> agregarAtMed -> con sus filtros y busquedas para agregar
    }
    
    public Integer getHCE() {
        return HCE;
    }

    public void setHCE(Integer HCE) {
        this.HCE = HCE;
    }
    
    //pac01.setAtencionesMedicas(new ArrayList<>());
    //ES IGUAL A: ArrayList<AtencionMedica> atencionesMedicas = new ArrayList<>();
    public void setAtencionesMedicas(ArrayList<AtencionMedica> atencionesMedicas){
        this.atencionesMedicas = atencionesMedicas; 
    }
    
    public ArrayList<AtencionMedica> getAtencionesMedicas(){
        return atencionesMedicas; 
    }
    
   @Override
    public String devolverInformacion(){
        return "PACIENTE: " + DNI + " - " + nombre
                + " "+ paterno+" "+materno+ "\n";
    }
    
    public void listarCitasMedicasProgramadas(){
        //imprime todas las citas medicas 
        for(AtencionMedica at: atencionesMedicas){
            System.out.println(at.consultarDatos());
        }
    }
}
