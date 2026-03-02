public final class tua extends ttk {
    public static final byte[] a;
    public static final tvr b;

    static {
        byte[] arr_b = {-97, 38};
        tua.a = arr_b;
        tua.b = new tvr("Application Cryptogram", "Cryptogram returned by the card in response to the GPO command.", arr_b, -1, 0x80000000, 0x7FFFFFFF, 3, 1, 1, 6, 2, 3, 5);
    }

    public tua(byte[] arr_b, boolean z) {
        super(arr_b, z, tua.b);
    }
}

