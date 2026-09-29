public class Strings {
    public static void main(String[] args){


        //Strings - immutable
        // concatenate

        String name1 = "Shalin";
        String name2 = "Sunil";
        String name3 = name1 + " and " + name2;
        System.out.println(name3);



        //charAt
        String name = "Shalin";
        System.out.println(name.charAt(0));
        //length
        System.out.println(name.length());
        //replace
        System.out.println(name.replace('a', 'b'));
        //substring
        System.out.println(name.substring(0,3));
    }
}
