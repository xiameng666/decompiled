public enum gjpi implements hfub {
    DEFAULT(0),
    COLOR_SHAPES(1),
    COLOR_SHAPES_AND_PIN(2),
    HEX_PIN(3),
    GOOGLE_HEX(4),
    OUT_OF_BAND(5),
    DIGITS(6);

    public final int h;

    private gjpi(int v1) {
        this.h = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.h;
    }

    public static gjpi b(int v) {
        switch(v) {
            case 0: {
                return gjpi.a;
            }
            case 1: {
                return gjpi.b;
            }
            case 2: {
                return gjpi.c;
            }
            case 3: {
                return gjpi.d;
            }
            case 4: {
                return gjpi.e;
            }
            case 5: {
                return gjpi.f;
            }
            case 6: {
                return gjpi.g;
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

