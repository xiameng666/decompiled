public enum hdqj implements hfub {
    FLEX_ALIGNMENT_UNKNOWN(0),
    @Deprecated
    FLEX_ALIGNMENT_AUTO(1),
    FLEX_ALIGNMENT_START(2),
    FLEX_ALIGNMENT_END(3),
    FLEX_ALIGNMENT_CENTER(4),
    FLEX_ALIGNMENT_STRETCH(5);

    public final int g;

    private hdqj(int v1) {
        this.g = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.g;
    }

    public static hdqj b(int v) {
        switch(v) {
            case 0: {
                return hdqj.a;
            }
            case 1: {
                return hdqj.b;
            }
            case 2: {
                return hdqj.c;
            }
            case 3: {
                return hdqj.d;
            }
            case 4: {
                return hdqj.e;
            }
            case 5: {
                return hdqj.f;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.g);
    }
}

