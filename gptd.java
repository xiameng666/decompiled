public enum gptd implements hfub {
    DEVICE_TYPE_UNKNOWN(0),
    DEVICE_TYPE_PHONE(1),
    DEVICE_TYPE_PHONE_GO(2),
    DEVICE_TYPE_TV(3),
    DEVICE_TYPE_WEARABLE(4),
    DEVICE_TYPE_AUTOMOTIVE(5),
    DEVICE_TYPE_BATTLESTAR(6),
    DEVICE_TYPE_CHROME_OS(7),
    DEVICE_TYPE_XR(8),
    DEVICE_TYPE_DESKTOP(9),
    UNRECOGNIZED(-1);

    private final int m;

    private gptd(int v1) {
        this.m = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != gptd.k) {
            return this.m;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static gptd b(int v) {
        switch(v) {
            case 0: {
                return gptd.a;
            }
            case 1: {
                return gptd.b;
            }
            case 2: {
                return gptd.c;
            }
            case 3: {
                return gptd.d;
            }
            case 4: {
                return gptd.e;
            }
            case 5: {
                return gptd.f;
            }
            case 6: {
                return gptd.g;
            }
            case 7: {
                return gptd.h;
            }
            case 8: {
                return gptd.i;
            }
            case 9: {
                return gptd.j;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.m);
    }
}

