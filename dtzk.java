public final class dtzk {
    private static final bboh a;

    static {
        dtzk.a = bboh.b("Pay", bbcu.cZ);
    }

    public static gfsz a(hkaq hkaq0) {
        int v = hkap.a(hkaq0.c).ordinal();
        String s = "";
        if(v != 0) {
            switch(v) {
                case 1: {
                    return hkaq0.c == 3 ? new gfsz(hkap.b, ((hkav)hkaq0.d).b) : new gfsz(hkap.b, hkav.a.b);
                }
                case 2: {
                    hkap hkap0 = hkap.c;
                    if(hkaq0.c == 4) {
                        s = (String)hkaq0.d;
                    }
                    return new gfsz(hkap0, s);
                }
                default: {
                    ((ggtj)dtzk.a.j()).B("Unsupported url type: %s", hkap.a(hkaq0.c).name());
                    return null;
                }
            }
        }
        hkap hkap1 = hkap.a;
        if(hkaq0.c == 2) {
            s = (String)hkaq0.d;
        }
        return new gfsz(hkap1, s);
    }

    public static guez b(hkao hkao0, int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gufc.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gufc)hftp0.b_message).d = 4;
        ((gufc)hftp0.b_message).e = v;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gufc)hftp0.b_message).f = 0xFF;
        gufc gufc0 = (gufc)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)guez.a).v_newBuilder();
        guey guey0 = dtzk.c((hkao0.c == null ? hkaq.a : hkao0.c), gufc0);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        guey0.getClass();
        ((guez)hftv0).c = guey0;
        ((guez)hftv0).b |= 1;
        String s = hkao0.e;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        guez guez0 = (guez)hftp1.b_message;
        s.getClass();
        guez0.e = s;
        if((hkao0.b & 2) != 0) {
            guey guey1 = dtzk.c((hkao0.d == null ? hkaq.a : hkao0.d), gufc0);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            guez guez1 = (guez)hftp1.b_message;
            guey1.getClass();
            guez1.d = guey1;
            guez1.b |= 2;
        }
        return (guez)hftp1.N_build();
    }

    private static guey c(hkaq hkaq0, gufc gufc0) {
        int v = hkaq0.e > 0 ? hkaq0.e : 0xFF;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gufg.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gufg)hftp0.b_message).e = v;
        gfsz gfsz0 = dtzk.a(hkaq0);
        gufg gufg0 = null;
        if(gfsz0 != null) {
            switch(((hkap)gfsz0.a).ordinal()) {
                case 0: {
                    String s = (String)gfsz0.b;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gufg gufg1 = (gufg)hftp0.b_message;
                    s.getClass();
                    gufg1.c = 2;
                    gufg1.d = s;
                    gufg0 = (gufg)hftp0.N_build();
                    break;
                }
                case 1: {
                    String s1 = (String)gfsz0.b;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gufg gufg2 = (gufg)hftp0.b_message;
                    s1.getClass();
                    gufg2.c = 7;
                    gufg2.d = s1;
                    gufg0 = (gufg)hftp0.N_build();
                    break;
                }
                case 2: {
                    String s2 = (String)gfsz0.b;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gufg gufg3 = (gufg)hftp0.b_message;
                    s2.getClass();
                    gufg3.c = 3;
                    gufg3.d = s2;
                    gufg0 = (gufg)hftp0.N_build();
                    break;
                }
                case 3: {
                    break;
                }
                default: {
                    gufg0 = (gufg)hftp0.N_build();
                }
            }
        }
        guex guex0 = (guex)((ProtoLiteMessage)guey.a).v_newBuilder();
        guex0.a(gufc0);
        if(gufg0 != null) {
            guex0.k(gufg0);
        }
        return (guey)((ProtoLiteBuilder)guex0).N_build();
    }
}

