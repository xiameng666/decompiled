public final class tbu extends tbo {
    public static final byte[] c;
    public static final tdb d;
    public static final tcz e;

    static {
        byte[] arr_b = {-97, 56};
        tbu.c = arr_b;
        tbu.d = tdb.c;
        tbu.e = new tcz("Processing Options Data Object List", "List of terminal/reader-related data objects (tags and lengths) requested by the card to be transmitted in the GET PROCESSING OPTIONS command.", arr_b, -1, 0x7FFFFFFF, 3, 1, 2, 2, 2, tdb.c, 7);
    }

    public tbu(byte[] arr_b) {
        super(arr_b, tbu.e);
    }
}

