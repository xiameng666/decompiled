public final class ufi extends uql implements ufj {
    public udm a;

    public ufi(long v) {
        super(v);
    }

    @Override  // uql
    protected final int a(Object object0) {
        return ((ueb)object0) == null ? 1 : ((ueb)object0).a();
    }

    @Override  // ufj
    public final ueb b(uay uay0) {
        return (ueb)super.i(uay0);
    }

    @Override  // uql
    protected final void c(Object object0, Object object1) {
        uay uay0 = (uay)object0;
        udm udm0 = this.a;
        if(udm0 != null && ((ueb)object1) != null) {
            udm0.d.a(((ueb)object1), true);
        }
    }

    @Override  // ufj
    public final void d(uay uay0, ueb ueb0) {
        ueb ueb1 = (ueb)super.h(uay0, ueb0);
    }
}

