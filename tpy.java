public final class tpy extends ttk {
    public static final byte[] a = null;
    public static final tvr b = null;
    private static final long serialVersionUID = 1L;

    static {
        byte[] arr_b = {-97, 88};
        tpy.a = arr_b;
        tpy.b = new tvr("Merchant Type Indicator", "Defines the Merchant type for card risk management\npurposes.", arr_b, 1, 0x80000000, 0x7FFFFFFF, 3, 2, 2, 2, 1, 3, 4);
    }

    public tpy(byte[] arr_b) {
        super(arr_b, tpy.b);
    }
}

