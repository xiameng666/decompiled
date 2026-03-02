public final class dupr implements evqf {
    public final duqg a;

    public dupr(duqg duqg0) {
        this.a = duqg0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        boolean z = ((gfsx)object0).i();
        duqg duqg0 = this.a;
        if(!z) {
            duqg0.M();
            return;
        }
        if(duqg0.aA.equals(gtxf.d)) {
            dvfh dvfh0 = duqg0.b;
            gtxf gtxf0 = duqg0.aA;
            dveo dveo0 = new dveo(dvfh0);
            dpud dpud0 = new dpud(new dvep(dvfh0), dveo0);
            dvfh0.I.e(gtxf0, dpud0);
            duqg0.b.B.g(duqg0.getViewLifecycleOwner(), new dupz(duqg0, ((gfsx)object0)));
            return;
        }
        duqg0.B(((gtxg)((gfsx)object0).d()));
    }
}

