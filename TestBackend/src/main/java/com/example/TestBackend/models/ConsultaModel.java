package com.example.TestBackend.models;

import com.example.TestBackend.entity.Prueba;

import java.io.IOException;
import java.util.List;

public interface ConsultaModel
{
    List<Prueba.lin> consultarDatos() throws IOException;

}
