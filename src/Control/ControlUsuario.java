/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.ConnectBD;
import Modelo.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.JOptionPane;



/**
 *
 * @author juan.gaitan
 */
public class ControlUsuario {
     public boolean insertarUsuario(Usuario obje) throws SQLException {
        
         boolean t = false;
        
         
         String sql = "Insert into cuenta(IdUsuario,Usuario,Contrasenia,Nombre1,Nombre2,Apellido1,Apellido2,Telefono,Correo,Estatura,Peso,Edad)" +
                 "values('"+obje.getIdUsuario()+"','"+obje.getUsuario()+"','"+obje.getContrasenia()+"','"+obje.getNombre1()+"','"+
                 obje.getNombre2()+"','"+obje.getApellido1()+"','"+obje.getApellido2()+"','"+obje.getTelefono()+"','"+obje.getCorreo()+"',"+obje.getEstatura()+
                 ","+obje.getPeso()+","+obje.getEdad()+")";
         
         t = obje.insertarUsuario(sql)
                 ;
         
         return t;
         
         
         
    }

       public boolean eliminarUsuario(Usuario idUsuario) {
        boolean t = false;
          
           String sql = "DELETE FROM cuenta WHERE IdUsuario="+idUsuario.getIdUsuario();
           t = idUsuario.eliminarUsuario(sql);
         return t;
           
           
    }

    public Usuario buscarUsuario(String buscarpor) throws SQLException {
        
       Usuario obj = new Usuario();
        String IdUsuario ;
        String Usuario;
        String Contrasenia;
        String Nombre1;
        String Nombre2;
        String Apellido1;
        String Apellido2;
        String Telefono;
        String Correo;
        double Estatura;
        double Peso;
        int Edad;
        String sql = "SELECT * from cuenta WHERE IdUsuario = '"+buscarpor+"'";
        ResultSet rs = obj.buscarUsuario(sql);
        
       if(rs.next())
        {
            try{
            IdUsuario = rs.getString("IdUsuario");
            Usuario = rs.getString("Usuario");
            Contrasenia = rs.getString("Contrasenia");
            Nombre1= rs.getString("Nombre1");
            Nombre2 = rs.getString("Nombre2");
            Apellido1 = rs.getString("Apellido1");
            Apellido2 = rs.getString("Apellido2");
            Telefono = rs.getString("Telefono");
            Correo = rs.getString("Correo");
            Estatura = rs.getDouble("Estatura");
            Peso=rs.getDouble("Peso");
            Edad= rs.getInt("Edad");
            
         
            
          obj = new Usuario(IdUsuario, Usuario, Contrasenia, Nombre1, Nombre2, Apellido1, Apellido2, Telefono, Correo, Estatura, Peso, Edad);
           
            }
            
            catch (SQLException ex)
            {
                System.out.println("Error "+ex.toString());
            }
            
            
        }
       else{
            obj = null;
        }
        
        return obj;
   }
     public boolean storeProcedious(String sql, Usuario user) {

        boolean t = false;
        PreparedStatement ps;
        ConnectBD obj = new ConnectBD();
        try {
            if (obj.crearConexion()) {
                ps = obj.getConexion().prepareStatement(sql);

                ps.setString(1, user.getIdUsuario());
                ps.setString(2, user.getContrasenia());
                ps.setString(3, user.getUsuario());
                ps.setString(4, user.getNombre1());
                ps.setString(5, user.getNombre2());
                ps.setString(6, user.getApellido1());
                ps.setString(7, user.getApellido2());
                ps.setString(8, user.getTelefono());
                ps.setString(9, user.getCorreo());
                ps.setDouble(10, user.getEstatura());
                ps.setDouble(11, user.getPeso());
                ps.setInt(12, user.getEdad());
                t = true;
                if (ps.execute()) {
                    System.out.println("si se realizo la insersion ");
                }

            }

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return t;
    }
}
    
//    public LinkedList<Usuario> ConsultaDatoscliente(String idusuario){
//        
//        LinkedList<Usuario> datosUsuario = new LinkedList<>();
//        
//        ResultSet rs = null;
//        Usuario us = new Usuario();
//        Usuario datosUsuarioEnviar = null;
//        
//        String sql = "call Cuenta('" + idusuario + "')";
//        
//        rs = us.TraerDatosUsuario(sql);
//        
//        try{
//            while (rs.next()){
//                
//                
//                String usuario = rs.getString("Usuario");
//                String contraseña = rs.getString("Contraseña");
//                String nombre1 = rs.getString("Nombre1");
//                String nombre2 = rs.getString("Nombre2");
//                String apellido1 = rs.getString("Apellido1");
//                String apellido2 = rs.getString("Apellido2");
//                String telefono = rs.getString("Telefono");
//                String correo = rs.getString("Correo");
//                double estatura = rs.getDouble("Estatura");
//                double peso = rs.getDouble("Peso");
//                int edad = rs.getInt("Edad");
//                
//               datosUsuarioEnviar = new Usuario(idusuario, usuario, contraseña, nombre1, nombre2, apellido1, apellido2, telefono, correo, estatura, peso, edad);
//                
//                datosUsuario.add(datosUsuarioEnviar);
//                
//            }
//        }catch(SQLException ex){
//            
//            JOptionPane.showMessageDialog(null, "Fallo en la busqueda de datos:" + ex, "Error", JOptionPane.ERROR_MESSAGE);
//            
//        }
//        return datosUsuario;
//    }
//    
//    
//    
//            
//}
