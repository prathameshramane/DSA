package Learning.Array;

public class Main {
    public static void main(String[] args) {
        Array array = new Array(3);
        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(40);
        array.removeAt(0);
        array.insert(10);
        System.out.println(array.indexOf(30));
        array.print();
    }
}
