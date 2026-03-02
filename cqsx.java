public final class cqsx implements gpsx {
    private final cqwd a;

    public cqsx(cqwd cqwd0) {
        this.a = cqwd0;
    }

    @Override  // gpsx
    public final gpsx a(String s) {
        return this;
    }

    @Override  // gpsx
    public final void b(String s) {
        ((ggtj)this.a.a.i()).B("%s", s);
    }

    @Override  // gpsx
    public final void c(String s, Throwable throwable0) {
        a.e(this.a.a.i(), "%s", s, throwable0);
    }

    @Override  // gpsx
    public final void d(String s) {
        ((ggtj)this.a.a.h()).B("%s", s);
    }

    @Override  // gpsx
    public final void e(String s) {
        ((ggtj)this.a.a.h()).B("%s", s);
    }

    @Override  // gpsx
    public final void f(String s) {
        ((ggtj)this.a.a.j()).B("%s", s);
    }
}

