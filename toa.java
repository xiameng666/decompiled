public final class toa extends ttk {
    public static final byte[] a;
    public static final tvr b;

    static {
        byte[] arr_b = {-97, 0x70};
        toa.a = arr_b;
        toa.b = new tvr("Form Factor Indicator", "Indicates the form factor of the consumer payment device and the type of contactless interface over which the transaction was conducted. This information is made available to the issuer host.", arr_b, 1, 0x80000000, 0x7FFFFFFF, 3, 1, 4, 3, 5, 3, 4);
    }

    public toa(byte[] arr_b) {
        super(arr_b, toa.b);
    }
}

