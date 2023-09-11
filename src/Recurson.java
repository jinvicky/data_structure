public class Recurson {

    public void recurse (int count) {
        if (count <=0)
            System.out.println(".");
        else {
            System.out.println(count + " *");
            recurse(count -1);
        }
    }
}
