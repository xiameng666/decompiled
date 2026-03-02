public final class tnh extends tdr {
    public static final int c;
    private static final byte[] d;
    private static final byte[] e;

    static {
        tnh.d = new byte[]{66};
        tnh.e = new byte[]{-97, 12};
    }

    public tnh(tdu tdu0) {
        super(tdu0);
    }

    @Override  // tdr
    public final syj b(tax tax0, syi syi0) {
        ((tkq)tax0).g();
        if(syi0.a() != 0) {
            throw new syl("Cla Not Supported", syn.b);
        }
        if(syi0.b() != 4) {
            throw new syl("Incorrect P1P2", syn.g);
        }
        if(syi0.c() != 0 && syi0.c() != 2) {
            throw new syl("Incorrect P1P2", syn.g);
        }
        int v = syi0.d();
        if(v < 5 || v > 16) {
            throw new syl("Wrong Length", syn.m);
        }
        tnh.i(syi0.e());
        byte[] arr_b = syi0.g();
        tca tca0 = this.f(tax0.c);
        if(tdr.g(this.e(tax0).f(), arr_b)) {
            if(tax0.h) {
                tax0.e();
                tax0.j = false;
                ((tkq)tax0).m = false;
                tam tam0 = ((tko)tax0.c).b();
                tam0.b = tek.b(arr_b);
                if((((tma)tam0.d(tma.a)).b(new byte[]{-57})[0] & 16) == 16) {
                    byte[] arr_b1 = this.c(tax0, tca0).a;
                    if(arr_b1.length < 2) {
                        throw new IllegalArgumentException("response bytes do not contain enough data");
                    }
                    byte[] arr_b2 = new byte[arr_b1.length - 2];
                    System.arraycopy(arr_b1, 0, arr_b2, 0, arr_b1.length - 2);
                    return new sym(arr_b2, syn.o);
                }
                return this.c(tax0, tca0);
            }
            return new sym(syn.c);
        }
        if(tdr.g(arr_b, tdr.a)) {
            tax0.d();
            return this.d(tax0, tca0);
        }
        tek.b(syi0.g());
        return new sym(syn.e);
    }

    @Override  // tdr
    protected final tbp e(tax tax0) {
        tbh tbh0 = ((tmr)tax0.c.b().d(tmr.a)).i();
        if(tbh0.f() != null) {
            return new tbp(tbh0.f());
        }
        throw new syl("Missing aid", syn.a);
    }

    @Override  // tdr
    public final tca f(tao tao0) {
        tca tca0;
        tam tam0 = tao0.b();
        tcj tcj0 = tcy.a;
        if(tam0.f(tcj0)) {
            tca0 = tam0.d(tcj0);
        }
        else {
            tca0 = tam0.f(tmw.a) ? tam0.d(tmw.a) : null;
        }
        if(tca0 != null) {
            return tca0;
        }
        throw new syl("Missing PPSE dgi", syn.a);
    }

    @Override  // tdr
    protected final byte[] h(tax tax0, tca tca0) {
        byte[] arr_b5;
        szg szg0 = new szg(new szi(sym.b));
        szg szg1 = sze.b(tbp.c, tnh.a);
        szg szg2 = new szg(new szi(tbs.c));
        szg szg3 = new szg(new szi(tbr.c));
        szg szg4 = new szg(new szi(tbq.c));
        byte[] arr_b = this.e(tax0).f();
        szg4.g(sze.b(sym.d, arr_b));
        byte[] arr_b1 = tca0.e();
        tek.c(arr_b1, false);
        szg szg5;
        for(szg5 = sze.a(arr_b1); true; szg5 = sze.a(arr_b3)) {
            try {
                if(szg5.a.a()) {
                    break;
                }
                byte[] arr_b2 = szg5.d();
                int v = arr_b1.length - arr_b2.length;
                byte[] arr_b3 = new byte[v];
                System.arraycopy(arr_b1, arr_b2.length, arr_b3, 0, v);
            }
            catch(Exception unused_ex) {
                throw new syl("FCI Template is not correct.", syn.a);
            }
        }
        byte[] arr_b4 = tbi.c;
        szi szi0 = new szi(arr_b4);
        if(!szg5.b.booleanValue()) {
            throw new IllegalArgumentException("Instance is not a constructed TLV object.");
        }
        szc szc0 = new szc(szg5.iterator(), szi0);
        if(szc0.hasNext()) {
            Object object0 = szc0.next();
            arr_b5 = ((szg)object0).e();
        }
        else {
            arr_b5 = null;
        }
        if(arr_b5 != null) {
            szg4.g(sze.b(arr_b4, arr_b5));
        }
        byte[] arr_b6 = tbw.c;
        byte[] arr_b7 = tnh.j(tax0, arr_b6);
        if(arr_b7 != null) {
            szg4.g(sze.b(arr_b6, arr_b7));
        }
        byte[] arr_b8 = tnh.d;
        byte[] arr_b9 = tnh.j(tax0, arr_b8);
        if(arr_b9 != null) {
            szg3.g(sze.b(arr_b8, arr_b9));
        }
        byte[] arr_b10 = tnh.e;
        byte[] arr_b11 = tnh.j(tax0, arr_b10);
        if(arr_b11 != null) {
            szg3.g(sze.b(arr_b10, arr_b11));
        }
        szg3.g(szg4);
        szg2.g(szg3);
        szg0.g(szg1);
        szg0.g(szg2);
        byte[] arr_b12 = szg0.d();
        tek.b(arr_b12);
        return arr_b12;
    }

    public static final void i(int v) {
        if(v != 0 && v != 0x100) {
            throw new syl("Correct Length 00", syn.d);
        }
    }

    private static final byte[] j(tax tax0, byte[] arr_b) {
        tam tam0 = tax0.c.b();
        tmr tmr0 = tam0.f(tmr.a) ? ((tmr)tam0.d(tmr.a)) : null;
        return tmr0 == null || !tmr0.a(arr_b) ? null : tmr0.b(arr_b);
    }
}

