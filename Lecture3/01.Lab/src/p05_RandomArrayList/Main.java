package p05_RandomArrayList;

@SuppressWarnings("unchecked")
public class Main {
    public static void main(String[] args) {
        RandomArrayList ral = new RandomArrayList();
        ral.add("Test1");
        ral.add("Test2");
        ral.add("Test3");
        ral.add("Test4");

        System.out.println(ral.getRandomElement());
    }
}
