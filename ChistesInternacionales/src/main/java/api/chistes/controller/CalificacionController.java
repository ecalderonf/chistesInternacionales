package api.chistes.controller;

import api.chistes.dto.CategoriaRatingDTO;
import api.chistes.model.Calificacion;
import api.chistes.service.CalificacionService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/chistes")
public class CalificacionController {
    private final CalificacionService calificacionService;

    @Autowired
    public CalificacionController(CalificacionService calificacionService) {
        this.calificacionService = calificacionService;
    }

    // 🔹 Crear o actualizar calificacion
    @PostMapping("/")
    public ResponseEntity<?> guardarCalificacion(@Valid @RequestBody Calificacion calificacion) {
        try {
            Calificacion calificacionResultado = calificacionService.guardarCalificacion(calificacion);
            return ResponseEntity.status(201).body(calificacionResultado);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/calificaciones")
    public ResponseEntity<?> getCategoriaRatings(){
        List<CategoriaRatingDTO> categoriasRatingResultado = calificacionService.getCategoriaRatings();
        return ResponseEntity.status(200).body(categoriasRatingResultado);
    }
}
