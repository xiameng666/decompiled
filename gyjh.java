import j..util.Objects;

final class gyjh implements gykr {
    final gyjj a;

    public gyjh(gyjj gyjj0) {
        Objects.requireNonNull(gyjj0);
        this.a = gyjj0;
        super();
    }

    @Override  // gykr
    public final void a() {
        batl.s(this.a.c);
        this.a.c.c();
    }

    @Override  // gykr
    public final void b() {
        gyjj gyjj0 = this.a;
        gykl gykl0 = gyjj0.c;
        batl.s(gykl0);
        if(gykl0.g()) {
            gykl0.d();
            return;
        }
        ((ggtj)((ggtj)gyke.a.j()).ar(0x4F43)).R("%s cannot finish, in status: %s", gyjj0.b, gykl0.a);
    }
}

