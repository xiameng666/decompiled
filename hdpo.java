public enum hdpo implements hfub {
    DEVICE_STATE_UNKNOWN(0),
    DEVICE_STATE_LANDSCAPE(1),
    DEVICE_STATE_DARKMODE(2),
    DEVICE_STATE_PRINTMODE(3),
    DEVICE_STATE_SCREEN_SIZE_CATEGORY(4);

    public final int f;

    private hdpo(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.f;
    }

    public static hdpo b(int v) {
        switch(v) {
            case 0: {
                return hdpo.a;
            }
            case 1: {
                return hdpo.b;
            }
            case 2: {
                return hdpo.c;
            }
            case 3: {
                return hdpo.d;
            }
            case 4: {
                return hdpo.e;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}

