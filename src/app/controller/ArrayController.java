package app.controller;

import app.entity.RandomIntArray;
import app.model.ArrayUtilsModel;
import app.view.ViewArray;

import java.util.Arrays;
import java.util.Random;

public class ArrayController {

    ArrayUtilsModel arrayUtils = new ArrayUtilsModel();
    ViewArray viewArray = new ViewArray();
    Random random = new Random();


    public void runController() {
        RandomIntArray randomIntArray = new RandomIntArray(10);
        int[] array = randomIntArray.crateArray().getArray();
        viewArray.toDisplay("Array before sort: " + Arrays.toString(array));

        arrayUtils.mergeSort(array);
        viewArray.toDisplay("Array after sort: " + Arrays.toString(array));

        int target = random.nextInt(30);
        viewArray.toDisplay("Find Element: " + target);
        int result = arrayUtils.binarySearch(array, target);

        if (result == -1) {
            viewArray.toDisplay("Element " + target + " not found.");
        } else {
            viewArray.toDisplay("Element " + target + " found in index: " + result);
        }
    }
}
