import java.util.*;

public class problema271 {
    public static void main(String[] args) {
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        List<Integer> xPlusY = new ArrayList<>();
        Set<Integer> zSet = new TreeSet<>();
        List<Integer> xMinusY = new ArrayList<>();
        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList<>();

        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            x.add(rand.nextInt(11));
        }
        for (int i = 0; i < 7; i++) {
            y.add(rand.nextInt(11));
        }

        Collections.sort(x);
        Collections.sort(y);

        xPlusY.addAll(x);
        xPlusY.addAll(y);
        Collections.sort(xPlusY);

        zSet.addAll(x);
        zSet.retainAll(y);

        xMinusY.addAll(x);
        xMinusY.removeAll(y);

        xPlusYLimitedByP.addAll(xPlusY);
        Iterator<Integer> it = xPlusYLimitedByP.iterator();
        while (it.hasNext()) {
            Integer valoare = it.next();
            if (valoare > p) {
                it.remove();
            }
        }

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("a) xPlusY = " + xPlusY);
        System.out.println("b) zSet = " + zSet);
        System.out.println("c) xMinusY = " + xMinusY);
        System.out.println("d) xPlusYLimitedByP = " + xPlusYLimitedByP);
    }
}