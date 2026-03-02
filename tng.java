public final class tng extends tdv {
    public tng(tdu tdu0) {
        super(tdu0);
    }

    @Override  // tdv
    public final syj b(tax tax0, syi syi0) {
        tca tca0;
        ((tkq)tax0).g();
        if(!tax0.i) {
            throw new syl("Conditions Not Satisfied", syn.c);
        }
        if(syi0.b() == 0 || (syi0.c() & 7) != 4) {
            throw new syl("SFI not listed in AFL or record not found", syn.g);
        }
        if(syi0.d() > 0) {
            throw new syl("Wrong Length", syn.m);
        }
        tng.d(((byte)syi0.e()));
        if(syi0.h() >= 11 && syi0.h() <= 20) {
            throw new syl("Incorrect P1P2", syn.g);
        }
        if(syi0.h() >= 21 && syi0.h() <= 30 && (syi0.h() != 21 && syi0.h() != 24)) {
            throw new syl("Incorrect P1P2", syn.g);
        }
        if(syi0.h() <= 0 || syi0.h() > 30) {
            throw new syl("Incorrect P1P2", syn.g);
        }
        tam tam0 = ((tko)tax0.c).b();
        int v = syi0.h();
        int v1 = 0;
        if(!tam0.g(((byte)v), syi0.b())) {
            while(v1 < 0x100) {
                if(tam0.g(((byte)v), ((byte)v1))) {
                    throw new syl(syn.j);
                }
                ++v1;
                continue;
            }
            throw new syl(syn.e);
        }
        tam tam1 = tax0.c.b();
        try {
            tca0 = tam1.d(new tcj(syi0.h(), syi0.b()));
        }
        catch(IllegalArgumentException unused_ex) {
            return new syj(new byte[0], syn.e);
        }
        if(tca0.b.a == 1) {
            szi szi0 = new szi(tkp.a);
            if(tca0.g(szi0) && (tca0 instanceof tcm)) {
                byte[] arr_b = ((tcm)tca0).e();
                tcm tcm0 = new tcm(((tcm)tca0).c, arr_b);
                byte[] arr_b1 = tcm0.h(szi0);
                if(arr_b1 != null && arr_b1.length != 0) {
                    tla tla0 = tax0.g.f;
                    if(tla0 != null) {
                        arr_b1[9] = tng.c(arr_b1[9], tla0.f()[0]);
                        szg szg0 = tcm0.e.b(szi0);
                        if(szg0 == null) {
                            throw new IllegalArgumentException("tag not present " + szi0.toString());
                        }
                        szg0.b(arr_b1);
                        return new syj(new tak(tcm0.e(), false, tbx.c).g().d(), syn.i);
                    }
                }
            }
            return new syj(new tak(tca0.e(), false, tbx.c).g().d(), syn.i);
        }
        return new syj(new byte[0], syn.e);
    }

    public static byte c(byte b, byte b1) {
        return (byte)(b & 0x70 | ((byte)(b1 & 0x8F)));
    }

    public static final void d(byte b) {
        if(b == 0) {
            return;
        }
        throw new syl("Correct Length 00", syn.d);
    }
}

