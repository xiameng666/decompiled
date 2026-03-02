public final class tgx extends tgc {
    public static final byte[] a;
    public static final tik d;

    static {
        byte[] arr_b = {-97, 39};
        tgx.a = arr_b;
        tgx.d = new tik("Cryptogram Information Data", "Indicates the type of cryptogram (TC, ARQC, or AAC) returned by the card and the actions to be performed by the reader.", arr_b, 1, 0x80000000, 0x7FFFFFFF, 3, 1, 2, 6, 2, 2, 5);
    }

    public tgx(byte b) {
        this(new byte[]{b});
    }

    public tgx(byte[] arr_b) {
        super(arr_b, false, tgx.d);
    }

    public final boolean n() {
        return this.k()[0] == 0;
    }
}

