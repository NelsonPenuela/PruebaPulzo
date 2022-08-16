package com.example.TestBackend.controller;

import com.example.TestBackend.entity.Prueba;
import com.example.TestBackend.models.ConsultaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EleccionesController
{

    @Autowired
    private ConsultaModel consultaModel;

    @GetMapping("/consulta")
    public List<Prueba.lin> consultaVotos() throws IOException
    {
        return consultaModel.consultarDatos();
    }
}
