public class DataTypes {
    public static void main(String[] args){
        //DataTypes

        //Primitives - byte - 1 [-128 to 127] short - 2 int - 4 1,2,3,4,5 bytes long - 8 float - 4 3.14 double - 8 char - 2 a,b,c,d  boolean - 1 true/false
        byte age = 30;
        int phone = 1234567890;
        long phone2 = 12345678900L;
        float pi = 3.14F;
        char letter = '@';
        boolean isAdult = false;



        //Non-Primitives
        String name = "Shalin"; // has functions unlimited length memory exceed we have to use new keyword in string is not necessary

        String friend = new String("Apu");
        System.out.println(name.length());
    }
}
