package src;

public class Recurson {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Recurson r = new Recurson();
        r.recurse(5);
    }
    public void recurse (int count) {
        if (count <=0)
            System.out.println(".");
        else {
            System.out.println(count + " *");
            recurse(count -1);
        }
    }
}
