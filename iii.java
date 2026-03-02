public final class iii {
    public final gwq a;
    public ify[] b;

    public iii() {
        this.a = new gwq(new ify[16]);
    }

    public final void a(ify ify0) {
        if(ify0.B > 0) {
            if(ify0.aC() == 5 && !ify0.ai() && !ify0.al() && !ify0.C && ify0.an()) {
                ihl ihl0 = ify0.u;
                if((ihl0.a() & 0x100) != 0) {
                    hfb hfb0 = ihl0.f;
                    while(hfb0 != null) {
                        if((hfb0.s & 0x100) != 0) {
                            hfb hfb1 = hfb0;
                            gwq gwq0 = null;
                            while(hfb1 != null) {
                                if((hfb1 instanceof iey)) {
                                    ((iey)hfb1).dN(ien.e(((iey)hfb1), 0x100));
                                }
                                else if((hfb1.s & 0x100) != 0 && (hfb1 instanceof iep)) {
                                    hfb hfb2 = ((iep)hfb1).D;
                                    int v1 = 0;
                                    while(hfb2 != null) {
                                        if((hfb2.s & 0x100) != 0) {
                                            ++v1;
                                            if(v1 == 1) {
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
                                    if(v1 != 1) {
                                        goto label_32;
                                    }
                                    continue;
                                }
                            label_32:
                                hfb1 = ien.a(gwq0);
                            }
                        }
                        if((hfb0.t & 0x100) == 0) {
                            break;
                        }
                        hfb0 = hfb0.v;
                    }
                }
            }
            ify0.A = false;
            gwq gwq1 = ify0.k();
            Object[] arr_object = gwq1.a;
            int v2 = gwq1.b;
            for(int v = 0; v < v2; ++v) {
                this.a(((ify)arr_object[v]));
            }
        }
    }

    public final void b(ify ify0) {
        if(ify0.B > 0) {
            this.a.n(ify0);
            ify0.A = true;
        }
    }

    public final boolean c() {
        return this.a.b != 0;
    }
}

