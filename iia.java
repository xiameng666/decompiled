public final class iia {
    private static final bza a;

    static {
        iia.a = new bza(null);
    }

    public static final int a(hfa hfa0) {
        int v = (hfa0 instanceof hzr) ? 3 : 1;
        if((hfa0 instanceof hhl)) {
            v |= 4;
        }
        if((hfa0 instanceof iub)) {
            v |= 8;
        }
        if((hfa0 instanceof hws)) {
            v |= 16;
        }
        if((hfa0 instanceof idh) || (hfa0 instanceof ido)) {
            v |= 0x20;
        }
        if((hfa0 instanceof hic)) {
            v |= 0x1000;
        }
        if((hfa0 instanceof hii)) {
            v |= 0x800;
        }
        if((hfa0 instanceof drp)) {
            v |= 0x100;
        }
        if((hfa0 instanceof ibm)) {
            v |= 0x40;
        }
        if((hfa0 instanceof ibh) || (hfa0 instanceof ibi)) {
            v |= 0x80;
        }
        return (hfa0 instanceof isf) ? 0x80000 | v : v;
    }

    public static final int b(hfb hfb0) {
        int v = hfb0.s;
        if(v != 0) {
            return v;
        }
        int v1 = 1;
        bza bza0 = iia.a;
        Class class0 = hfb0.getClass();
        int v2 = bza0.a(class0);
        if(v2 >= 0) {
            return bza0.c[v2];
        }
        if((hfb0 instanceof ifk)) {
            v1 = 3;
        }
        if((hfb0 instanceof iew)) {
            v1 |= 4;
        }
        if((hfb0 instanceof ije)) {
            v1 |= 8;
        }
        if((hfb0 instanceof ijc)) {
            v1 |= 16;
        }
        if((hfb0 instanceof idm)) {
            v1 |= 0x20;
        }
        if((hfb0 instanceof iiz)) {
            v1 |= 0x40;
        }
        if((hfb0 instanceof ifi)) {
            v1 |= 0x80;
        }
        if((hfb0 instanceof iey)) {
            v1 |= 0x100;
        }
        if((hfb0 instanceof cfe)) {
            v1 |= 0x200;
        }
        if((hfb0 instanceof hji)) {
            v1 |= 0x400;
        }
        if((hfb0 instanceof hiv)) {
            v1 |= 0x800;
        }
        if((hfb0 instanceof hid)) {
            v1 |= 0x1000;
        }
        if((hfb0 instanceof hun)) {
            v1 |= 0x2000;
        }
        if((hfb0 instanceof hxq)) {
            v1 |= 0x4000;
        }
        if((hfb0 instanceof iek)) {
            v1 |= 0x8000;
        }
        if((hfb0 instanceof huq)) {
            v1 |= 0x20000;
        }
        if((hfb0 instanceof ijm)) {
            v1 |= 0x40000;
        }
        if((hfb0 instanceof isf)) {
            v1 |= 0x80000;
        }
        if((hfb0 instanceof iij)) {
            v1 |= 0x100000;
        }
        if((hfb0 instanceof huh)) {
            v1 |= 0x200000;
        }
        bza0.f(class0, v1);
        return v1;
    }

    public static final int c(hfb hfb0) {
        if((hfb0 instanceof iep)) {
            int v = ((iep)hfb0).C;
            for(hfb hfb1 = ((iep)hfb0).D; hfb1 != null; hfb1 = hfb1.v) {
                v |= iia.c(hfb1);
            }
            return v;
        }
        return iia.b(hfb0);
    }

    public static final void d(hfb hfb0) {
        if(!hfb0.B) {
            hxt.d("autoInvalidateInsertedNode called on unattached node");
        }
        iia.e(hfb0, -1, 1);
    }

    public static final void e(hfb hfb0, int v, int v1) {
        if((hfb0 instanceof iep)) {
            iia.i(hfb0, ((iep)hfb0).C & v, v1);
            int v2 = ~((iep)hfb0).C & v;
            for(hfb hfb1 = ((iep)hfb0).D; hfb1 != null; hfb1 = hfb1.v) {
                iia.e(hfb1, v2, v1);
            }
            return;
        }
        iia.i(hfb0, v & hfb0.s, v1);
    }

    public static final void f(hfb hfb0) {
        if(!hfb0.B) {
            hxt.d("autoInvalidateRemovedNode called on unattached node");
        }
        iia.e(hfb0, -1, 2);
    }

    public static final void g(hfb hfb0) {
        if(!hfb0.B) {
            hxt.d("autoInvalidateUpdatedNode called on unattached node");
        }
        iia.e(hfb0, -1, 0);
    }

    // String Decryptor: 6 succeeded, 0 failed
    public static final boolean h(int v) {
        return (v & 0x80) != 0;
    }

    private static final void i(hfb hfb0, int v, int v1) {
        gwq gwq1;
        hfb hfb2;
        if(v1 != 0 || hfb0.v()) {
            if((v & 2) != 0 && (hfb0 instanceof ifk)) {
                ifp.b(((ifk)hfb0));
                if(v1 == 2) {
                    ien.e(hfb0, 2).as();
                }
            }
            if((v & 0x80) != 0 && (hfb0 instanceof ifi) && v1 != 2) {
                ien.d(hfb0).L();
            }
            if((v & 0x100) != 0 && (hfb0 instanceof iey)) {
                switch(v1) {
                    case 1: {
                        ify ify0 = ien.d(hfb0);
                        ify0.ac(ify0.B + 1);
                        break;
                    }
                    case 2: {
                        ify ify1 = ien.d(hfb0);
                        ify1.ac(ify1.B - 1);
                    }
                }
                if(v1 != 2) {
                    ify ify2 = ien.d(hfb0);
                    if(ify2.B != 0 && !ify2.ai() && !ify2.al() && !ify2.A) {
                        igc.a(ify2).w(ify2);
                    }
                }
            }
            if((v & 4) != 0 && (hfb0 instanceof iew)) {
                iex.a(((iew)hfb0));
            }
            if((v & 8) != 0 && (hfb0 instanceof ije)) {
                ien.d(hfb0).n = true;
            }
            if((v & 0x40) != 0 && (hfb0 instanceof iiz)) {
                igd igd0 = ien.d(((iiz)hfb0)).v;
                igd0.o.q = true;
                igt igt0 = igd0.p;
                if(igt0 != null) {
                    igt0.t = true;
                }
            }
            if((v & 0x800) != 0 && (hfb0 instanceof hiv)) {
                ieb.b = null;
                ((hiv)hfb0).c(ieb.a);
                if(ieb.b == null) {
                    goto label_79;
                }
                else {
                    if(!((hiv)hfb0).I().B) {
                        hxt.d("visitChildren called on an unattached node");
                    }
                    gwq gwq0 = new gwq(new hfb[16]);
                    hfb hfb1 = ((hiv)hfb0).I().v;
                    if(hfb1 == null) {
                        ien.j(gwq0, ((hiv)hfb0).I());
                    }
                    else {
                        gwq0.n(hfb1);
                    }
                alab1:
                    while(true) {
                    alab2:
                        while(true) {
                            int v2 = gwq0.b;
                            if(v2 == 0) {
                                goto label_79;
                            }
                            hfb2 = (hfb)gwq0.c(v2 - 1);
                            if((hfb2.t & 0x400) == 0) {
                                ien.j(gwq0, hfb2);
                            }
                            else {
                                while(true) {
                                    if(hfb2 == null) {
                                        continue alab1;
                                    }
                                    if((hfb2.s & 0x400) == 0) {
                                        hfb2 = hfb2.v;
                                        continue;
                                    }
                                    gwq1 = null;
                                label_52:
                                    if(hfb2 == null) {
                                        break;
                                    }
                                    break alab2;
                                }
                            }
                        }
                        if((hfb2 instanceof hji)) {
                            hig hig0 = ((ili)ien.f(((hji)hfb2))).R.b;
                            if(hig0.c.j(((hji)hfb2))) {
                                hig0.a();
                            }
                        }
                        else if((hfb2.s & 0x400) != 0 && (hfb2 instanceof iep)) {
                            hfb hfb3 = ((iep)hfb2).D;
                            int v3 = 0;
                            while(hfb3 != null) {
                                if((hfb3.s & 0x400) != 0) {
                                    ++v3;
                                    if(v3 == 1) {
                                        hfb2 = hfb3;
                                    }
                                    else {
                                        if(gwq1 == null) {
                                            gwq1 = new gwq(new hfb[16]);
                                        }
                                        if(hfb2 != null) {
                                            gwq1.n(hfb2);
                                        }
                                        gwq1.n(hfb3);
                                        hfb2 = null;
                                    }
                                }
                                hfb3 = hfb3.v;
                            }
                            if(v3 != 1) {
                                hfb2 = ien.a(gwq1);
                            }
                            goto label_52;
                        }
                        hfb2 = ien.a(gwq1);
                        goto label_52;
                    }
                }
            }
            else {
            label_79:
                if((v & 0x1000) != 0 && (hfb0 instanceof hid)) {
                    hig hig1 = ((ili)ien.f(((hid)hfb0))).R.b;
                    if(hig1.d.j(((hid)hfb0))) {
                        hig1.a();
                    }
                }
            }
        }
    }
}

