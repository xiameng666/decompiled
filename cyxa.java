public enum cyxa implements hfub {
    FEATURE_UNKNOWN(0),
    FEATURE_PROACTIVE_DELIVER_SWITCH_CANDIDATE(1),
    FEATURE_ENABLE_SASS_FOR_TRIANGLE_CALLING_CASE(2);

    public final int d;

    private cyxa(int v1) {
        this.d = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.d;
    }

    public static cyxa b(int v) {
        switch(v) {
            case 0: {
                return cyxa.a;
            }
            case 1: {
                return cyxa.b;
            }
            case 2: {
                return cyxa.c;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.d);
    }
}

