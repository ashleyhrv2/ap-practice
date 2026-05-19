package javaPack;

public class Main
{
    public static void main(String[] args)
    {
        String requested = "Amy-Marie-Lin";
        String copy = requested;

        Account acc = new Account();

        System.out.println("requested name: " + requested);

        String s1 = acc.getShortenedName();
        String s2 = s1;

        System.out.println("final username: " + acc.getShortenedName());
        System.out.println("shortened: " + s2);
    }
}