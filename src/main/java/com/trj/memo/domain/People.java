package com.trj.memo.domain;

import lombok.Data;

@Data
public class People {
    private String name;
    private int age;
    private boolean sign;

    public People() {
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return "im alone , ".concat(name == null ? "" : name);
    }

    public static void main(String[] args) {
        People pa = new People();
        pa.setAge(1);
        People people = new People("TRJ", 22);
        people.setAge(22);
        System.out.println(pa.getName());
        System.out.println(people.getName());
    }
}
