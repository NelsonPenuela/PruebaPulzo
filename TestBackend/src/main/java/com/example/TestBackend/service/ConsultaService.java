package com.example.TestBackend.service;

import com.example.TestBackend.entity.Prueba;
import com.example.TestBackend.models.ConsultaModel;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

@Service
public class ConsultaService implements ConsultaModel
{
    @Override
    public List<Prueba.lin> consultarDatos() throws IOException
    {
        return leerArchivo();
    }

    private List<Prueba.lin> leerArchivo() throws IOException
    {
        File file = new File("C:\\Users\\Admin\\Downloads\\elecciones\\elecciones");
        if (file.exists())
        {
            String prueba = FileUtils.readFileToString(file, "UTF-8");
            XmlMapper xmlMapper = new XmlMapper();
            JsonNode jsonNode = xmlMapper.readTree(prueba.getBytes());
            ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL, true);
            objectMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
            objectMapper.enable(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES);
            objectMapper.configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL, true);
            String value = objectMapper.writeValueAsString(jsonNode);
            Prueba prueba1 = objectMapper.readValue(value, Prueba.class);
            Prueba.lin pruabLIn = prueba1.getBoletin().Detalle_Circunscripcion.lin.Detalle_Partidos_Totales.lin.stream().filter(
                    resultado -> resultado.Partido.V.equals("0996")
            ).findAny().get();
            List<Prueba.lin> listaResultado = new ArrayList<>();
            listaResultado.add(pruabLIn);
            pruabLIn = prueba1.getBoletin().Detalle_Circunscripcion.lin.Detalle_Candidato.lin.stream().filter(
                    resultado -> resultado.Candidato.V.equals("001")
            ).findAny().get();
            listaResultado.add(pruabLIn);
            pruabLIn = prueba1.getBoletin().Detalle_Circunscripcion.lin.Detalle_Candidato.lin.stream().filter(
                    resultado -> resultado.Candidato.V.equals("002")
            ).findAny().get();
            listaResultado.add(pruabLIn);
            return listaResultado;
        }
        return new ArrayList<>();
    }
}
