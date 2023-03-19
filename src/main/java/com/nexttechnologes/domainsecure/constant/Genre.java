package com.nexttechnologes.domainsecure.constant;

import lombok.Getter;

@Getter
public enum Genre {
    MALE("male"),
    FEMAL("femal");

    private final String value;

    private Genre(String value){
        this.value = value;
    }
}
