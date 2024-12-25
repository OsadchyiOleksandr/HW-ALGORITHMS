package app.entity;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomIntArray {

    private int size;
    private int[] array;

    public RandomIntArray(int size){
        this.size = size;
    }

    public RandomIntArray crateArray(){
        Random rand = new Random();
        int size = 10;
        this.array = IntStream.range(0, size)
                .map(i -> rand.nextInt(30))
                .toArray();
        return this;
    }

    public int[] getArray(){
        return this.array;
    }

}

