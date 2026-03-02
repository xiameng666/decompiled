public final class fopr {
    public static final fopr a;
    public final fopw[] b;
    public final int[] c;

    static {
        fopr.a = new fopr(new fopw[0]);
    }

    public fopr(fopw[] arr_fopw) {
        this.b = arr_fopw;
        this.c = new int[arr_fopw.length];
        for(int v = 0; v < arr_fopw.length; ++v) {
            this.c[v] = arr_fopw[v].d;
        }
    }
}

