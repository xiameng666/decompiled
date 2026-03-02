public final class tir extends tgc {
    public static final byte[] a;
    public static final tik d;

    static {
        byte[] arr_b = {-102};
        tir.a = arr_b;
        tir.d = new tik("Transaction Date", "Local date that the transaction was authorised", arr_b, 3, 0x80000000, 0x7FFFFFFF, 3, 2, 0, 1, 1, 3, 1);
    }

    public tir(byte[] arr_b) {
        super(arr_b, tir.d);
    }
}

