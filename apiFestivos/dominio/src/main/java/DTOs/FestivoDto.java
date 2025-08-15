package festivos.api.dominio.DTOs;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


public class FestivoDto {

    private String festivo;
    private LocalDate fecha;

    public FestivoDto() {
    }

    public FestivoDto(String festivo, LocalDate fecha) {
        this.festivo = festivo;
        this.fecha = fecha;
    }

    public String getFestivo() {
        return festivo;
    }

    public void setFestivo(String festivo) {
        this.festivo = festivo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

}
