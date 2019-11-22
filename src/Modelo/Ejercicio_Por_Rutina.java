/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.ResultSet;

/**
 *
 * @author Jhonny Londoño G
 */
public class Ejercicio_Por_Rutina {
    String IdEjercicio_P_R;

    public Ejercicio_Por_Rutina(String IdEjercicio_P_R) {
        this.IdEjercicio_P_R = IdEjercicio_P_R;
    }

    public String getIdEjercicio_P_R() {
        return IdEjercicio_P_R;
    }

    public void setIdEjercicio_P_R(String IdEjercicio_P_R) {
        this.IdEjercicio_P_R = IdEjercicio_P_R;
    }

    public ResultSet TraerDatosE_P_R(String sql){
        ResultSet rs = null;

        ConnectBD conn = new ConnectBD();

        if (conn.crearConexion()) {
            try {
                rs = conn.getSt().executeQuery(sql);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        return rs;
    }
    
    
    @Override
    public String toString() {
        return "Ejercicio_Por_Rutina{" + "IdEjercicio_P_R=" + IdEjercicio_P_R + '}';
    }
}
