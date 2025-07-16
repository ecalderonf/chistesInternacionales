package api.chistes.service;

import api.chistes.dto.CategoriaRatingDTO;
import api.chistes.model.Calificacion;
import api.chistes.repository.CalificacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalificacionService {
    private final CalificacionRepository calificacionRepository;

    @Autowired
    public CalificacionService(CalificacionRepository repository) {
        this.calificacionRepository = repository;
    }

    public Calificacion guardarCalificacion(Calificacion calificacion){
        return calificacionRepository.save(calificacion);
    }

    public List<CategoriaRatingDTO> getCategoriaRatings(){
        return calificacionRepository.getCategoriaRatings();
    }
}
