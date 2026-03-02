public enum gylz implements hfub {
    UNKNOWN_ERROR(0),
    INVALID_PARAMETER(1),
    MEDIUM_NOT_AVAILABLE(2),
    UNEXPECTED_MEDIUM_STATE(3),
    OUT_OF_RESOURCE(4),
    FLOW_CANCELED(5),
    UNEXPECTED_CALL(6);

    public final int h;

    private gylz(int v1) {
        this.h = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.h;
    }

    public static gylz b(int v) {
        switch(v) {
            case 0: {
                return gylz.a;
            }
            case 1: {
                return gylz.b;
            }
            case 2: {
                return gylz.c;
            }
            case 3: {
                return gylz.d;
            }
            case 4: {
                return gylz.e;
            }
            case 5: {
                return gylz.f;
            }
            case 6: {
                return gylz.g;
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

