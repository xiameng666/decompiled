public final class cttf implements evqc {
    public final cttl a;

    public cttf(cttl cttl0) {
        this.a = cttl0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        cttl cttl0 = this.a;
        if((exception0 instanceof aztb) && ((aztb)exception0).b() == 8003) {
            icnl icnl0 = cttl0.i;
            do {
                Object object0 = icnl0.b();
                ctow ctow0 = (ctow)object0;
            }
            while(!icnl0.h(object0, ctor.a));
            return;
        }
        ((ggtj)((ggtj)cttl0.d.j()).s(exception0)).A("Connection failed: %s", cttl0.c.a);
        icnl icnl1 = cttl0.i;
        do {
            Object object1 = icnl1.b();
            ctow ctow1 = (ctow)object1;
        }
        while(!icnl1.h(object1, ctot.a));
    }
}

