public class Loops {
    public static void main(String[] args){
        //LOOPS
        System.out.println("1");
        System.out.println("2");
        // 1-10

        for(int i=1; i<=10; i++){
            System.out.println(i);
        }

        for(int i=10; i>=1; i--){
            System.out.println(i);
        }
        //while loop


        int i = 10;

        while(i>=1){
            System.out.println(i);
            i--;
        }

        //do-while
        int k = 100;
        do{
            System.out.println(k);
            k--;
        } while(k>=1);
    }
}
