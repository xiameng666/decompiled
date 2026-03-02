public final class tiq extends tgc {
    public static final byte[] a;
    public static final tik d;

    static {
        byte[] arr_b = {0x5F, 42};
        tiq.a = arr_b;
        tiq.d = new tik("Transaction Currency Code", "Indicates the currency code of the transaction according to ISO 4217", arr_b, 2, 0x80000000, 0x7FFFFFFF, 3, 2, 0, 1, 1, 3, 1);
    }

    public tiq(byte[] arr_b) {
        super(arr_b, true, tiq.d);
    }
}

