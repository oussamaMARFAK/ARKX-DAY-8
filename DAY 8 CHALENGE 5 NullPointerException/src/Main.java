public class Main {
    public static void main(String[] args) {

        String life =null;
        try {
            System.out.println(life.charAt(0));
        } catch (NullPointerException e) {
            System.out.println("the string is null");
        }finally {
            if (life==null){
                life="vcgcj";
                System.out.println("the new string is: "+life);
            }
        }
    }
}