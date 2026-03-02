public final class tqw extends tgc {
    public static final byte[] a = null;
    public static final byte[] d = null;
    public static final tik e = null;
    private static final long serialVersionUID = 1L;

    static {
        tqw.a = new byte[]{0, 20, 0, 0};
        byte[] arr_b = {-97, 99};
        tqw.d = arr_b;
        tqw.e = new tik("Card Transaction Information", "", arr_b, 4, 0x80000000, 0x7FFFFFFF, 3, 1, 3, 3, 5, 3, 4);
    }

    public tqw(byte[] arr_b) {
        super(arr_b, tqw.e);
    }

    public final void n() {
        this.e(0, 7, false);
        this.e(0, 6, false);
    }

    public final void o() {
        this.e(0, 7, true);
    }

    public final void p() {
        this.e(0, 0, true);
    }

    public final void q() {
        this.e(2, 3, true);
    }

    public final void r() {
        this.e(0, 5, true);
        this.e(0, 4, true);
    }

    public final boolean s() {
        return this.j(2, 3);
    }
}

