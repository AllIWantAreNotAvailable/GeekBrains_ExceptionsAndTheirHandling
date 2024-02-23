package Tasks;

public class Task03 {

    public int[] divArrays(int[] a, int[] b){
        int aLength = a.length;
        if (aLength != b.length) {
            return new int[1];
        }
        int[] c = new int[aLength];
        for (int i = 0; i < aLength; i++) {
            c[i] = a[i] / b[i];
        }
        return c;
    }

}
