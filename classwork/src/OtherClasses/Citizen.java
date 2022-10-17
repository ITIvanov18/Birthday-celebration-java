package OtherClasses;

import Interfaces.Identifiable;

public class Citizen implements Identifiable {
    private String name;
    private int age;
    private String id;
    private String birthDate;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
    }



}
