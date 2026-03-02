public final class dxdi {
    public static final gfsi a;
    public static final gfsi b;
    private static final bboh c;

    static {
        dxdi.a = dxdg.a;
        dxdi.b = dxdh.a;
        dxdi.c = bboh.b(new ibuk(dxdi.class).c(), bbcu.cZ);
    }

    public static final hfit a(Integer integer0) {
        switch(((int)integer0)) {
            case 1: {
                return hfit.b;
            }
            case 2: {
                return hfit.c;
            }
            case 4: {
                return hfit.d;
            }
            case 8: {
                return hfit.e;
            }
            case 16: {
                return hfit.f;
            }
            case 0x20: {
                return hfit.g;
            }
            case 0x40: {
                return hfit.h;
            }
            case 0x80: {
                return hfit.i;
            }
            case 0x100: {
                return hfit.j;
            }
            case 0x200: {
                return hfit.k;
            }
            case 0x400: {
                return hfit.l;
            }
            case 0x800: {
                return hfit.m;
            }
            case 0x1000: {
                return hfit.n;
            }
            default: {
                return hfit.a;
            }
        }
    }

    public static final hfiv b(Integer integer0) {
        switch(((int)integer0)) {
            case 1: {
                return hfiv.b;
            }
            case 2: {
                return hfiv.c;
            }
            case 3: {
                return hfiv.d;
            }
            case 4: {
                return hfiv.e;
            }
            case 5: {
                return hfiv.f;
            }
            case 6: {
                return hfiv.g;
            }
            case 7: {
                return hfiv.h;
            }
            case 8: {
                return hfiv.i;
            }
            case 9: {
                return hfiv.j;
            }
            case 10: {
                return hfiv.k;
            }
            case 11: {
                return hfiv.l;
            }
            case 12: {
                return hfiv.m;
            }
            default: {
                return hfiv.a;
            }
        }
    }

    public static final ByteString c(byte[] arr_b, String s, String s1) {
        ((ggtj)dxdi.c.h()).X("Barcode raw value from bytes: %s, rawValue: %s, and displayValue: %s", String.valueOf(arr_b), (s == null ? "" : s), (s1 == null ? "" : s1));
        if(arr_b == null) {
            arr_b = new byte[0];
        }
        ByteString hfsf0 = ByteString.copyFrom(arr_b);
        if(s == null || s.length() == 0) {
            s = s1 == null || s1.length() == 0 ? "" : s1;
        }
        ByteString hfsf1 = ByteString.A(s);
        return hfsf1.isEmpty() ? hfsf0 : hfsf1;
    }
}

