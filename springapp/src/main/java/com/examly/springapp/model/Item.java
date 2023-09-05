package com.examly.springapp.model;

public class Item implements Comparable<Item> {
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Item otherItem) {
        return this.name.compareTo(otherItem.getName());
    }
}
