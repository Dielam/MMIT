/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Integración;

/**
 *
 * @author Laura
 */
public class FactoriaDAOImp extends FactoriaDAO {
	@Override
	public DAO crearDAO() {
		return new DAO();
	}
	
}
