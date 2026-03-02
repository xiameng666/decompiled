public final class tqg extends twk {
    public tqg() {
        new sxm(null);
    }

    @Override  // twk
    public final sxn b(ttv ttv0, sxm sxm0) {
        ttv0.i = true;
        if(!ttv0.g) {
            throw new sxp("Invalid state - SELECT must be performed", sxr.c);
        }
        if(sxm0.a() == 0) {
            throw new sxp("incorrect P1", sxr.h);
        }
        if((sxm0.b() & 7 ^ 4) != 0) {
            throw new sxp("incorrect P2, bits 3-1 != 100", sxr.f);
        }
        if(!sxm0.e()) {
            throw new sxp("Le absent", sxr.k);
        }
        if(sxm0.d() == 0x100) {
            ttm ttm0 = ttv0.d.b();
            try {
                tuw tuw0 = ttm0.f(new tvi(((byte)((sxm0.b() & 0xFF) >> 3)), sxm0.a()));
                return tuw0.b.a == 1 ? new sxn(tuw0.n(), sxr.g) : new sxn(new byte[0], sxr.d);
            }
            catch(IllegalArgumentException unused_ex) {
                return new sxn(new byte[0], sxr.h);
            }
        }
        throw new sxp("Le required and is non-zero", sxr.k);
    }
}

