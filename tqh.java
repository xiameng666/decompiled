public final class tqh extends twe {
    @Override  // twe
    public final sxn b(ttv ttv0, sxm sxm0) {
        byte[] arr_b = sxm0.g();
        if(sxm0.a() != 4) {
            throw new sxp("incorrect P1 - record not found", sxr.h);
        }
        if(sxm0.b() != 0 && sxm0.b() != 2) {
            throw new sxp("incorrect P1/P2", sxr.h);
        }
        if(!sxm0.e()) {
            throw new sxp("Le absent", sxr.k);
        }
        if(sxm0.d() != 0x100) {
            throw new sxp("Le required and is non-zero", sxr.k);
        }
        if(sxm0.c() != sxm0.g().length) {
            throw new sxp("Wrong length in data", sxr.k);
        }
        if(ttv0.f && (sxm0.c() < 5 || sxm0.c() > 16)) {
            throw new sxp("Wrong length in application length", sxr.k);
        }
        tto tto0 = ttv0.d;
        tuw tuw0 = this.c(tto0);
        if(twe.e(twe.f(ttv0).r(), arr_b)) {
            if(ttv0.f) {
                ttv0.g = true;
                ttv0.h = false;
                ttm ttm0 = tto0.b();
                ttm0.b = twz.b(arr_b);
                tuw0.m();
                syd syd0 = new syd(new syf(sxq.a));
                syd0.g(twe.f(ttv0).s());
                syd0.g(syb.c(tuw0.n()).b(new syf(sxq.b)));
                return new sxq(syd0.c(), sxr.g);
            }
            return new sxq(sxr.c);
        }
        if(tqh.d(arr_b)) {
            ttv0.f();
            return new sxq(tqh.g(ttv0, tuw0), sxr.g);
        }
        return !tqh.d(arr_b) || !ttv0.f ? new sxq(sxr.d) : new sxq(sxr.c);
    }

    @Override  // twe
    public final tuw c(tto tto0) {
        return (tpf)tto0.b().f(tpf.a);
    }
}

