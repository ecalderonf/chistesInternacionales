package api.chistes.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

@Entity
@Table(name = "calificacion")
public class Calificacion {
    @Id
    private Long jokeId;
    @NotNull
    private String category;
    @NotNull
    @Positive
    private double rating;

    public Calificacion(Long jokeId, String category, double rating) {
        this.jokeId = jokeId;
        this.category = category;
        this.rating = rating;
    }

    public Calificacion() {
    }

    public Long getJokeId() {
        return jokeId;
    }

    public void setJokeId(Long jokeId) {
        this.jokeId = jokeId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
