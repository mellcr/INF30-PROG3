/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l2_24.pkg1_melgar;
import java.util.Date; 
import java.text.SimpleDateFormat;
/**
 *
 * @author mell1
 */
public class Teleconsulta extends CitaMedica{
    private Plataforma plataforma; 
    private String enlace; 
    
    public Teleconsulta(Paciente paciente, Medico medico,Date fecha_atencion, String motivo,
            Plataforma plataforma, String enlace){
       super(paciente,medico,fecha_atencion,motivo);
       this.plataforma = plataforma; 
       this.enlace = enlace; 
   }
    
   public Plataforma getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }
    
    @Override
    public String consultarDatos(){
        return super.datosCabecera() + "PLATAFORMA:" + plataforma 
                + " - ENLACE:" + enlace + "\n";
    }
    
}
