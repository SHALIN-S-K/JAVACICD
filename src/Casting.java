public class Casting {
    public static void main(String[] args){
        //casting

        double price = 100.00;
        double finalPrice = price + 18; //implicit casting - default

        System.out.println(finalPrice);

//        int p = 100;
//        int fP = p+18.0; error // explicit casting
         int p = 100;
         int fP = (int) (p+18.18); //manual, decimals get deleted

        System.out.println(finalPrice);
    }
}
