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
public class ExamenDiagnostico extends AtencionMedica{
    private SalaEspecializada salaEspecializada; 
    private TipoExamen tipo_examen;
    
    public ExamenDiagnostico(Paciente paciente, Medico medico,Date fecha_atencion,
            SalaEspecializada salaEspecializada,TipoExamen tipo_examen){
       super(paciente,medico,fecha_atencion);
       this.salaEspecializada = salaEspecializada;
       this.tipo_examen= tipo_examen;
   }
    
    
    public SalaEspecializada getSalaEspecializada() {
        return salaEspecializada;
    }

    public void setSalaEspecializada(SalaEspecializada salaEspecializada) {
        this.salaEspecializada = salaEspecializada;
    }

    public TipoExamen getTipo_examen() {
        return tipo_examen;
    }

    public void setTipo_examen(TipoExamen tipo_examen) {
        this.tipo_examen = tipo_examen;
    }
     
    @Override
    public String consultarDatos(){
           return super.datosCabecera() + salaEspecializada.devolverInformacion() 
                   + "TIPO EXAMEN:" + tipo_examen + "\n";
    }
    
}
