public final class iuh {
    public static final iug a(ify ify0, boolean z) {
        ihl ihl0 = ify0.u;
        Object object0 = null;
        if((ihl0.a() & 8) != 0) {
            hfb hfb0 = ihl0.f;
        alab1:
            while(hfb0 != null) {
                if((hfb0.s & 8) != 0) {
                    hfb hfb1 = hfb0;
                    gwq gwq0 = null;
                    while(hfb1 != null) {
                        if((hfb1 instanceof ije)) {
                            object0 = hfb1;
                            break alab1;
                        }
                        if((hfb1.s & 8) != 0 && (hfb1 instanceof iep)) {
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
                                goto label_30;
                            }
                            continue;
                        }
                    label_30:
                        hfb1 = ien.a(gwq0);
                    }
                }
                if((hfb0.t & 8) == 0) {
                    break;
                }
                hfb0 = hfb0.v;
            }
        }
        ibuq.c(object0);
        return new iug(((ije)object0).I(), z, ify0, (ify0.u() == null ? new ity() : ify0.u()));
    }
}

