import java.util.Arrays;
public class Array {
    public static void main(String[] args){
        // arrays

        int physics = 97;
        int chem = 98;
        int eng = 95;


        int[] marks = new int[3];
        marks[0] = 97; //by default 0 for boolean array = false
        marks[1] = 98;
        marks[2] = 95;

//        System.out.println(marks); garbage values
        System.out.println(marks[0]);



        //length

        System.out.println(marks.length);

        //sort
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

        //without new keyword

        int[] marks2 = {97, 98, 95};

        //2d array

        int[][] finalMarks = {{97,98,95}, {95,95,98}};

        System.out.println(finalMarks[1][1]);
    }
}
