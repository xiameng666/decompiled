public final class cln implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        long v = ((cke)object0).d;
        ((cke)object0).n();
        long v1 = ((cke)object0).d;
        if(v != v1) {
            cju cju0 = ((cke)object0).h;
            if(cju0 != null) {
                if(cju0.a > v1) {
                    ((cke)object0).l();
                    return ibom.a;
                }
                cju0.g = v1;
                cju0.h = ibvr.d((1.0 - ((double)cju0.e.a(0))) * ((double)v1));
                return ibom.a;
            }
            if(v1 != 0L) {
                ((cke)object0).o();
            }
        }
        return ibom.a;
    }
}

