public final class eraw {
    private static eraw a;
    private long b;

    public eraw() {
        this.b = System.currentTimeMillis();
    }

    public final void a(int v, eqoc eqoc0) {
        eraz.a(9, this.g(), 0, 0, "", v, (eqoc0 == null ? 0 : eqoc0.d), 0, false);
    }

    public final void b(int v) {
        eraz.a(v, this.g(), 0, 0, "", 0, 0, 0, false);
    }

    public final void c(int v) {
        eraz.a(5, this.g(), 0, 0, "", 0, 0, v, false);
    }

    public final void d(eqmz eqmz0, boolean z) {
        int v = eqmz0.a().c().k;
        String s = eqmz0.c();
        eraz.a(4, this.g(), 0, v, s, 0, 0, 0, z);
    }

    public static final void e() {
        eraw.a = null;
    }

    public static eraw f() {
        synchronized(eraw.class) {
            if(eraw.a == null) {
                eraw.a = new eraw();
            }
        }
        return eraw.a;
    }

    private final long g() {
        long v = System.currentTimeMillis();
        long v1 = v - this.b;
        this.b = v;
        return v1;
    }
}

