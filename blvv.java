public final class blvv implements gfsi {
    public final blwa a;
    public final bnae b;

    public blvv(blwa blwa0, bnae bnae0) {
        this.a = blwa0;
        this.b = bnae0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        boolean z = ((gfsx)object0).i();
        blwa blwa0 = this.a;
        bnae bnae0 = this.b;
        if(z) {
            if(hsvd.l()) {
                blwa0.i.z(bnae0, blhl.d, Long.valueOf(blwa0.m));
            }
            blpi blpi0 = (blpi)((gfsx)object0).d();
            blwa0.h.add(blpi0);
            return (gfsx)object0;
        }
        if(hsvd.l()) {
            blwa0.i.z(bnae0, blhl.e, Long.valueOf(blwa0.m));
        }
        return (gfsx)object0;
    }
}

