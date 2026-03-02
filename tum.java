public final class tum extends ttk {
    public static final byte[] a;
    public static final tvr b;

    static {
        byte[] arr_b = {(byte)0x84};
        tum.a = arr_b;
        tum.b = new tvr("Dedicated File Name", "Identifies the name of the DF as described in ISO/IEC 7816-4", arr_b, -1, 0x80000000, 0x7FFFFFFF, 3, 1, 4, 2, 2, 3, 7);
    }

    public tum(byte[] arr_b) {
        super(arr_b, tum.b);
    }
}

