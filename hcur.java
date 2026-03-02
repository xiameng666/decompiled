public enum hcur implements hfub {
    FLASHLIGHT_STATE_UNKNOWN(0),
    FLASHLIGHT_STATE_OFF(1),
    FLASHLIGHT_STATE_AUTO(2),
    FLASHLIGHT_STATE_ON(3);

    public final int e;

    private hcur(int v1) {
        this.e = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.e;
    }

    public static hcur b(int v) {
        switch(v) {
            case 0: {
                return hcur.a;
            }
            case 1: {
                return hcur.b;
            }
            case 2: {
                return hcur.c;
            }
            case 3: {
                return hcur.d;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}

