package com.SuperheroSightings.springbootrestjdbctemplatemaven.modeldto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Location {
    private int id;
    private String name;
    private String description;
    private String address;
    private double latitude;
    private double longitude;
}