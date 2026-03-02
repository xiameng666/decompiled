public final class tvt extends ttk {
    public static final byte[] a;
    public static final tvr b;

    static {
        byte[] arr_b = {-97, 2};
        tvt.a = arr_b;
        tvt.b = new tvr("Amount, Authorized", "Authorized amount of the transaction (including Amount, Other and excluding adjustments).", arr_b, 6, 0x80000000, 0x7FFFFFFF, 3, 2, 0, 1, 1, 3, 1);
    }

    public tvt(byte[] arr_b) {
        super(arr_b, true, tvt.b);
    }

    public final boolean b() {
        byte[] arr_b = this.r();
        for(int v = 0; v < arr_b.length; ++v) {
            if(arr_b[v] != 0) {
                return false;
            }
        }
        return true;
    }
}

