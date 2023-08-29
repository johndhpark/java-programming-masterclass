package com.abc.first;

public class Item {
    private String type;

    public Item(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Item{" +
                "type='" + type + "'" +
                "}";
    }
}