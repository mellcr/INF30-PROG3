
package l2_24.pkg1_melgar;

import java.util.Date;              //Date 
import java.text.SimpleDateFormat;
/*
 *CLASE ABSTRACTA
 */
public abstract class AtencionMedica {
   protected static Integer correlativo = 1; //static -> subrayado 
   protected Integer identificador;     //toda atencion medica debe identificarse 
   protected Paciente paciente; 
   protected Medico medico; 
   protected Date fecha_creacion; 
   protected Date fecha_atencion; 
   protected Estado_de_atencion estado; 
   
   //creacion del constructor ya que una llamadita abajo de su jerarquia necesita 
   //la implementacion de todos los constructores 
   public AtencionMedica(Paciente paciente, Medico medico, Date fecha_atencion){
       this.identificador = correlativo++;//AtencionMedica.correlativo++; 
       this.paciente = paciente;
       this.medico = medico; 
       this.fecha_creacion =  new Date(); //fecha actual del sistema
       this.fecha_atencion = fecha_atencion;
       this.estado = Estado_de_atencion.PROGRAMADA;
       
       //correlativo++;
        //this.estado = estado; -> cuando se crea tiene un estado inicial
       //creacion: fecha del sistema 
   }
   
   
   
   public abstract String consultarDatos();
   public String datosCabecera(){   
       SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");
	return "ID:" + identificador + " - CREACION:" + sdf.format(fecha_creacion) + "- ATENCION:" + sdf.format(fecha_atencion) 
                + " - " + estado + "\n" + medico.devolverInformacion() + paciente.devolverInformacion();
   }
   
}
