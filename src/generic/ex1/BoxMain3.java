package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<>();
        integerBox.set(10);
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.set("Hello");
        String string = stringBox.get();
        System.out.println("string = " + string);

        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(7.5);
        Double double2 = doubleBox.get();
        System.out.println("double = " + double2);

    }
}
