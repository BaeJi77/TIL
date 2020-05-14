import java.util.ArrayList;

public class JustCopy {
    public static void main(String[] args) {
        ArrayList<Integer> base = new ArrayList();
        for(int i = 1 ; i <= 5 ; ++i) {
            base.add(i);
        }

        System.out.println(base);

        ArrayList<Integer> copyArray = base;
        copyArray.set(0, 100);

        System.out.println(base);
        System.out.println(copyArray);

        int primitiveBase = 5;
        System.out.println(primitiveBase);

        int copyPrimitive = primitiveBase;
        copyPrimitive = 100;
        System.out.println(primitiveBase);
        System.out.println(copyPrimitive);
    }
}