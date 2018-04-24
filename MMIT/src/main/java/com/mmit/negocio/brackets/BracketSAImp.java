
package com.mmit.negocio.brackets;

import com.mmit.integracion.equipos.EquiposDAO;
import com.mmit.integracion.factoriaIntegracion.FactoriaIntegracion;
import com.mmit.negocio.equipos.EquipoTrans;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BracketSAImp implements BracketSA {

    
    @Override
    public int loadInitBracket() {
        
        try {
        
            EquiposDAO equiposDao = FactoriaIntegracion.getInstancia().crearEquiposDAO();
            ArrayList<EquipoTrans> listaCompleta = equiposDao.readAll();
            
            ArrayList<EquipoTrans>listaFinal=new ArrayList<EquipoTrans>();
            
            
            
            //
            int N=16;
            
            for(int i=0;i<N/2;i++)
            {
                listaFinal.add(listaCompleta.get(i));
                listaFinal.add(listaCompleta.get(N-i));
            }
            
            
            return 0;
            
        } catch (Exception ex) {
            return -5;
        }
    }
    
}
