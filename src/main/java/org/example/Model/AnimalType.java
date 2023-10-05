package org.example.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AnimalType {

    FOX("FOX"),
    WOLF("WOLF"),
    BEAR("BEAR");

    public final String value;
}
