package com.lea.myEnumUtils;

public class EnumTest {
    public static void main(String[] args) {
        for(MeetTypeEnum meetTypeEnum : MeetTypeEnum.values()) {
            System.out.println(meetTypeEnum.name());
        }
    }
}
