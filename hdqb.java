@Deprecated
public enum hdqb implements hfub {
    ALIGNMENT_UNKNOWN(0),
    ALIGNMENT_AUTO(1),
    ALIGNMENT_START(2),
    ALIGNMENT_END(3),
    ALIGNMENT_CENTER(4),
    ALIGNMENT_BASELINE_FIRST(5),
    ALIGNMENT_BASELINE_LAST(6),
    ALIGNMENT_STRETCH(7);

    public final int i;

    private hdqb(int v1) {
        this.i = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.i;
    }

    public static hdqb b(int v) {
        switch(v) {
            case 0: {
                return hdqb.a;
            }
            case 1: {
                return hdqb.b;
            }
            case 2: {
                return hdqb.c;
            }
            case 3: {
                return hdqb.d;
            }
            case 4: {
                return hdqb.e;
            }
            case 5: {
                return hdqb.f;
            }
            case 6: {
                return hdqb.g;
            }
            case 7: {
                return hdqb.h;
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

