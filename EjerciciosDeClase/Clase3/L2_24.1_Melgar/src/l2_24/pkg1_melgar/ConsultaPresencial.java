/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l2_24.pkg1_melgar;

import java.util.Date; 
//import java.text.SimpleDateFormat;

/**
 *
 * @author mell1
 */
public class ConsultaPresencial extends CitaMedica{
    private Consultorio consultorio;
    private Boolean requiere_asistencia;
    
    public ConsultaPresencial(Paciente paciente, Medico medico, Date fecha_atencion,String motivo,
            Consultorio consultorio, Boolean requiere_asistencia){
       super(paciente,medico,fecha_atencion,motivo);
       this.consultorio = consultorio; 
       this.requiere_asistencia = requiere_asistencia; 
   }
    
    @Override
    public String consultarDatos(){
        return super.datosCabecera() + consultorio.devolverInformacion() + "REQ. ASISTENCIA:" 
                + (requiere_asistencia?"SI":"NO")+ "\n";
    }
    
}
