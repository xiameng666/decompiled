public enum cyjp implements hfub {
    TYPE_UNSPECIFIED(0),
    TYPE_NON_SASS(1),
    TYPE_SINGLE_POINT(2),
    TYPE_MULTI_POINT(3),
    TYPE_MULTI_POINT_CONFIGURABLE_ENABLED(4),
    TYPE_MULTI_POINT_CONFIGURABLE_DISABLED(5);

    public final int g;

    private cyjp(int v1) {
        this.g = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.g;
    }

    public static cyjp b(int v) {
        switch(v) {
            case 0: {
                return cyjp.a;
            }
            case 1: {
                return cyjp.b;
            }
            case 2: {
                return cyjp.c;
            }
            case 3: {
                return cyjp.d;
            }
            case 4: {
                return cyjp.e;
            }
            case 5: {
                return cyjp.f;
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

