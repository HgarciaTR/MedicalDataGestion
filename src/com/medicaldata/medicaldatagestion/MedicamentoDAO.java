package com.medicaldata.medicaldatagestion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MedicamentoDAO {
    
// Método para insertar un medicamento en la base de datos.
    public boolean insertarMedicamento(Medicamento medicamento) {  
// Consulta SQL para insertar un medicamento.
        String sql = "INSERT INTO MEDICAMENTO (nombreMedicamento, fechaVencimiento, descripcion, USUARIO_idUSUARIO) VALUES (?, ?, ?, ?)";

        try {      
// Establecer la conexión con la base de datos.
            Connection conexion = ConexionBD.conectar();      
// Preparar la consulta SQL.
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, medicamento.getNombreMedicamento());
            ps.setDate(2, medicamento.getFechaVencimiento());
            ps.setString(3, medicamento.getDescripcion());
            ps.setInt(4, medicamento.getUsuarioId());
// Ejecutar la inserción del medicamento.
            ps.executeUpdate();  
// Cerrar la conexión y liberar recursos.
            ps.close();
            conexion.close();

            return true;

        } catch (SQLException e) {

            System.out.println("Error al insertar: " + e.getMessage());

            return false;
            
        }
        
 
    }
    

// Método para consultar los medicamentos registrados.
public void consultarMedicamentos() {

    // Consulta SQL para obtener todos los medicamentos.
    String sql = "SELECT * FROM MEDICAMENTO";

    try {

        // Establecer la conexión con la base de datos.
        Connection conexion = ConexionBD.conectar();

        // Preparar la consulta SQL.
        PreparedStatement ps = conexion.prepareStatement(sql);

        // Ejecutar la consulta.
        java.sql.ResultSet rs = ps.executeQuery();

        System.out.println("===== LISTA DE MEDICAMENTOS =====");

        while (rs.next()) {

            System.out.println("ID: " + rs.getInt("idMEDICAMENTO"));
            System.out.println("Nombre: " + rs.getString("nombreMedicamento"));
            System.out.println("Fecha de vencimiento: " + rs.getDate("fechaVencimiento"));
            System.out.println("Descripción: " + rs.getString("descripcion"));
            System.out.println("Usuario: " + rs.getInt("USUARIO_idUSUARIO"));
            System.out.println("--------------------------------");

        }

        rs.close();
        ps.close();
        conexion.close();

    } catch (SQLException e) {

        System.out.println("Error al consultar: " + e.getMessage());

    }

}

    // Se implementará posteriormente.


// Método para actualizar un medicamento.
public boolean actualizarMedicamento(Medicamento medicamento) {

    // Consulta SQL para actualizar un medicamento.
    String sql = "UPDATE MEDICAMENTO SET nombreMedicamento = ?, fechaVencimiento = ?, descripcion = ?, USUARIO_idUSUARIO = ? WHERE idMEDICAMENTO = ?";

    try {

        // Establecer la conexión con la base de datos.
        Connection conexion = ConexionBD.conectar();

        // Preparar la consulta SQL.
        PreparedStatement ps = conexion.prepareStatement(sql);

        ps.setString(1, medicamento.getNombreMedicamento());
        ps.setDate(2, medicamento.getFechaVencimiento());
        ps.setString(3, medicamento.getDescripcion());
        ps.setInt(4, medicamento.getUsuarioId());
        ps.setInt(5, medicamento.getIdMEDICAMENTO());

        // Ejecutar la actualización.
        ps.executeUpdate();

        // Cerrar la conexión.
        ps.close();
        conexion.close();

        return true;

    } catch (SQLException e) {

        System.out.println("Error al actualizar: " + e.getMessage());

        return false;

    }

}

    // Método para eliminar un medicamento.
public boolean eliminarMedicamento(int idMedicamento) {

    // Consulta SQL para eliminar un medicamento.
    String sql = "DELETE FROM MEDICAMENTO WHERE idMEDICAMENTO = ?";

    try {

        // Establecer la conexión con la base de datos.
        Connection conexion = ConexionBD.conectar();

        // Preparar la consulta SQL.
        PreparedStatement ps = conexion.prepareStatement(sql);

        ps.setInt(1, idMedicamento);

        // Ejecutar la eliminación.
        ps.executeUpdate();

        // Cerrar la conexión.
        ps.close();
        conexion.close();

        return true;

    } catch (SQLException e) {

        System.out.println("Error al eliminar: " + e.getMessage());

        return false;

    }

}



}

