import java.math.BigInteger;

public final class iebc {
    public static final byte[] a(BigInteger bigInteger0, int v) {
        byte[] arr_b = bigInteger0.toByteArray();
        if(v < arr_b.length) {
            byte[] arr_b1 = new byte[v];
            System.arraycopy(arr_b, arr_b.length - v, arr_b1, 0, v);
            return arr_b1;
        }
        if(v > arr_b.length) {
            byte[] arr_b2 = new byte[v];
            System.arraycopy(arr_b, 0, arr_b2, v - arr_b.length, arr_b.length);
            return arr_b2;
        }
        return arr_b;
    }
}

