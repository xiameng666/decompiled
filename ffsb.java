public enum ffsb implements hfub {
    DEVICE_TYPE_UNKNOWN(0),
    DEVICE_TYPE_PHONE(1),
    DEVICE_TYPE_PHONE_GO(2),
    DEVICE_TYPE_TV(3),
    DEVICE_TYPE_WEARABLE(4),
    DEVICE_TYPE_AUTOMOTIVE(5),
    DEVICE_TYPE_BATTLESTAR(6),
    DEVICE_TYPE_CHROME_OS(7),
    DEVICE_TYPE_XR(8),
    DEVICE_TYPE_DESKTOP(9);

    public final int k;

    private ffsb(int v1) {
        this.k = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.k;
    }

    public static ffsb b(int v) {
        switch(v) {
            case 0: {
                return ffsb.a;
            }
            case 1: {
                return ffsb.b;
            }
            case 2: {
                return ffsb.c;
            }
            case 3: {
                return ffsb.d;
            }
            case 4: {
                return ffsb.e;
            }
            case 5: {
                return ffsb.f;
            }
            case 6: {
                return ffsb.g;
            }
            case 7: {
                return ffsb.h;
            }
            case 8: {
                return ffsb.i;
            }
            case 9: {
                return ffsb.j;
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

