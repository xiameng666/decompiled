public enum eqoe implements hfub {
    UNKNOWN_DEVICE_TYPE(0),
    @Deprecated
    ANDROID_DEPRECATED(1),
    ANDROIDTV(2),
    WEAVE(3),
    WEAR(4),
    PHONE(5),
    TABLET(6),
    AUTO(7),
    CHROME(8),
    DESKTOP(9);

    public final int k;

    private eqoe(int v1) {
        this.k = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.k;
    }

    public static eqoe b(int v) {
        switch(v) {
            case 0: {
                return eqoe.a;
            }
            case 1: {
                return eqoe.b;
            }
            case 2: {
                return eqoe.c;
            }
            case 3: {
                return eqoe.d;
            }
            case 4: {
                return eqoe.e;
            }
            case 5: {
                return eqoe.f;
            }
            case 6: {
                return eqoe.g;
            }
            case 7: {
                return eqoe.h;
            }
            case 8: {
                return eqoe.i;
            }
            case 9: {
                return eqoe.j;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.k);
    }
}

