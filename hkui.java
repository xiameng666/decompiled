public enum hkui implements hfub {
    NAME_UNKNOWN(0),
    NAME_NXP(1),
    NAME_ITSO(2),
    NAME_CUBIC(11),
    NAME_LEGIC(4),
    NAME_GOOGLE_PIV(5),
    NAME_HID(6),
    NAME_LITTLEPAY(7),
    NAME_APTEST(8),
    NAME_ALLEGION(9),
    NAME_KASTLE(10),
    NAME_LEGIC_DEV(12),
    NAME_PLUTO_PAYGROUND(13),
    NAME_YOTRA(14),
    TRANSLINK_NL(15),
    WORLDLINE_OPENPAYMENT(16),
    NAME_GOOGLE_EXTERNAL_FAKE(17),
    NAME_HID_CERTIFICATION(18),
    NAME_ACCENTRA(19),
    NAME_PANASONIC(20),
    NAME_SAFETRUST(21),
    NAME_SPINTLY(22),
    UNRECOGNIZED(-1);

    private final int y;

    private hkui(int v1) {
        this.y = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != hkui.w) {
            return this.y;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static hkui b(int v) {
        switch(v) {
            case 0: {
                return hkui.a;
            }
            case 1: {
                return hkui.b;
            }
            case 2: {
                return hkui.c;
            }
            case 4: {
                return hkui.e;
            }
            case 5: {
                return hkui.f;
            }
            case 6: {
                return hkui.g;
            }
            case 7: {
                return hkui.h;
            }
            case 8: {
                return hkui.i;
            }
            case 9: {
                return hkui.j;
            }
            case 10: {
                return hkui.k;
            }
            case 11: {
                return hkui.d;
            }
            case 12: {
                return hkui.l;
            }
            case 13: {
                return hkui.m;
            }
            case 14: {
                return hkui.n;
            }
            case 15: {
                return hkui.o;
            }
            case 16: {
                return hkui.p;
            }
            case 17: {
                return hkui.q;
            }
            case 18: {
                return hkui.r;
            }
            case 19: {
                return hkui.s;
            }
            case 20: {
                return hkui.t;
            }
            case 21: {
                return hkui.u;
            }
            case 22: {
                return hkui.v;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.y);
    }
}

