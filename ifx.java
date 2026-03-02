final class ifx extends ibur implements ibth {
    final ify a;
    final ibvd b;

    public ifx(ify ify0, ibvd ibvd0) {
        this.a = ify0;
        this.b = ibvd0;
        super(0);
    }

    @Override  // ibth
    public final Object a() {
        ihl ihl0 = this.a.u;
        if((ihl0.a() & 8) != 0) {
            hfb hfb0 = ihl0.e;
            while(hfb0 != null) {
                if((hfb0.s & 8) != 0) {
                    hfb hfb1 = hfb0;
                    gwq gwq0 = null;
                    while(hfb1 != null) {
                        if((hfb1 instanceof ije)) {
                            ibvd ibvd0 = this.b;
                            if(((ije)hfb1).w()) {
                                ibvd0.a = new ity();
                                ((ity)ibvd0.a).b = true;
                            }
                            if(((ije)hfb1).x()) {
                                ((ity)ibvd0.a).a = true;
                            }
                            ((ije)hfb1).dJ(((ivj)ibvd0.a));
                        }
                        else if((hfb1.s & 8) != 0 && (hfb1 instanceof iep)) {
                            hfb hfb2 = ((iep)hfb1).D;
                            int v = 0;
                            while(hfb2 != null) {
                                if((hfb2.s & 8) != 0) {
                                    ++v;
                                    if(v == 1) {
                                        hfb1 = hfb2;
                                    }
                                    else {
                                        if(gwq0 == null) {
                                            gwq0 = new gwq(new hfb[16]);
                                        }
                                        if(hfb1 != null) {
                                            gwq0.n(hfb1);
                                        }
                                        gwq0.n(hfb2);
                                        hfb1 = null;
                                    }
                                }
                                hfb2 = hfb2.v;
                            }
                            if(v != 1) {
                                goto label_35;
                            }
                            continue;
                        }
                    label_35:
                        hfb1 = ien.a(gwq0);
                    }
                }
                hfb0 = hfb0.u;
            }
        }
        return ibom.a;
    }
}

