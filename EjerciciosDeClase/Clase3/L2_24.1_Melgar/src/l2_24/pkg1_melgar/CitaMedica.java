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
public abstract class CitaMedica extends AtencionMedica{
    private String motivo; 
    
    public CitaMedica(Paciente paciente, Medico medico,Date fecha_atencion, String motivo){
        super(paciente,medico,fecha_atencion);
       this.motivo = motivo;
   }
    
    @Override
    public abstract String consultarDatos();
    @Override
    public String datosCabecera(){
        return super.datosCabecera();
    }
}
