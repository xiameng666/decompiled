public final class thj extends tgc {
    public static final byte[] a;
    public static final tik d;

    static {
        byte[] arr_b = {90};
        thj.a = arr_b;
        thj.d = new tik("Application Primary Account Number (PAN)", "Valid cardholder account number.", arr_b, -1, 0x80000000, 19, 2, 1, 3, 2, 2, 2, 6);
    }

    public thj(byte[] arr_b) {
        super(arr_b, thj.d);
    }
}

