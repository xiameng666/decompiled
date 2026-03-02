final class bgcy implements ibtx {
    final gne a;
    final bgds b;

    public bgcy(gne gne0, bgds bgds0) {
        this.a = gne0;
        this.b = bgds0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dib)object0), "$this$PullToRefreshBox");
        if((v & 6) == 0) {
            v |= (((goz)object1).X(((dib)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        if(hsam.d()) {
            ((goz)object1).M(0x1DBCF592);
            gne gne0 = this.a;
            bgds bgds0 = this.b;
            gmm gmm0 = gmm.a;
            hfc hfc0 = ((dib)object0).a(hfc.e, hei.b);
            ((goz)object1).M(0x6E3C21FE);
            Object object3 = ((goz)object1).k();
            if(object3 == gop.a) {
                object3 = new bgcx();
                ((goz)object1).R(object3);
            }
            ((goz)object1).A();
            hfc hfc1 = iuc.b(hfc0, ((ibts)object3));
            gmm0.c(gne0, bgds0.a, hfc1, 0L, 0L, 0.0f, ((goz)object1), 0);
            ((goz)object1).A();
            return ibom.a;
        }
        ((goz)object1).M(0x1DC233E5);
        hfc hfc2 = ((dib)object0).a(hfc.e, hei.b);
        gmm.a.a(this.a, this.b.a, hfc2, 0L, 0L, 0.0f, ((goz)object1), 0, 56);
        ((goz)object1).A();
        return ibom.a;
    }
}

