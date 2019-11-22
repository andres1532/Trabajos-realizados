/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author juan.gaitan
 */
public class Usuario {

    private String IdUsuario;
    private String Usuario;
    private String Contrasenia;
    private String Nombre1;
    private String Nombre2;
    private String Apellido1;
    private String Apellido2;
    private String Telefono;
    private String Correo;
    private double Estatura;
    private double Peso;
    private int Edad;

    public Usuario(String IdUsuario, String Usuario, String Contrasenia, String Nombre1, String Nombre2, String Apellido1, String Apellido2, String Telefono, String Correo, double Estatura, double Peso, int Edad) {
        this.IdUsuario = IdUsuario;
        this.Usuario = Usuario;
        this.Contrasenia = Contrasenia;
        this.Nombre1 = Nombre1;
        this.Nombre2 = Nombre2;
        this.Apellido1 = Apellido1;
        this.Apellido2 = Apellido2;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.Estatura = Estatura;
        this.Peso = Peso;
        this.Edad = Edad;
    }

    public Usuario() {
       
    }

    public String getIdUsuario() {
        return IdUsuario;
    }

    public String getNombre2() {
        return Nombre2;
    }

    public void setNombre2(String Nombre2) {
        this.Nombre2 = Nombre2;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContrasenia() {
        return Contrasenia;
    }

    public String getNombre1() {
        return Nombre1;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public double getEstatura() {
        return Estatura;
    }

    public double getPeso() {
        return Peso;
    }

    public int getEdad() {
        return Edad;
    }

    public void setIdUsuario(String idUsuario) {
        this.IdUsuario = idUsuario;
    }

    public void setContrasenia(String Contrasenia) {
        this.Contrasenia = Contrasenia;
    }

    public void setNombre1(String Nombre1) {
        this.Nombre1 = Nombre1;
    }

    public void setApellido1(String Apellido1) {
        this.Apellido1 = Apellido1;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public void setEstatura(double Estarura) {
        this.Estatura = Estarura;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    /////////////////////
    public boolean insertarUsuario(String sql) {
        ConnectBD objCon = new ConnectBD();

        if (objCon.crearConexion()) {
            try {
                Statement sentencia = objCon.getConexion().createStatement();
                sentencia.executeUpdate(sql);
            } catch (SQLException ex) {
                ex.printStackTrace();
                return false;
            }
        }
        return true;
    }

    public boolean eliminarUsuario(String sql) {
        ConnectBD objCon = new ConnectBD();

        if (objCon.crearConexion()) {
            try {
                Statement sentencia = objCon.getConexion().createStatement();
                sentencia.executeUpdate(sql);
            } catch (SQLException ex) {
                ex.printStackTrace();
                return false;
            }
        }
        return true;
    }
    public ResultSet TraerDatosUsuario(String sql) {

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

   

    public ResultSet buscarUsuario(String sql) throws SQLException {

        ResultSet rs = null;

        ConnectBD obj = new ConnectBD();
        if (obj.crearConexion()) {
            rs = obj.getSt().executeQuery(sql);
        }

        return rs;
    }

}
