package com.lea.myEnumUtils;

import lombok.Getter;

@Getter
public enum MeetTypeEnum {
    ALL("总量", "all");

    MeetTypeEnum(String name, String code) {
        this.name = name;
        this.code = code;
    }

    private String name;
    private String code;
}
