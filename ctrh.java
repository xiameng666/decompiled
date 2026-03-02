public final class ctrh implements evqc {
    public final ctrq a;

    public ctrh(ctrq ctrq0) {
        this.a = ctrq0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        ctrq ctrq0 = this.a;
        ((ggtj)((ggtj)ctrq0.d.j()).s(exception0)).B("Failed to disconnect from device %s", ctrq0.h);
        do {
            Object object0 = ctrq0.k.b();
            ctow ctow0 = (ctow)object0;
        }
        while(!ctrq0.k.h(object0, ctot.a));
    }
}

