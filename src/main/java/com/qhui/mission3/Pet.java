package com.qhui.mission3;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor

public class Pet {

    private int id;
    private String type;
    private String price;

    public Pet(int id, String type, String price){
        this.id = id;
        this.type = type;
        this.price = price;
    }

//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public int getId() {
//        return id;
//    }
}
