import java.util.HashSet;
import java.util.Set;

class esecizio26di1 {
    private static void ponerElementros(Set container, String x, String z, String y) {
        container.add(x);
        container.add(z);
        container.add(y);
    }
    public static void main(String[] args) {

        Set<String> coches = new HashSet<String>();
        ponerElementros(coches, "Jeep", "Nissan", "MiniCooper");
        System.out.println("Cuanto es el total? " + coches.size());
        for (String a : coches) {
            System.out.println(a);
        }

    }
}