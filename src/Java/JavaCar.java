package Java;

public class JavaCar {
    public JavaCar() {
        System.out.println("Running from java!");
    }

    public void printArrayString(String[][] strArr) {
        for (String[] row : strArr) {
            for (String value : row) {
                System.out.print(value + " ");
            }
            System.out.print("\n-----\n");
        }
    }
}
