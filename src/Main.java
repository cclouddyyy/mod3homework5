import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        HashSet mySet = new HashSet(5);

        mySet.add(5);
        mySet.add(10);
        mySet.add(15);
        mySet.add(20);
        mySet.add(25);

        System.out.println(mySet.contains(10));
        mySet.remove(10);
        System.out.println(mySet.contains(10));
    }
}