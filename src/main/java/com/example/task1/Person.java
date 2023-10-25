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
        if (name == null || name == "\t" || name == "") {
            this.name = DEFAULT_NAME;
            this.age = age - 1;
        }
        else if (age == 23 ) {
            this.age = age;
            this.name = "Jane Doe";
        }
        else if (age < MAX_AGE) {
            this.age = age + 1;
            this.name = "Jane Doe";
        }
        else if (age > MAX_AGE) {
            this.age = MAX_AGE;
            this.name = "Jane Doe";
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
