package com.example.TestBackend.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Prueba
{
    public Boletin Boletin;

    public static class Numero
    {
        public String V;
    }

    public static class Boletin
    {
        public String V;
        public Numero Numero;
        public Boletin Boletin;
        public Tipo_Boletin Tipo_Boletin;
        public Desc_Corporacion Desc_Corporacion;
        public Departamento Departamento;
        public Desc_Departamento Desc_Departamento;
        public Municipio Municipio;
        public Desc_Municipio Desc_Municipio;
        public Dia Dia;
        public Mes Mes;
        public Anio Anio;
        public Hora Hora;
        public Minuto Minuto;
        public Mesas_Instaladas Mesas_Instaladas;
        public Mesas_Informadas Mesas_Informadas;
        public Porc_Mesas_Informadas Porc_Mesas_Informadas;
        public Potencial_Sufragantes Potencial_Sufragantes;
        public Total_Sufragantes Total_Sufragantes;
        public Porc_Sufragantes Porc_Sufragantes;
        public Votos_Nulos Votos_Nulos;
        public Porc_Votos_Nulos Porc_Votos_Nulos;
        public Votos_No_Marcados Votos_No_Marcados;
        public Porc_Votos_No_Marcados Porc_Votos_No_Marcados;
        public Detalle_Circunscripcion Detalle_Circunscripcion;
    }

    public static class Tipo_Boletin
    {
        public String V;
    }

    public static class Desc_Corporacion
    {
        public String V;
    }

    public static class Departamento
    {
        public String V;
    }

    public static class Desc_Departamento
    {
        public String V;
    }

    public static class Municipio
    {
        public String V;
    }

    public static class Desc_Municipio
    {
        public String V;
    }

    public static class Dia
    {
        public String V;
    }

    public static class Mes
    {
        public String V;
    }

    public static class Anio
    {
        public String V;
    }

    public static class Hora
    {
        public String V;
    }

    public static class Minuto
    {
        public String V;
    }

    public static class Mesas_Instaladas
    {
        public String V;
    }

    public static class Mesas_Informadas
    {
        public String V;
    }

    public static class Porc_Mesas_Informadas
    {
        public String V;
    }

    public static class Potencial_Sufragantes
    {
        public String V;
    }

    public static class Total_Sufragantes
    {
        public String V;
    }

    public static class Porc_Sufragantes
    {
        public String V;
    }

    public static class Votos_Nulos
    {
        public String V;
    }

    public static class Porc_Votos_Nulos
    {
        public String V;
    }

    public static class Votos_No_Marcados
    {
        public String V;
    }

    public static class Porc_Votos_No_Marcados
    {
        public String V;
    }

    public static class Circunscripcion
    {
        public String V;
    }

    public static class Desc_Circunscripcion
    {
        public String V;
    }

    public static class Numero_Curules
    {
        public String V;
    }

    public static class Partido
    {
        public String V;
    }

    public static class Descripcion
    {
        public String V;
    }

    public static class Votos
    {
        public String V;
    }

    public static class Porc
    {
        public String V;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class lin
    {
        public Partido Partido;
        public Descripcion Descripcion;
        public Votos Votos;
        public Porc Porc;
        public Pref Pref;
        public Curules Curules;
        public Amb_Presen Amb_Presen;
        public Candidato Candidato;
        public Sec Sec;
        public Circunscripcion Circunscripcion;
        public Desc_Circunscripcion Desc_Circunscripcion;
        public Numero_Curules Numero_Curules;
        public Detalle_Partidos_Totales Detalle_Partidos_Totales;
        public Detalle_Partido Detalle_Partido;
        public Detalle_Candidato Detalle_Candidato;
    }

    public static class Detalle_Partidos_Totales
    {
        public List<lin> lin;
    }

    public static class Pref
    {
        public String V;
    }

    public static class Curules
    {
        public String V;
    }

    public static class Detalle_Partido
    {
        public List<lin> lin;
    }

    public static class Amb_Presen
    {
        public String V;
    }

    public static class Candidato
    {
        public String V;
    }

    public static class Sec
    {
        public String V;
    }

    public static class Detalle_Candidato
    {
        public List<lin> lin;
    }

    public static class Detalle_Circunscripcion
    {
        public lin lin;
    }

    public static class Consolidado
    {
        public Boletin Boletin;
    }
}
