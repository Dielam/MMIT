/*
 * Copyright (C) 2018 Your Organisation
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.mmit.negocio.equipos;

import com.mmit.negocio.entrenadores.EntrenadorTrans;
import com.mmit.negocio.entrenadores.TOAEntrenadorEquipo;
import com.mmit.negocio.jugadores.JugadorTrans;
import java.util.ArrayList;
import junit.framework.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Fernando
 */
public class EquiposSATestNG {
    
    @Test
    public void TestListarEquipos(){
        try{
            System.out.print("Listar Equipos");
            EquiposSA instance = new EquiposSAImp();
            ArrayList<EquipoTrans> result = instance.listarEquipos();
            assertNotNull(result);
        }catch(Exception e){
            Assert.fail();
        }
    }
    
    @Test
    public void TestGetById(){
        try{
            System.out.println("Sacar equipo segun Id");
            EquiposSA instance = new EquiposSAImp();
            TOAEntrenadorEquipo result = instance.obtenerEquipoCompleto(1);
            assertNotNull(result);
        }catch(Exception e){
            Assert.fail();
        }
    }
    
    @Test
    public void TestObtenerEquipo(){
         try{
            System.out.println("Obtener plantilla sin entrenador con el id");
            EquiposSA instance = new EquiposSAImp();
            EquipoTrans result = instance.obtenerEquipo(1);
            assertNotNull(result);
        }catch(Exception e){
            Assert.fail();
        }
    }
    
    @Test
    public void TestObtenerEquipoCompleto(){
        try{
            System.out.println("Obtener plantilla sin entrenador con el id");
            EquiposSA instance = new EquiposSAImp();
            EntrenadorTrans ent = new EntrenadorTrans(1, "juan", "ramirez", 1);
            EquipoTrans et = new EquipoTrans(1, "pepe", 10, 10);
            ArrayList<JugadorTrans> jugadores  = new ArrayList();
            jugadores.add(new JugadorTrans(1, "manolo", "juarez", 1, 18, 80.68, 180.5, "Alero", 34, 360, 28, 30, 34, 86, 38, 78, 65, 20, 30, 1000, 30, 28, "derecha"));
            TOAEntrenadorEquipoJugadores result = new TOAEntrenadorEquipoJugadores(ent, et, jugadores);
            result = instance.obtenerEquipoCompleto(1);
            assertNotNull(result);
        }catch(Exception e){
             Assert.fail();
        }
            
    }
}
    


