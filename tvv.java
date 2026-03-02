public final class tvv extends ttk {
    public static final byte[] a;
    public static final tvr b;

    static {
        byte[] arr_b = {-97, 26};
        tvv.a = arr_b;
        tvv.b = new tvr("Terminal Country Code", "Indicates the country of the terminal, represented according to ISO 3166", arr_b, 2, 0x80000000, 0x7FFFFFFF, 3, 2, 2, 1, 1, 3, 1);
    }

    public tvv(byte[] arr_b) {
        super(arr_b, tvv.b);
    }
}

