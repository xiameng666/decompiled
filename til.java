public final class til extends tgc {
    public static final byte[] a;
    public static final tik d;

    static {
        byte[] arr_b = {-97, 2};
        til.a = arr_b;
        til.d = new tik("Amount, Authorized", "Authorized amount of the transaction (including Amount, Other and excluding adjustments).", arr_b, 6, 0x80000000, 0x7FFFFFFF, 3, 2, 0, 1, 1, 3, 1);
    }

    public til(byte[] arr_b) {
        super(arr_b, true, til.d);
    }

    public final boolean n() {
        byte[] arr_b = this.k();
        for(int v = 0; v < arr_b.length; ++v) {
            if(arr_b[v] != 0) {
                return false;
            }
        }
        return true;
    }
}

