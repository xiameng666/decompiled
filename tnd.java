public final class tnd extends tds {
    public tnd(tdu tdu0) {
        super(tdu0);
    }

    @Override  // tds
    public final syi a(syi syi0) {
        return new syi(syi0.f());
    }

    @Override  // tds
    public final syj b(tax tax0, syi syi0) {
        byte[] arr_b;
        ((tkq)tax0).g();
        if(!tax0.i) {
            throw new syl("Conditions Not Satisfied", syn.c);
        }
        if(syi0.d() > 0) {
            throw new syl("Wrong Length", syn.m);
        }
        tnd.c(((byte)syi0.e()));
        tam tam0 = ((tko)tax0.c).b();
        try {
            szi szi0 = syi0.b() == 0 ? new szi(new byte[]{syi0.c()}) : new szi(new byte[]{syi0.b(), syi0.c()});
        }
        catch(IllegalArgumentException unused_ex) {
            throw new syl("Referenced data not found", syn.n);
        }
        tma tma0 = (tma)tam0.d(tma.a);
        try {
            if(szi0.equals(new szi(tba.c))) {
                if(tax0.k == null) {
                    tax0.a();
                }
                arr_b = tax0.g.l().g().d();
            }
            else if(szi0.equals(new szi(tle.c)) && tma0.a(tle.c)) {
                arr_b = tma0.k().g().d();
            }
            else if(!szi0.equals(new szi(tlf.c)) || !tma0.a(tlf.c)) {
                byte[] arr_b1 = tky.a;
                if(szi0.equals(new szi(arr_b1)) && tma0.a(arr_b1)) {
                    arr_b = new tak(tma0.b(arr_b1), tky.c).g().d();
                }
                else if(szi0.equals(new szi(tkt.a))) {
                    byte[] arr_b3 = tma0.a(tks.c) ? tma0.b(tks.c) : new byte[20];
                    arr_b = new tak(teb.f(new byte[][]{new byte[]{1}, new byte[]{0, 17, 34, 51, 68, 85, 102}, arr_b3, new byte[]{(byte)0xA0, 0, 0, 3, (byte)0x84, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}}), tkt.c).g().d();
                }
                else if(szi0.equals(new szi(tkr.c)) && tma0.a(tkr.c)) {
                    arr_b = tma0.i().g().d();
                }
                else if(szi0.equals(new szi(tli.c)) && tma0.a(tli.c)) {
                    arr_b = tma0.m().g().d();
                }
                else if(!szi0.equals(new szi(new byte[]{-60}))) {
                    byte[] arr_b2 = tlh.d;
                    if(szi0.equals(new szi(arr_b2)) && tma0.a(arr_b2)) {
                        arr_b = new tlh(tma0.b(arr_b2)).g().d();
                    }
                    else if(szi0.equals(new szi(new byte[]{-54})) && tma0.a(tld.c)) {
                        arr_b = new byte[]{-54, 1, ((byte)tma0.j().j())};
                    }
                    else if(syi0.b() == -33 && syi0.c() == 1 || syi0.b() == -33 && syi0.c() == 2 || syi0.b() == -33 && syi0.c() == 3 || syi0.b() == -33 && syi0.c() == 4 || syi0.b() == -33 && syi0.c() == 5 || syi0.b() == -33 && syi0.c() == 6 || syi0.b() == -33 && syi0.c() == 7 || syi0.b() == -33 && syi0.c() == 8 || syi0.b() == -33 && syi0.c() == 9 || syi0.b() == -33 && syi0.c() == 10 || syi0.b() == -33 && syi0.c() == 11 || syi0.b() == -33 && syi0.c() == 12 || syi0.b() == -33 && syi0.c() == 13 || syi0.b() == -33 && syi0.c() == 14 || syi0.b() == -33 && syi0.c() == 15) {
                        int v = syi0.c();
                        tam tam1 = ((tko)tax0.c).b();
                        tcj tcj0 = new tcj(0x3F, ((byte)v));
                        tlj tlj0 = tam1.f(tcj0) ? ((tlj)tam1.d(tcj0)) : null;
                        arr_b = tlj0 == null ? null : tlj0.a(0, 60);
                    }
                    else {
                        arr_b = null;
                    }
                }
                else {
                    arr_b = null;
                }
            }
            else {
                arr_b = tma0.l().g().d();
            }
        }
        catch(syx unused_ex) {
            throw new syl("Incorrect P1P2", syn.g);
        }
        if(arr_b != null) {
            return new syj(arr_b, syn.i);
        }
        throw new syl("Referenced data not found", syn.n);
    }

    public static final void c(byte b) {
        if(b == 0) {
            return;
        }
        throw new syl("Correct Length 00", syn.d);
    }
}

