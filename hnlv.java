public final class hnlv {
    public static hnkx a(hnlx hnlx0, hnlk hnlk0, hnkt hnkt0) {
        if(!hnlx0.d(hnkt0)) {
            hnnf.b(new Object[]{"GCT.REQ.2.12.", "Command INS is not a known command. Command is ignored."});
            hnlk0.h.b = 7;
            return new hnkx(hnmz.a, null);
        }
        if(!hnlx0.c(hnkt0)) {
            hnnf.b(new Object[]{"Command CLA does not match the INS, back to IDLE state"});
            if(hnkt0.c == -92) {
                hnlk0.b(hnls.a);
            }
            hnlk0.h.b = 7;
            return new hnkx(hnmz.a, null);
        }
        try {
            return hnlx0.a(hnlk0, hnkt0).a(hnkt0);
        }
        catch(hnlw hnlw0) {
            hnnf.b(new Object[]{"GCT.REQ.4.12.", "Reject with 6985 a supported command not authorized in its current PURE Contactless Status", hnlw0.getMessage()});
            hnlk0.b(hnls.a);
            hnlk0.h.b = 7;
            return new hnkx(hnmz.b, null);
        }
    }

    public static boolean b(hnkt hnkt0) {
        int v = hnkt0.b;
        switch(hnkt0.c) {
            case -88: 
            case -82: {
                return v == 0xFFFFFF80;
            }
            case -92: 
            case -78: {
                return v == 0;
            }
            default: {
                return false;
            }
        }
    }

    public static boolean c(hnkt hnkt0) {
        return hnkt0.c == -92 || hnkt0.c == -88 || hnkt0.c == -82 || hnkt0.c == -78;
    }
}

