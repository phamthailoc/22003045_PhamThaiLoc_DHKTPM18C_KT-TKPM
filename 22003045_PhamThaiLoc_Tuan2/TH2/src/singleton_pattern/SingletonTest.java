package singleton_pattern;

public class SingletonTest {

    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.showMessage();

        if (s1 == s2) {
            System.out.println("Only ONE instance exists");
        }

    }

}
