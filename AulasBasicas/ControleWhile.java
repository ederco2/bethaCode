
public class ControleWhile {
    public ControleWhile() {
    }

    public static void main(String[] args) {
        for(int x = 10; x < 10; ++x) {
            System.out.println("Item" + x);
        }

        int y = 10;

        do {
            System.out.println("Item2: " + y);
            ++y;
        } while(y < 10);

    }
}
