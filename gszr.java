public enum gszr implements hfub {
    UNSPECIFIED_TRACKABLE_COMPONENTS(0),
    ONE_TRACKABLE_COMPONENT(1),
    TWO_TRACKABLE_COMPONENTS(2),
    THREE_TRACKABLE_COMPONENTS(3),
    UNRECOGNIZED(-1);

    private final int g;

    private gszr(int v1) {
        this.g = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != gszr.e) {
            return this.g;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static gszr b(int v) {
        switch(v) {
            case 0: {
                return gszr.a;
            }
            case 1: {
                return gszr.b;
            }
            case 2: {
                return gszr.c;
            }
            case 3: {
                return gszr.d;
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

