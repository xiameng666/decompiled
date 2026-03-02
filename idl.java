public final class idl {
    public static Object a(idm idm0, idg idg0) {
        if(!idm0.I().B) {
            hxt.c("ModifierLocal accessed from an unattached node");
        }
        if(!idm0.I().B) {
            hxt.d("visitAncestors called on an unattached node");
        }
        hfb hfb0 = idm0.I().u;
        ify ify0 = ien.d(idm0);
        while(ify0 != null) {
            if((ify0.u.f.t & 0x20) != 0) {
                while(hfb0 != null) {
                    if((hfb0.s & 0x20) != 0) {
                        hfb hfb1 = hfb0;
                        gwq gwq0 = null;
                        while(hfb1 != null) {
                            if((hfb1 instanceof idm)) {
                                if(((idm)hfb1).l().c(idg0)) {
                                    return ((idm)hfb1).l().a(idg0);
                                }
                            }
                            else if((hfb1.s & 0x20) != 0 && (hfb1 instanceof iep)) {
                                hfb hfb2 = ((iep)hfb1).D;
                                int v = 0;
                                while(hfb2 != null) {
                                    if((hfb2.s & 0x20) != 0) {
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
                                    goto label_34;
                                }
                                continue;
                            }
                        label_34:
                            hfb1 = ien.a(gwq0);
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
        return idg0.a.a();
    }
}

