public final class tqe extends twf {
    @Override  // twf
    public final sxm a(sxm sxm0) {
        return new sxm(sxm0.f());
    }

    @Override  // twf
    public final sxn b(ttv ttv0, sxm sxm0) {
        byte[] arr_b;
        try {
            if(!ttv0.g) {
                throw new sxp("Invalid state - SELECT must be performed", sxr.c);
            }
            if(!sxm0.e()) {
                throw new sxp("Le absent", sxr.k);
            }
            if(sxm0.d() != 0x100) {
                throw new sxp("Le required and is non-zero", sxr.k);
            }
        }
        catch(sxp sxp0) {
            return new sxn(new byte[0], sxp0.a);
        }
        sxm0.h();
        tto tto0 = ttv0.d;
        ttm ttm0 = tto0.b();
        ttt ttt0 = ttv0.l;
        syf syf0 = new syf(new byte[]{sxm0.a(), sxm0.b()});
        try {
            if(syf0.equals(new syf(ttx.a))) {
                arr_b = ttt0.t().s().c();
            }
            else {
                arr_b = syf0.equals(new syf(tob.b)) ? ((tnp)ttv0).b().s().c() : ttu.c(ttt0.b, syf0);
            }
            if(arr_b == null) {
                arr_b = ((tor)ttm0.f(tor.a)).q(syf0);
            }
            if(arr_b == null) {
                arr_b = ((tow)ttm0.f(tow.a)).q(syf0);
            }
            if(arr_b == null) {
                arr_b = ttu.c(syb.c(tto0.e), syf0);
                return arr_b == null ? new sxn(new byte[0], sxr.f) : new sxn(arr_b, sxr.g);
            }
        }
        catch(sxu unused_ex) {
            return new sxn(new byte[0], sxr.f);
        }
        return arr_b == null ? new sxn(new byte[0], sxr.f) : new sxn(arr_b, sxr.g);
    }
}

