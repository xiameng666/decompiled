public final class hnly {
    public static final byte[] a;
    public static final byte[] b;
    public static final byte[] c;
    public final hnmq d;
    public final hnmq e;

    static {
        hnly.a = new byte[1];
        hnly.b = new byte[6];
        hnly.c = new byte[]{9, -103};
    }

    public hnly(hnma hnma0, hnlj hnlj0) {
        this.d = hnma0;
        this.e = hnlj0;
    }

    public static final byte[] a(byte[][] arr2_b) {
        for(int v = 0; v < 2; ++v) {
            byte[] arr_b = arr2_b[v];
            if(arr_b != null) {
                return arr_b;
            }
        }
        return null;
    }

    public static final byte[] b(byte[] arr_b, byte[] arr_b1, byte[] arr_b2) {
        byte[] arr_b3 = hnly.a(new byte[][]{arr_b, arr_b1});
        return arr_b3 == null ? arr_b2 : arr_b3;
    }

    public static final byte[] c(byte[] arr_b, byte[] arr_b1) {
        byte[] arr_b2 = hnly.a(new byte[][]{arr_b, arr_b1});
        if(arr_b2 != null) {
            return arr_b2;
        }
        throw new hnkl();
    }
}

