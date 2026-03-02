public final class tba extends tak implements Comparable {
    public static final byte[] c;
    public static final tdb d;
    public static final tcz e;

    static {
        byte[] arr_b = {-97, 54};
        tba.c = arr_b;
        tba.d = tdb.c;
        tba.e = new tcz("Application Transaction Counter", "Count of the number of transactions initiated since personalization. Maintained by the application in the card.", arr_b, -1, 0x7FFFFFFF, 3, 1, 2, 4, 2, tdb.c, 3);
    }

    public tba(byte[] arr_b) {
        super(arr_b, tba.e);
    }

    public tba(byte[] arr_b, byte[] arr_b1) {
        super(arr_b, false, tba.e);
    }

    @Override
    public final int compareTo(Object object0) {
        return Integer.valueOf(this.h()).compareTo(Integer.valueOf(((tba)object0).h()));
    }

    public final int h() {
        return new teh(this.f()).a();
    }
}

