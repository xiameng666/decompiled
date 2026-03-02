public final class hmok {
    public long[] a;
    private static final hmok b;

    static {
        hmok.b = new hmok(null);
    }

    public hmok() {
    }

    public hmok(hmok hmok0) {
        this.a = (long[])hmok0.a.clone();
    }

    private hmok(byte[] arr_b) {
        this.a = new long[]{0L, 0L};
    }

    public hmok(byte[] arr_b, byte[] arr_b1) {
        long[] arr_v = new long[2];
        this.a = arr_v;
        arr_v[0] = (long)hmpy.N(arr_b, 2, 4);
        this.a[1] = 0L;
    }

    public final void a(hmok hmok0) {
        long[] arr_v = this.a;
        long[] arr_v1 = hmok0.a;
        arr_v[0] += arr_v1[0];
        arr_v[1] += arr_v1[1];
    }

    public final void b(hmok hmok0) {
        long[] arr_v = this.a;
        long[] arr_v1 = hmok0.a;
        arr_v[0] -= arr_v1[0];
        arr_v[1] -= arr_v1[1];
    }

    public final boolean c() {
        return hmok.b.d(this);
    }

    public final boolean d(hmok hmok0) {
        hmok hmok1 = new hmok(this);
        hmok1.b(hmok0);
        return hmok1.e();
    }

    public final boolean e() {
        return this.a[0] < 0L;
    }

    public final byte[] f() {
        return hmpy.T(4, ((int)this.a[0]));
    }

    public final long[] g() {
        return (long[])this.a.clone();
    }
}

