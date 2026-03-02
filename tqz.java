public final class tqz extends tgc {
    public static final byte[] a;
    public static final tik d;

    static {
        byte[] arr_b = {-97, 0x70};
        tqz.a = arr_b;
        tqz.d = new tik("Form Factor Indicator", "Indicates the form factor of the consumer payment device and the type of contactless interface over which the transaction was conducted. This information is made available to the issuer host.", arr_b, 1, 0x80000000, 0x7FFFFFFF, 3, 1, 4, 3, 5, 3, 4);
    }

    public tqz(byte[] arr_b) {
        super(arr_b, tqz.d);
    }
}

