public final class ttx extends ttk implements Comparable {
    public static final byte[] a;
    public static final tvr b;

    static {
        byte[] arr_b = {-97, 54};
        ttx.a = arr_b;
        ttx.b = new tvr("Application Transaction Counter", "Count of the number of transactions initiated since personalization. Maintained by the application in the card.", arr_b, -1, 0x80000000, 0x7FFFFFFF, 3, 1, 2, 4, 2, 3, 3);
    }

    public ttx(byte[] arr_b) {
        super(arr_b, ttx.b);
    }

    public ttx(byte[] arr_b, byte[] arr_b1) {
        super(arr_b, false, ttx.b);
    }

    public final int b() {
        return new tww(this.r()).a();
    }

    @Override
    public final int compareTo(Object object0) {
        return Integer.valueOf(this.b()).compareTo(Integer.valueOf(((ttx)object0).b()));
    }

    @Override  // ttk
    public final void fu() {
    }
}

