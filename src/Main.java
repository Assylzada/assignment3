public class Main {
    public static void main(String[] args) {
        BST<Integer, String> tree = new BST<>();

        tree.put(5, "five");
        tree.put(3, "three");
        tree.put(7, "seven");
        tree.put(2, "two");
        tree.put(4, "four");

        System.out.println("Size: " + tree.size());

        for (var elem : tree) {
            System.out.println("key is " + elem.getKey() + " and value is " + elem.getValue());
        }

        System.out.println("Get 4: " + tree.get(4));

        tree.delete(3);
        System.out.println("After deleting key 3:");
        for (var elem : tree) {
            System.out.println("key is " + elem.getKey() + " and value is " + elem.getValue());
        }

        System.out.println("Size after delete: " + tree.size());
    }
}
