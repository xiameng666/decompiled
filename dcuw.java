public final class dcuw {
    public static final void a(dcpn dcpn0) {
        ibuq.f(dcpn0, "<this>");
        dcpn0.i(dcpt.q());
    }

    public static final void b(dcpn dcpn0, cusz cusz0) {
        gzah gzah0;
        ibuq.f(dcpn0, "<this>");
        ibuq.f(cusz0, "type");
        if(!hvqz.n()) {
            return;
        }
        int v = cusz0.ordinal();
        if(v == 0) {
            gzah0 = gzah.e;
        }
        else {
            switch(v) {
                case 1: {
                    gzah0 = gzah.d;
                    break;
                }
                case 2: {
                    gzah0 = gzah.c;
                    break;
                }
                default: {
                    if(v != 3) {
                        throw new ibnq();
                    }
                    gzah0 = gzah.f;
                    break;
                }
            }
        }
        dcpn0.i(dcpt.I(gzah0, 2));
    }
}

