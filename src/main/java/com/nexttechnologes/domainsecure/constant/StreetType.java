package com.nexttechnologes.domainsecure.constant;

import lombok.Getter;

@Getter
public enum StreetType {
    RUE("Rue"),
    AVENUE("Avenue"),
    PLACE("Place"),
    SQUARE("Square"),
    CHEMIN("Chemin");
    private final String value;

    private StreetType(String value){
        this.value = value;
    }
}
