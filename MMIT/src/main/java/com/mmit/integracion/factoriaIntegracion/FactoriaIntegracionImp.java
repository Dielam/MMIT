package com.mmit.integracion.factoriaIntegracion;

import com.mmit.integracion.entrenadores.EntrenadorDAO;
import com.mmit.integracion.entrenadores.EntrenadorDAOImp;
import com.mmit.integracion.equipos.EquiposDAO;
import com.mmit.integracion.equipos.EquiposDAOImp;
import com.mmit.integracion.jugadores.JugadoresDAO;
import com.mmit.integracion.jugadores.JugadoresDAOImp;
import com.mmit.integracion.usuarios.UsuariosDAO;
import com.mmit.integracion.usuarios.UsuariosDAOImp;

class FactoriaIntegracionImp extends FactoriaIntegracion {

    @Override
    public EquiposDAO crearEquiposDAO(){
        return new EquiposDAOImp();
    }

    @Override
    public JugadoresDAO crearJugadoresDAO() {
        return new JugadoresDAOImp();
    }
    
    @Override
    public EntrenadorDAO crearEntrenadoresDAO() {
        return new EntrenadorDAOImp();
    }
    
    @Override
    public UsuariosDAO crearUsuariosDAO(){
    	return new UsuariosDAOImp();
    }
}
