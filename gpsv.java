public final class gpsv implements gpsx {
    public static gpsw a;
    public final gpsx b;

    static {
        gpsv.a = new gpsu();
    }

    public gpsv(gpsx gpsx0) {
        this.b = gpsx0;
    }

    @Override  // gpsx
    public final gpsx a(String s) {
        return this.g(s);
    }

    @Override  // gpsx
    public final void b(String s) {
        gpqn.a(this, s);
    }

    @Override  // gpsx
    public final void c(String s, Throwable throwable0) {
        gpqn.b(this, s, throwable0);
    }

    @Override  // gpsx
    public final void d(String s) {
        gpqn.c(this, s);
    }

    @Override  // gpsx
    public final void e(String s) {
        gpqn.d(this, s);
    }

    @Override  // gpsx
    public final void f(String s) {
        gpqn.e(this, s);
    }

    public final gpsv g(String s) {
        return new gpsv(this.b.a(s));
    }
}

