import j..util.Objects;

final class gyjg implements gykr {
    final gyjj a;

    public gyjg(gyjj gyjj0) {
        Objects.requireNonNull(gyjj0);
        this.a = gyjj0;
        super();
    }

    @Override  // gykr
    public final void a() {
        ((ggtj)((ggtj)gyke.a.i()).ar(0x4F40)).B("%s ERROR starting operation!", this.a.b);
        batl.s(this.a.c);
        this.a.c.c();
        this.a.d.set(2);
    }

    @Override  // gykr
    public final void b() {
        gyjj gyjj0 = this.a;
        gykl gykl0 = gyjj0.c;
        batl.s(gykl0);
        if(gykl0.a != gyhw.g && gykl0.a != gyhw.h && gykl0.a != gyhw.b) {
            ((ggtj)((ggtj)gyke.a.j()).ar(20290)).R("%s cannot be active, in state: %s", gyjj0.b, gykl0.a);
        }
        else {
            gykl0.a();
        }
        gyjj0.d.set(2);
    }
}

