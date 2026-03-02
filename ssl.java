public final class ssl extends stc {
    public static final ssy a;
    public final int b;

    static {
        ssl.a = new ssy(0xDF6D);
    }

    public ssl(int v) {
        byte[] arr_b = sto.g(((short)v));
        super(ssl.a, arr_b, false, ssa.e);
        stp.a(v, 0, 0xFFFF, "Size");
        this.b = v;
    }
}

