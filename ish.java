public final class ish {
    public static final Object a(iem iem0, ibth ibth0, ibrl ibrl0) {
        if(iem0.I().B) {
            if(!iem0.I().B) {
                hxt.d("visitAncestors called on an unattached node");
            }
            hfb hfb0 = iem0.I().u;
            ify ify0 = ien.d(iem0);
        alab1:
            while(true) {
                hfb hfb1 = null;
                if(ify0 == null) {
                    break;
                }
                if((ify0.u.f.t & 0x80000) != 0) {
                    while(hfb0 != null) {
                        if((hfb0.s & 0x80000) != 0) {
                            hfb hfb2 = hfb0;
                            gwq gwq0 = null;
                            while(hfb2 != null) {
                                if((hfb2 instanceof isf)) {
                                    hfb1 = hfb2;
                                    break alab1;
                                }
                                if((hfb2.s & 0x80000) != 0 && (hfb2 instanceof iep)) {
                                    hfb hfb3 = ((iep)hfb2).D;
                                    int v = 0;
                                    while(hfb3 != null) {
                                        if((hfb3.s & 0x80000) != 0) {
                                            ++v;
                                            if(v == 1) {
                                                hfb2 = hfb3;
                                            }
                                            else {
                                                if(gwq0 == null) {
                                                    gwq0 = new gwq(new hfb[16]);
                                                }
                                                if(hfb2 != null) {
                                                    gwq0.n(hfb2);
                                                }
                                                gwq0.n(hfb3);
                                                hfb2 = null;
                                            }
                                        }
                                        hfb3 = hfb3.v;
                                    }
                                    if(v != 1) {
                                        goto label_34;
                                    }
                                    continue;
                                }
                            label_34:
                                hfb2 = ien.a(gwq0);
                            }
                        }
                        hfb0 = hfb0.u;
                    }
                }
                ify0 = ify0.n();
                if(ify0 != null) {
                    ihl ihl0 = ify0.u;
                    if(ihl0 != null) {
                        hfb0 = ihl0.e;
                        continue;
                    }
                }
                hfb0 = null;
            }
            if(((isf)hfb1) != null) {
                hzk hzk0 = ien.b(iem0);
                Object object0 = ((isf)hfb1).e(hzk0, new isg(ibth0, hzk0), ibrl0);
                if(object0 == ibrx.a) {
                    return object0;
                }
            }
        }
        return ibom.a;
    }
}

