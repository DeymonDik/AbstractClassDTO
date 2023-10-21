package org.example.enums;

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
