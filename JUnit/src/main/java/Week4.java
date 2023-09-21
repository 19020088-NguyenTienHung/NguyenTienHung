//package org.example;
import java.lang.Math;

public class Week4 {
    /**
     * Find Max of 2 Int.
     *
     * @param x 1st number
     * @param y 2nd number
     * @return max of x and y
     */
    public static  int max2Int(int x, int y) {
        return Math.max(x, y);
    }

    /**
     * Find minimum of an Array.
     *
     * @param arr input Array
     * @return min of Array arr
     */
    public static int minArray(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        return min;
    }

    /**
     * Calculate BMI.
     *
     * @param weight is the weight input
     * @param height is the height input
     * @return Categorize BMI
     */
    public static String calculateBMI(double weight, double height) {
        double bmi = (weight / (height * height));
        bmi = Math.round(bmi * 10) / 10.0;
        if (bmi < 18.5) {
            return "Thiếu cân";
        } else if (bmi <= 22.9) {
            return "Bình thường";
        } else if (bmi <= 24.9) {
            return "Thừa cân";
        } else {
            return "Béo phì";
        }
    }
}
