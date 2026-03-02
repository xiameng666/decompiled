public final class tqv extends tgc {
    public static final byte[] a = null;
    public static final tik d = null;
    private static final long serialVersionUID = 1L;

    static {
        byte[] arr_b = {-97, 97};
        tqv.a = arr_b;
        tqv.d = new tik("Card Option Status", "This data element was originally defined in [DI ICC Spec]. Some of the bit settings have been\nreused by cMDA", arr_b, 2, 0x80000000, 0x7FFFFFFF, 3, 1, 2, 3, 5, 3, 4);
    }

    public tqv(byte[] arr_b) {
        super(arr_b, tqv.d);
    }

    public final boolean n() {
        return this.j(0, 1) && !this.j(0, 0);
    }
}

