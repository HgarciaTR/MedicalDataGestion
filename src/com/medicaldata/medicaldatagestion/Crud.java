/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.medicaldata.medicaldatagestion;

import java.sql.Date;

public class Crud {

    public static void main(String[] args) {

        // Crear el objeto para realizar las operaciones del CRUD.
        MedicamentoDAO operaciones = new MedicamentoDAO();

        /*
        //CONSULTAR 
        operaciones.consultarMedicamentos();
        */

        /*
        //INSERTAR 

        Medicamento medicamento = new Medicamento();

        // Asignar los datos del medicamento.
        medicamento.setNombreMedicamento("Amoxicilina");
        medicamento.setFechaVencimiento(Date.valueOf("2027-08-15"));
        medicamento.setDescripcion("Antibiótico");
        medicamento.setUsuarioId(1);

        // Insertar el medicamento.
        operaciones.insertarMedicamento(medicamento);
        */

        /*
        //ACTUALIZAR 

        Medicamento medicamento = new Medicamento();

        // ID del medicamento que se desea actualizar.
        medicamento.setIdMEDICAMENTO(1);

        // Nuevos datos.
        medicamento.setNombreMedicamento("Ibuprofeno");
        medicamento.setFechaVencimiento(Date.valueOf("2028-06-30"));
        medicamento.setDescripcion("Medicamento antiinflamatorio.");
        medicamento.setUsuarioId(1);

        // Actualizar el medicamento.
        operaciones.actualizarMedicamento(medicamento);
        */

        //ELIMINAR 

        // Eliminar el medicamento con ID 2.
        operaciones.eliminarMedicamento(2);

    }

}