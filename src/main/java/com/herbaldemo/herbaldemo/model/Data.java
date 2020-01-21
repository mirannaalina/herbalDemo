package com.herbaldemo.herbaldemo.model;

public class Data {

    private String dataEntry;
    private int age;
    private int metabolicAge;
    private int kg;
    private int bodyFat;
    private int muscle;
    private int hydrationLevel;

    public Data(String dataEntry, int age, int metabolicAge, int kg, int bodyFat, int muscle, int hydrationLevel) {
        this.dataEntry = dataEntry;
        this.age = age;
        this.metabolicAge = metabolicAge;
        this.kg = kg;
        this.bodyFat = bodyFat;
        this.muscle = muscle;
        this.hydrationLevel = hydrationLevel;
    }

    public String getDataEntry() {
        return dataEntry;
    }

    public void setDataEntry(String dataEntry) {
        this.dataEntry = dataEntry;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMetabolicAge() {
        return metabolicAge;
    }

    public void setMetabolicAge(int metabolicAge) {
        this.metabolicAge = metabolicAge;
    }

    public int getKg() {
        return kg;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }

    public int getBodyFat() {
        return bodyFat;
    }

    public void setBodyFat(int bodyFat) {
        this.bodyFat = bodyFat;
    }

    public int getMuscle() {
        return muscle;
    }

    public void setMuscle(int muscle) {
        this.muscle = muscle;
    }

    public int getHydrationLevel() {
        return hydrationLevel;
    }

    public void setHydrationLevel(int hydrationLevel) {
        this.hydrationLevel = hydrationLevel;
    }
}
