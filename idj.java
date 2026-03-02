import java.util.Set;

public final class idj {
    public final gwq a;
    public final gwq b;
    public final gwq c;
    public final gwq d;
    public boolean e;
    private final iio f;

    public idj(iio iio0) {
        this.f = iio0;
        this.a = new gwq(new idx[16]);
        this.b = new gwq(new idg[16]);
        this.c = new gwq(new ify[16]);
        this.d = new gwq(new idg[16]);
    }

    public final void a() {
        if(!this.e) {
            this.e = true;
            idi idi0 = new idi(this);
            this.f.v(idi0);
        }
    }

    public static final void b(hfb hfb0, idg idg0, Set set0) {
        if(!hfb0.I().B) {
            hxt.d("visitSubtreeIf called on an unattached node");
        }
        gwq gwq0 = new gwq(new hfb[16]);
        hfb hfb1 = hfb0.I().v;
        if(hfb1 == null) {
            ien.j(gwq0, hfb0.I());
        }
        else {
            gwq0.n(hfb1);
        }
    alab1:
        int v;
        while((v = gwq0.b) != 0) {
            hfb hfb2 = (hfb)gwq0.c(v - 1);
            if((hfb2.t & 0x20) != 0) {
                hfb hfb3 = hfb2;
                while(hfb3 != null && hfb3.B) {
                    if((hfb3.s & 0x20) != 0) {
                        hfb hfb4 = hfb3;
                        gwq gwq1 = null;
                        while(hfb4 != null) {
                            if((hfb4 instanceof idm)) {
                                if((((idm)hfb4) instanceof idx) && (((idx)(((idm)hfb4))).a instanceof idh) && ((idx)(((idm)hfb4))).c.contains(idg0)) {
                                    set0.add(((idm)hfb4));
                                }
                                if(((idm)hfb4).l().c(idg0)) {
                                    continue alab1;
                                }
                            }
                            else if((hfb4.s & 0x20) != 0 && (hfb4 instanceof iep)) {
                                hfb hfb5 = ((iep)hfb4).D;
                                int v1 = 0;
                                while(hfb5 != null) {
                                    if((hfb5.s & 0x20) != 0) {
                                        ++v1;
                                        if(v1 == 1) {
                                            hfb4 = hfb5;
                                        }
                                        else {
                                            if(gwq1 == null) {
                                                gwq1 = new gwq(new hfb[16]);
                                            }
                                            if(hfb4 != null) {
                                                gwq1.n(hfb4);
                                            }
                                            gwq1.n(hfb5);
                                            hfb4 = null;
                                        }
                                    }
                                    hfb5 = hfb5.v;
                                }
                                if(v1 != 1) {
                                    goto label_41;
                                }
                                continue;
                            }
                        label_41:
                            hfb4 = ien.a(gwq1);
                        }
                    }
                    hfb3 = hfb3.v;
                }
            }
            ien.j(gwq0, hfb2);
        }
    }
}

