public class Main {
    public static void main(String[] args) {

        Fan fan1 = new Fan(100, true, 10, "yellow");
        Fan fan2 = new Fan(50, false, 5, "blue");

        System.out.println("Fan1: "+fan1.toString());
        System.out.println("Fan2: "+fan2.toString());
    }
}
