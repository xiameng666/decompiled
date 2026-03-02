public enum fmba {
    UNKNOWN(0),
    SEND_MESSAGE(1),
    PREFILL_MESSAGE(2),
    CUSTOM_ACTION(3),
    WEB_ACTION(4),
    @Deprecated
    OVERLAY_ACTION(5),
    NO_OP_ACTION(6),
    CALL_ACTION(7),
    TOMBSTONE_ACTION(8),
    COMPOSED_OVERLAY_ACTION(9),
    URL_ACTION(10),
    DECORATION_TRANSITION_ACTION(11);

    public final int m;

    private fmba(int v1) {
        this.m = v1;
    }

    public static fmba a(int v) {
        switch(v) {
            case 1: {
                return fmba.b;
            }
            case 2: {
                return fmba.c;
            }
            case 3: {
                return fmba.d;
            }
            case 4: {
                return fmba.e;
            }
            case 5: {
                return fmba.f;
            }
            case 6: {
                return fmba.g;
            }
            case 7: {
                return fmba.h;
            }
            case 8: {
                return fmba.i;
            }
            case 9: {
                return fmba.j;
            }
            case 10: {
                return fmba.k;
            }
            case 11: {
                return fmba.l;
            }
            default: {
                return fmba.a;
            }
        }
    }

    public static fmba b(String s) {
        return (fmba)Enum.valueOf(fmba.class, s);
    }
}

