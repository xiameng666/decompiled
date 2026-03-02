public final class tgp extends tgc implements Comparable {
    public static final byte[] a;
    public static final tik d;

    static {
        byte[] arr_b = {-97, 54};
        tgp.a = arr_b;
        tgp.d = new tik("Application Transaction Counter", "Count of the number of transactions initiated since personalization. Maintained by the application in the card.", arr_b, -1, 0x80000000, 0x7FFFFFFF, 3, 1, 2, 4, 2, 3, 3);
    }

    public tgp(byte[] arr_b) {
        super(arr_b, tgp.d);
    }

    public tgp(byte[] arr_b, byte[] arr_b1) {
        super(arr_b, false, tgp.d);
    }

    @Override
    public final int compareTo(Object object0) {
        return Integer.valueOf(this.n()).compareTo(Integer.valueOf(((tgp)object0).n()));
    }

    @Override  // tgc
    public final void d() {
    }

    public final int n() {
        return new tjp(this.k()).a();
    }
}

