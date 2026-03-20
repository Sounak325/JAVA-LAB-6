interface Greeting {
    void sayHello();
}
public class TestGreeting {
    public static void main(String[] args) {
        Greeting g = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello, welcome to Java programming!");
            }
        };
        g.sayHello();
    }
}
