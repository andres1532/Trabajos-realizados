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
public class Ejercicio {
    String IdEjercicio;
    String TipoEjercicio;
    String NombreEjercicio;

    public Ejercicio(String IdEjercicio, String TipoEjercicio, String NombreEjercicio) {
        this.IdEjercicio = IdEjercicio;
        this.TipoEjercicio = TipoEjercicio;
        this.NombreEjercicio = NombreEjercicio;
    }

    public Ejercicio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getIdEjercicio() {
        return IdEjercicio;
    }

    public void setIdEjercicio(String IdEjercicio) {
        this.IdEjercicio = IdEjercicio;
    }

    public String getTipoEjercicio() {
        return TipoEjercicio;
    }

    public void setTipoEjercicio(String TipoEjercicio) {
        this.TipoEjercicio = TipoEjercicio;
    }

    public String getNombreEjercicio() {
        return NombreEjercicio;
    }

    public void setNombreEjercicio(String NombreEjercicio) {
        this.NombreEjercicio = NombreEjercicio;
    }

    public ResultSet traerDatosEjercicio(String sql){
        
        ResultSet rs = null;
        
        ConnectBD conn = new ConnectBD();
        
        if(conn.crearConexion()){
            
            try{
                rs = conn.getSt().executeQuery(sql);
            }catch(Exception ex){
                ex.printStackTrace();
            }
            
        }
        return rs;
    }
    
    
    
    @Override
    public String toString() {
        return "Ejercicio{" + "IdEjercicio=" + IdEjercicio + ", TipoEjercicio=" + TipoEjercicio + ", NombreEjercicio=" + NombreEjercicio + '}';
    }
}
