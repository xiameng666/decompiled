final class eirn {
    static final eirn a;
    public final byte[] b;
    public final String c;
    public final long d;

    static {
        eirn.a = new eirn(null, "", 0L);
    }

    public eirn(byte[] arr_b, String s, long v) {
        this.b = arr_b;
        this.c = s;
        this.d = v;
    }
}

