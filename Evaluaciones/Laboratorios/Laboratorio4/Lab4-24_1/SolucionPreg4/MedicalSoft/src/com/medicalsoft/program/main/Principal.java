package com.medicalsoft.program.main;

import com.medicalsoft.infraestructura.dao.SalaEspecializadaDAO;
import com.medicalsoft.infraestructura.model.SalaEspecializada;
import com.medicalsoft.infraestructura.mysql.SalaEspecializadaMySQL;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Coloque su codigo y nombre completo
 * Codigo PUCP:     202149897
 * Nombre Completo: Mell Alessandra Carbajal Roman
 */
public class Principal {
    public static void main(String[] args){
        /*Complete para que sea posible el registro en la base de datos 
        de una sala especializada cuyos datos se lean desde consola*/
        
        //para leer datos de consola
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        
        SalaEspecializada salaEspecializada = new SalaEspecializada();
        
        SalaEspecializadaDAO daoSalaEspecializada = new SalaEspecializadaMySQL();
        try{
            System.out.println("Sistema de registro de salas especializadas");
            System.out.println("-------------------------------------------------");
            System.out.print("Ingrese el nombre de la sala: ");
            salaEspecializada.setNombre(teclado.readLine());
            System.out.print("Ingrese el espacio en m2 de la sala: ");
            salaEspecializada.setEspacioEnMetrosCuadrados(Double.parseDouble(teclado.readLine()));
            System.out.print("Ingrese la torre donde esta ubicada la sala (letra): ");
            salaEspecializada.setTorre(teclado.readLine().charAt(0));
            System.out.print("Ingrese el piso donde esta ubicada la sala (numero): ");
            salaEspecializada.setPiso(Integer.parseInt(teclado.readLine()));
            System.out.print("Indique si tiene o no equipamiento de imagenologia (S/N): ");
            salaEspecializada.setPoseeEquipamientoImagenologia(teclado.readLine().charAt(0)=='S');
            int resultado = daoSalaEspecializada.insertar(salaEspecializada);
            if(resultado == 1)
                System.out.println("Se ha realizado el registro con exito");
            else
                System.out.println("No se ha realizado el registro");
        }catch(Exception ex){
            System.out.println("Ha ocurrido un error durante el registro");
        }
        
        
        
        
    }
}
