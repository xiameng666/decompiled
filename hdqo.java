public enum hdqo implements hfub {
    FLEX_JUSTIFICATION_UNKNOWN(0),
    @Deprecated
    FLEX_JUSTIFICATION_AUTO(1),
    FLEX_JUSTIFICATION_START(2),
    FLEX_JUSTIFICATION_END(3),
    FLEX_JUSTIFICATION_CENTER(4),
    @Deprecated
    FLEX_JUSTIFICATION_STRETCH(5),
    FLEX_JUSTIFICATION_SPACE_AROUND(6),
    FLEX_JUSTIFICATION_SPACE_BETWEEN(7);

    public final int i;

    private hdqo(int v1) {
        this.i = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.i;
    }

    public static hdqo b(int v) {
        switch(v) {
            case 0: {
                return hdqo.a;
            }
            case 1: {
                return hdqo.b;
            }
            case 2: {
                return hdqo.c;
            }
            case 3: {
                return hdqo.d;
            }
            case 4: {
                return hdqo.e;
            }
            case 5: {
                return hdqo.f;
            }
            case 6: {
                return hdqo.g;
            }
            case 7: {
                return hdqo.h;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.i);
    }
}

