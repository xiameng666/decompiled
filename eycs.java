import j..time.Duration;

final class eycs extends ibsl implements ibtw {
    int a;
    int b;
    final int c;
    final eycx d;

    public eycs(int v, eycx eycx0, ibrl ibrl0) {
        this.c = v;
        this.d = eycx0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eycs)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eycs(this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        int v;
        Object object1 = ibrx.a;
        if(this.b == 0) {
            ibnx.b(object0);
            v = this.c;
        }
        else {
            v = this.a;
            ibnx.b(object0);
            --v;
        }
        while(v > 0) {
            Duration duration0 = Duration.ofSeconds(1L);
            ibuq.e(duration0, "ofSeconds(...)");
            this.a = v;
            this.b = 1;
            if(glya.a(duration0, this) == object1) {
                return object1;
            }
            --v;
        }
        ((ggtj)this.d.a.h()).z("Closing GATT connection after %d seconds", this.c);
        this.d.d.b();
        return ibom.a;
    }
}

