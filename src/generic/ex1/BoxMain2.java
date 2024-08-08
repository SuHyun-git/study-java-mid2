package generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Object object = integerBox.get();
        Integer integer = (Integer)object;
        Integer integer2 = (Integer)integerBox.get();
        System.out.println("integer = " + integer);
        System.out.println("integer2 = " + integer2);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get();
        System.out.println("str = " + str);
    }
}
