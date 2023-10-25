package com.example.task1;

class Person {
    // Do not change these fields
    public static final String DEFAULT_NAME = "Unknown";
    public static final int MAX_AGE = 130;
    public static final int MIN_AGE = 0;
    private String name;
    private int age;


    // Fix the constructor to make its code pass the unit tests
    Person(String name, int age) {
        if (name == null || name.isBlank()) {
            this.name = DEFAULT_NAME;
            this.age = age;

        } else if (age > MIN_AGE && age < MAX_AGE) {
            this.age = age;
            this.name = name;

        } else if (age <= MIN_AGE) {
            this.age = MIN_AGE;
            this.name = name;

        } else {
            this.age = MAX_AGE;
            this.name = name;

        }

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

/**
 * original
 */
//class Person {
//    // Do not change these fields
//    public static final String DEFAULT_NAME = "Unknown";
//    public static final int MAX_AGE = 130;
//    public static final int MIN_AGE = 0;
//    private String name;
//    private int age;
//
//    // Fix the constructor to make its code pass the unit tests
//    Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//}
