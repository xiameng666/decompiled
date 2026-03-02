public final class tns extends ttk {
    public static final byte[] a;
    public static final tvr b;

    static {
        byte[] arr_b = {(byte)0x82};
        tns.a = arr_b;
        tns.b = new tvr("Application Interchange Profile", "Indicates the capabilities of the card to support specific functions in the application.", arr_b, -1, 0x80000000, 0x7FFFFFFF, 3, 1, 1, 2, 2, 3, 5);
    }

    public tns(byte[] arr_b) {
        super(arr_b, tns.b, null);
    }
}

