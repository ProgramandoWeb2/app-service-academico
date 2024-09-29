package pe.edu.cibertec.app_service_academico.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GestionDocenteController {

    @GetMapping("/docente")
    public String obtenerDocentes(){
        return "Respuesta del servicio GestionDocente - Docente";
    }
}
