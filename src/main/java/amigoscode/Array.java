package amigoscode;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "Purple";
        colors[1] = "Blue";
        colors[2] = "Yellow";

        System.out.println(Arrays.toString(colors));//print out entire array
        System.out.println(colors[0]); // print out each index

        //shorter way to do an array
//        int[] numbers = new int[2];
//        numbers[0] = 100;
//        numbers[1] = 200;
        //ORR!!
        int[] numbers = {100,200};

        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);

        }
        //To loop through array in reverse!!!!
        for (int i = colors.length - 1; i >=0 ; i--) {
            System.out.println(colors[i]);
        }
        //for(String colors in colors){}
        //written like this
        for(String color : colors){ // it has forloop
            System.out.println(color);
        }
        //OR
        Arrays.stream(colors).forEach(System.out::println); //Streams looping thru

        System.out.println(colors.length);//size of array









    }
}
