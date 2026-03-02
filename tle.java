public final class tle extends tak {
    public static final byte[] c;
    public static final tcz d;

    static {
        byte[] arr_b = {-97, 77};
        tle.c = arr_b;
        tle.d = new tcz("Log Entry", "Log Entry", arr_b, 2, 0x7FFFFFFF, 3, 1, 4, 1, 1, null, 1);
    }

    public tle(byte[] arr_b) {
        super(arr_b, tle.d);
    }
}

