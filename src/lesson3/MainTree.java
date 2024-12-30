package lesson3;

//Создайте три объекта на основе класса и используйте по одному конструктору на каждый.

public class MainTree {
    public static void main(String[] args) {

        Tree tree1 = new Tree(109, "Oak");
        System.out.println(tree1);

        Tree tree2 = new Tree(87, true, "Fir");
        System.out.println(tree2);

        Tree tree3 = new Tree();
    }
}
