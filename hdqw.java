public enum hdqw implements hfub {
    GRID_ALIGNMENT_UNKNOWN(0),
    GRID_ALIGNMENT_AUTO(1),
    GRID_ALIGNMENT_START(2),
    GRID_ALIGNMENT_END(3),
    GRID_ALIGNMENT_CENTER(4),
    GRID_ALIGNMENT_STRETCH(5);

    private final int h;

    private hdqw(int v1) {
        this.h = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.h;
    }

    public static hdqw b(int v) {
        switch(v) {
            case 0: {
                return hdqw.a;
            }
            case 1: {
                return hdqw.b;
            }
            case 2: {
                return hdqw.c;
            }
            case 3: {
                return hdqw.d;
            }
            case 4: {
                return hdqw.e;
            }
            case 5: {
                return hdqw.f;
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

