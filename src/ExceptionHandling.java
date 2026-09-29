public class ExceptionHandling {
    public static void main(String[] args){
        //TRY - CATCH IN EXCEPTION HANDLING

        int[] marks = {97,98,95};
        try{
            System.out.println(marks[5]);
        }

        catch(Exception exception){
            //do something after catching
        }
        System.out.println("The name is Aman");
    }
}
