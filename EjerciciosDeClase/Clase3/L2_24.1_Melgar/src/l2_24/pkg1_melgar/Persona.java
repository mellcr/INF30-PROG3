/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l2_24.pkg1_melgar;

/*
 * CLASE ABSTRACTA
 */
public abstract class Persona implements IConsultable{
    protected String DNI;       //nota: string para delimitar la cant de variables 
    protected String nombre;
    protected String paterno;
    protected String materno; 
    
    //al definir el cosnt con parametros -> los hijos SI O SI deben tener c.param
    public Persona(String DNI, String nombre, String paterno, String materno){
        this.DNI = DNI;
        this.nombre= nombre;
        this.paterno = paterno;
        this.materno= materno;
    }
    
    /**
     * @return the DNI
     */ 
    public String getDNI() {
        return DNI;
    }

    /**
     * @param DNI the DNI to set
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the paterno
     */
    public String getPaterno() {
        return paterno;
    }

    /**
     * @param paterno the paterno to set
     */
    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    /**
     * @return the materno
     */
    public String getMaterno() {
        return materno;
    }

    /**
     * @param materno the materno to set
     */
    public void setMaterno(String materno) {
        this.materno = materno;
    }
    
    
    
    
    
    
    
    
    
    
}
