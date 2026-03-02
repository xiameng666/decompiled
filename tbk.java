public final class tbk extends tak {
    public static final byte[] c;
    public static final tdb d;
    public static final tcz e;

    static {
        byte[] arr_b = {-97, 39};
        tbk.c = arr_b;
        tbk.d = tdb.b;
        tbk.e = new tcz("Cryptogram Information Data", "Indicates the type of cryptogram (TC, ARQC, or AAC) returned by the card and the actions to be performed by the reader.", arr_b, 1, 0x7FFFFFFF, 3, 1, 2, 6, 2, tdb.b, 5);
    }

    public tbk(byte b) {
        this(new byte[]{b});
    }

    public tbk(byte[] arr_b) {
        super(arr_b, false, tbk.e);
    }
}

