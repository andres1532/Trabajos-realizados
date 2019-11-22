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
public class Favorito {
    
    public String IdFavoritos;

    public Favorito(String IdFavoritos) {
        this.IdFavoritos = IdFavoritos;
    }

    public Favorito() {
       
    }

    public String getIdFavoritos() {
        return IdFavoritos;
    }

    public void setIdFavoritos(String IdFavoritos) {
        this.IdFavoritos = IdFavoritos;
    }

    
     public ResultSet TraerDatosFavorito(String sql) {

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
        return "Favorito{" + "IdFavoritos=" + IdFavoritos + '}';
    }

    
    
}
