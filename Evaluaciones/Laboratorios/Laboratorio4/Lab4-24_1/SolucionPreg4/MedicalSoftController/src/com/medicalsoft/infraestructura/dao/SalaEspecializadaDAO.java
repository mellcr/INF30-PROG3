package com.medicalsoft.infraestructura.dao;

import com.medicalsoft.infraestructura.model.SalaEspecializada;
import java.util.ArrayList;

// SON INTERFACES 
public interface SalaEspecializadaDAO {
    //insert SalaEspecializada
    int insertar(SalaEspecializada salaEspecializada);
    int modificar(SalaEspecializada salaEspecializada); 
    int eliminar(SalaEspecializada salaEspecializada);
    
    ArrayList<SalaEspecializada> listarTodas();
}
