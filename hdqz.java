public enum hdqz implements hfub {
    GRID_JUSTIFICATION_UNKNOWN(0),
    GRID_JUSTIFICATION_AUTO(1),
    GRID_JUSTIFICATION_START(2),
    GRID_JUSTIFICATION_END(3),
    GRID_JUSTIFICATION_CENTER(4),
    GRID_JUSTIFICATION_STRETCH(5);

    private final int h;

    private hdqz(int v1) {
        this.h = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.h;
    }

    public static hdqz b(int v) {
        switch(v) {
            case 0: {
                return hdqz.a;
            }
            case 1: {
                return hdqz.b;
            }
            case 2: {
                return hdqz.c;
            }
            case 3: {
                return hdqz.d;
            }
            case 4: {
                return hdqz.e;
            }
            case 5: {
                return hdqz.f;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.h);
    }
}

