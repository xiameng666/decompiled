public final class tuf extends ttk {
    public static final byte[] a;
    public static final tvr b;

    static {
        byte[] arr_b = {-97, 39};
        tuf.a = arr_b;
        tuf.b = new tvr("Cryptogram Information Data", "Indicates the type of cryptogram (TC, ARQC, or AAC) returned by the card and the actions to be performed by the reader.", arr_b, 1, 0x80000000, 0x7FFFFFFF, 3, 1, 2, 6, 2, 2, 5);
    }

    public tuf(byte b) {
        this(new byte[]{b});
    }

    public tuf(byte[] arr_b) {
        super(arr_b, false, tuf.b);
    }
}

