public final class tin extends tgc {
    public static final byte[] a;
    public static final tik d;

    static {
        byte[] arr_b = {-97, 26};
        tin.a = arr_b;
        tin.d = new tik("Terminal Country Code", "Indicates the country of the terminal, represented according to ISO 3166", arr_b, 2, 0x80000000, 0x7FFFFFFF, 3, 2, 2, 1, 1, 3, 1);
    }

    public tin(byte[] arr_b) {
        super(arr_b, tin.d);
    }
}

