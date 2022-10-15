public class Main {

    public static void main(String[] args) {

        String ip = "123.1234.1234.123";
        String [] ipSplitters = ip.split("\\.");
        for (String i:ipSplitters){
            System.out.println(i);
        }

    }
}
