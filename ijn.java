public final class ijn {
    public static final ijm a(ijm ijm0) {
        if(!ijm0.I().B) {
            hxt.d("visitAncestors called on an unattached node");
        }
        hfb hfb0 = ijm0.I().u;
        ify ify0 = ien.d(ijm0);
        while(ify0 != null) {
            if((ify0.u.f.t & 0x40000) != 0) {
                while(hfb0 != null) {
                    if((hfb0.s & 0x40000) != 0) {
                        hfb hfb1 = hfb0;
                        gwq gwq0 = null;
                        while(hfb1 != null) {
                            if((hfb1 instanceof ijm)) {
                                if(ibuq.m(ijm0.dK(), ((ijm)hfb1).dK()) && heh.a(ijm0, ((ijm)hfb1))) {
                                    return (ijm)hfb1;
                                }
                            }
                            else if((hfb1.s & 0x40000) != 0 && (hfb1 instanceof iep)) {
                                hfb hfb2 = ((iep)hfb1).D;
                                int v = 0;
                                while(hfb2 != null) {
                                    if((hfb2.s & 0x40000) != 0) {
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
                                    goto label_32;
                                }
                                continue;
                            }
                        label_32:
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
        return null;
    }

    public static final void b(ijm ijm0, ibts ibts0) {
        if(!ijm0.I().B) {
            hxt.d("visitAncestors called on an unattached node");
        }
        hfb hfb0 = ijm0.I().u;
        ify ify0 = ien.d(ijm0);
    label_4:
        while(ify0 != null) {
            if((ify0.u.f.t & 0x40000) != 0) {
                while(hfb0 != null) {
                    if((hfb0.s & 0x40000) != 0) {
                        hfb hfb1 = hfb0;
                        gwq gwq0 = null;
                        while(hfb1 != null) {
                            if((hfb1 instanceof ijm)) {
                                if(ibuq.m(ijm0.dK(), ((ijm)hfb1).dK()) && heh.a(ijm0, ((ijm)hfb1)) && !((Boolean)ibts0.a(((ijm)hfb1))).booleanValue()) {
                                    break label_4;
                                }
                            }
                            else if((hfb1.s & 0x40000) != 0 && (hfb1 instanceof iep)) {
                                hfb hfb2 = ((iep)hfb1).D;
                                int v = 0;
                                while(hfb2 != null) {
                                    if((hfb2.s & 0x40000) != 0) {
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
                                    goto label_32;
                                }
                                continue;
                            }
                        label_32:
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
    }

    public static final void c(iem iem0, Object object0, ibts ibts0) {
        if(!iem0.I().B) {
            hxt.d("visitAncestors called on an unattached node");
        }
        hfb hfb0 = iem0.I().u;
        ify ify0 = ien.d(iem0);
    label_4:
        while(ify0 != null) {
            if((ify0.u.f.t & 0x40000) != 0) {
                while(hfb0 != null) {
                    if((hfb0.s & 0x40000) != 0) {
                        hfb hfb1 = hfb0;
                        gwq gwq0 = null;
                        while(hfb1 != null) {
                            if((hfb1 instanceof ijm)) {
                                if(ibuq.m(object0, ((ijm)hfb1).dK()) && !((Boolean)ibts0.a(((ijm)hfb1))).booleanValue()) {
                                    break label_4;
                                }
                            }
                            else if((hfb1.s & 0x40000) != 0 && (hfb1 instanceof iep)) {
                                hfb hfb2 = ((iep)hfb1).D;
                                int v = 0;
                                while(hfb2 != null) {
                                    if((hfb2.s & 0x40000) != 0) {
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
                                    goto label_32;
                                }
                                continue;
                            }
                        label_32:
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
    }

    public static final void d(ijm ijm0, ibts ibts0) {
        if(!ijm0.I().B) {
            hxt.d("visitSubtreeIf called on an unattached node");
        }
        gwq gwq0 = new gwq(new hfb[16]);
        hfb hfb0 = ijm0.I().v;
        if(hfb0 == null) {
            ien.j(gwq0, ijm0.I());
        }
        else {
            gwq0.n(hfb0);
        }
    alab1:
        int v;
        while((v = gwq0.b) != 0) {
            hfb hfb1 = (hfb)gwq0.c(v - 1);
            if((hfb1.t & 0x40000) != 0) {
                hfb hfb2 = hfb1;
                while(hfb2 != null && hfb2.B) {
                    if((hfb2.s & 0x40000) != 0) {
                        hfb hfb3 = hfb2;
                        gwq gwq1 = null;
                        while(hfb3 != null) {
                            if((hfb3 instanceof ijm)) {
                                ijl ijl0 = !ibuq.m(ijm0.dK(), ((ijm)hfb3).dK()) || !heh.a(ijm0, ((ijm)hfb3)) ? ijl.a : ((ijl)ibts0.a(((ijm)hfb3)));
                                if(ijl0 == ijl.c) {
                                    break alab1;
                                }
                                if(ijl0 == ijl.b) {
                                    continue alab1;
                                }
                            }
                            else if((hfb3.s & 0x40000) != 0 && (hfb3 instanceof iep)) {
                                hfb hfb4 = ((iep)hfb3).D;
                                int v1 = 0;
                                while(hfb4 != null) {
                                    if((hfb4.s & 0x40000) != 0) {
                                        ++v1;
                                        if(v1 == 1) {
                                            hfb3 = hfb4;
                                        }
                                        else {
                                            if(gwq1 == null) {
                                                gwq1 = new gwq(new hfb[16]);
                                            }
                                            if(hfb3 != null) {
                                                gwq1.n(hfb3);
                                            }
                                            gwq1.n(hfb4);
                                            hfb3 = null;
                                        }
                                    }
                                    hfb4 = hfb4.v;
                                }
                                if(v1 != 1) {
                                    goto label_41;
                                }
                                continue;
                            }
                        label_41:
                            hfb3 = ien.a(gwq1);
                        }
                    }
                    hfb2 = hfb2.v;
                }
            }
            ien.j(gwq0, hfb1);
        }
    }

    public static final void e(iem iem0, Object object0, ibts ibts0) {
        if(!iem0.I().B) {
            hxt.d("visitSubtreeIf called on an unattached node");
        }
        gwq gwq0 = new gwq(new hfb[16]);
        hfb hfb0 = iem0.I().v;
        if(hfb0 == null) {
            ien.j(gwq0, iem0.I());
        }
        else {
            gwq0.n(hfb0);
        }
    alab1:
        int v;
        while((v = gwq0.b) != 0) {
            hfb hfb1 = (hfb)gwq0.c(v - 1);
            if((hfb1.t & 0x40000) != 0) {
                hfb hfb2 = hfb1;
                while(hfb2 != null && hfb2.B) {
                    if((hfb2.s & 0x40000) != 0) {
                        hfb hfb3 = hfb2;
                        gwq gwq1 = null;
                        while(hfb3 != null) {
                            if((hfb3 instanceof ijm)) {
                                ijl ijl0 = ibuq.m(object0, ((ijm)hfb3).dK()) ? ((ijl)ibts0.a(((ijm)hfb3))) : ijl.a;
                                if(ijl0 == ijl.c) {
                                    break alab1;
                                }
                                if(ijl0 == ijl.b) {
                                    continue alab1;
                                }
                            }
                            else if((hfb3.s & 0x40000) != 0 && (hfb3 instanceof iep)) {
                                hfb hfb4 = ((iep)hfb3).D;
                                int v1 = 0;
                                while(hfb4 != null) {
                                    if((hfb4.s & 0x40000) != 0) {
                                        ++v1;
                                        if(v1 == 1) {
                                            hfb3 = hfb4;
                                        }
                                        else {
                                            if(gwq1 == null) {
                                                gwq1 = new gwq(new hfb[16]);
                                            }
                                            if(hfb3 != null) {
                                                gwq1.n(hfb3);
                                            }
                                            gwq1.n(hfb4);
                                            hfb3 = null;
                                        }
                                    }
                                    hfb4 = hfb4.v;
                                }
                                if(v1 != 1) {
                                    goto label_41;
                                }
                                continue;
                            }
                        label_41:
                            hfb3 = ien.a(gwq1);
                        }
                    }
                    hfb2 = hfb2.v;
                }
            }
            ien.j(gwq0, hfb1);
        }
    }
}

