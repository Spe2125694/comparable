package com.activity.comparable;

public class Fruit implements Comparable<Fruit> {

    private final String fruitName;
    private final String fruitDescription;
    private final int fruitQuantity;

    public Fruit(String fruitName, int fruitQuantity) {
        this.fruitName = fruitName;
        this.fruitQuantity = fruitQuantity;
        this.fruitDescription = "";
    }

    public String getFruitName() {
        return fruitName;
    }

    public String getFruitDescription() {
        return fruitDescription;
    }

    public int getFruitQuantity() {
        return fruitQuantity;
    }

    @Override
    public int compareTo(Fruit that) {

        if(this.fruitName.compareTo(that.fruitName) < 0) {
            return -1;
        } else if(this.fruitName.compareTo(that.fruitName) > 0) {
            return 1;
        } else{

            if (this.fruitQuantity > that.fruitQuantity){
                return -1;
            } else if (this.fruitQuantity < that.fruitQuantity){
                return 1;
            } else {
                return 0;
            }

        }
    }

    @Override
    public String toString() {
        return "Fruit{" + "fruitName='" + fruitName + '\'' +
                ", fruitDescription='" + fruitDescription + '\'' +
                ", fruitQuantity=" + fruitQuantity +
                '}';
    }
}
