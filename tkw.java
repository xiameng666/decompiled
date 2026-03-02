public final class tkw extends tbc {
    public static final byte[] d;
    public static final tcz e;

    static {
        byte[] arr_b = {(byte)0x82};
        tkw.d = arr_b;
        tkw.e = new tcz("Application Interchange Profile", "Indicates the capabilities of the card to support specific functions in the application.", arr_b, -1, 0x7FFFFFFF, 3, 1, 1, 2, 2, tkw.c, 5);
    }

    public tkw(byte[] arr_b) {
        super(arr_b, tkw.e);
    }
}

