public final class fxrd {
    public static void a(String s, String s1, String s2, int v) {
        int v1 = gzwh.a(((int)hzen.b()));
        if(v1 != 0) {
            switch(v1 - 1) {
                case 1: 
                case 2: {
                    fxra.k(s, v);
                    return;
                }
                case 3: {
                    fxra.k(s1, v);
                    return;
                }
                case 4: {
                    fxra.k(s2, v);
                    return;
                }
                default: {
                    return;
                }
            }
        }
        throw null;
    }

    public static void b(Throwable throwable0) {
        fxrd.a("UlrRpcDevGetSettings", "UlrRpcBetaGetSettings", "UlrRpcProdGetSettings", 2);
        if(hzeq.f()) {
            if(!fxrc.t()) {
                return;
            }
            if(throwable0 == null) {
                fxrc.a.w(1);
                return;
            }
            fxrc.a.w(fxrc.w(throwable0));
            return;
        }
        fxrc.j(false);
    }
}

