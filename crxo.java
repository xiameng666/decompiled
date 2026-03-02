public final class crxo implements crxp {
    static {
        bboh.b("MobileDataPlan", bbcu.ck);
    }

    @Override  // crxp
    public final boolean a(haut haut0) {
        if(hvjw.a.e().l()) {
            gsoj gsoj0 = gsoj.b(haut0.e) == null ? gsoj.q : gsoj.b(haut0.e);
            if(gsoj.m == gsoj0) {
                int v = haut0.b;
                haus haus0 = haus.a(v);
                if(haus.d == haus0) {
                    switch((v == 5 ? ((hauv)haut0.c) : hauv.a).b) {
                        case 0: {
                            return false;
                        }
                        case 1: {
                            return true;
                        }
                        default: {
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override  // crxp
    public final boolean b() {
        boolean z;
        crvx crvx0 = crvw.c().d;
        synchronized(crvx0.b) {
            Long.valueOf(1L).getClass();
            z = crvx0.a.h();
        }
        crxn.c().O((z ? hhct.bz : hhct.bA), 19, "Local_Cache", "MDP_Notification");
        return z;
    }
}

