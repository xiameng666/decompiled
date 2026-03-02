public enum hljd implements hfub {
    UNKNOWN_BUCKET(0),
    TIME_BUCKET(1),
    SESSION_BUCKET(2),
    ACTIVITY_TYPE_BUCKET(3),
    ACTIVITY_SEGMENT_BUCKET(4),
    TIME_INTERVAL_BUCKET(5);

    public final int g;

    private hljd(int v1) {
        this.g = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.g;
    }

    public static hljd b(int v) {
        switch(v) {
            case 0: {
                return hljd.a;
            }
            case 1: {
                return hljd.b;
            }
            case 2: {
                return hljd.c;
            }
            case 3: {
                return hljd.d;
            }
            case 4: {
                return hljd.e;
            }
            case 5: {
                return hljd.f;
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

