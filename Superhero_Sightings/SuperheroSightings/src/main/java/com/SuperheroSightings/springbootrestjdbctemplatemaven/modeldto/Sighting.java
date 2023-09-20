package com.SuperheroSightings.springbootrestjdbctemplatemaven.modeldto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

/**
 * Represents a sighting event of a superhero or supervillain.
 *
 * The Sighting class provides a data model for recording and retrieving
 * instances where a superhero or supervillain is sighted. Each sighting
 * is associated with a specific hero, location, and date. The Lombok library
 * annotations are utilized to automatically generate getter and setter
 * methods, as well as no-args and all-args constructors.
 *
 * @author Your Name (or the relevant author's name)
 * @version 1.0
 * @since 2023-09-11
 */
@NoArgsConstructor  // Lombok annotation to generate a no-args constructor.
@AllArgsConstructor // Lombok annotation to generate a constructor with arguments for all fields.
@Getter             // Lombok annotation to generate getters for all fields.
@Setter             // Lombok annotation to generate setters for all fields.
public class Sighting {

    /**
     * Unique identifier for the sighting event. This is  generated by the database and used as the primary key.
     */
    private int id;

    /**
     * The superhero  that was sighted.
     */
    private Hero hero;

    /**
     * The location where the sighting took place.
     */
    private Location location;

    /**
     * The date of the sighting.
     */
    private LocalDate date;
}
