package api.chistes.repository;

import api.chistes.dto.CategoriaRatingDTO;
import api.chistes.model.Calificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CalificacionRepository extends JpaRepository<Calificacion,Long> {

    @Query("SELECT c.category AS category, AVG(c.rating) AS average " +
            "FROM Calificacion c GROUP BY c.category ORDER BY average DESC")
    List<CategoriaRatingDTO> getCategoriaRatings();
}
