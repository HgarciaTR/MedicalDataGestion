package com.medicaldata.medicaldatagestion;

import java.sql.Date;

public class Medicamento {

    private int idMEDICAMENTO;
    private String nombreMedicamento;
    private Date fechaVencimiento;
    private String descripcion;
    private int usuarioId;

    public Medicamento() {
    }

    public int getIdMEDICAMENTO() {
        return idMEDICAMENTO;
    }

    public void setIdMEDICAMENTO(int idMEDICAMENTO) {
        this.idMEDICAMENTO = idMEDICAMENTO;
    }

    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

}