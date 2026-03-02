public final class tdg extends tdk {
    public static final tcz c;

    static {
        tdg.c = new tcz("Transaction Currency Code", "Indicates the currency code of the transaction according to ISO 4217", tdg.d, 2, 0x7FFFFFFF, 1, 2, 0, 1, 1, tdg.e, 1);
    }

    public tdg(byte[] arr_b) {
        super(arr_b, tdg.c);
    }
}

