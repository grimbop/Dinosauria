package com.grimbo.dinosauria.entity;

public interface withBabyEntity {


    default String setTexture(int ageTick, String babyTexture, String adultTexture){
        ageTick--;
        if(ageTick < 1){
            return babyTexture;
        }else{
            ageTick = 0;
            return adultTexture;
        }
    }
}
