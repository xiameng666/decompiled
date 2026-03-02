public final class iho implements ihs {
    @Override  // ihs
    public final int a() {
        return 16;
    }

    @Override  // ihs
    public final void b(ify ify0, long v, ifb ifb0, int v1, boolean z) {
        ify0.H(v, ifb0, v1, z);
    }

    @Override  // ihs
    public final boolean c(ify ify0) {
        return true;
    }

    @Override  // ihs
    public final boolean d(ify ify0) {
        return false;
    }

    @Override  // ihs
    public final void e(hfb hfb0) {
        gwq gwq0 = null;
        while(hfb0 != null) {
            if((hfb0 instanceof ijc)) {
                ((ijc)hfb0).E();
            }
            else if((hfb0.s & 16) != 0 && (hfb0 instanceof iep)) {
                hfb hfb1 = ((iep)hfb0).D;
                int v = 0;
                while(hfb1 != null) {
                    if((hfb1.s & 16) != 0) {
                        ++v;
                        if(v == 1) {
                            hfb0 = hfb1;
                        }
                        else {
                            if(gwq0 == null) {
                                gwq0 = new gwq(new hfb[16]);
                            }
                            if(hfb0 != null) {
                                gwq0.n(hfb0);
                            }
                            gwq0.n(hfb1);
                            hfb0 = null;
                        }
                    }
                    hfb1 = hfb1.v;
                }
                if(v != 1) {
                    goto label_23;
                }
                continue;
            }
        label_23:
            hfb0 = ien.a(gwq0);
        }
    }
}

