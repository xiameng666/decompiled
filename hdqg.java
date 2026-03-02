@Deprecated
public enum hdqg implements hfub {
    DIRECTION_UNKNOWN(0),
    DIRECTION_ROW(1),
    DIRECTION_ROW_REVERSE(2),
    DIRECTION_COLUMN(3),
    DIRECTION_COLUMN_REVERSE(4);

    private final int g;

    private hdqg(int v1) {
        this.g = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.g;
    }

    public static hdqg b(int v) {
        switch(v) {
            case 0: {
                return hdqg.a;
            }
            case 1: {
                return hdqg.b;
            }
            case 2: {
                return hdqg.c;
            }
            case 3: {
                return hdqg.d;
            }
            case 4: {
                return hdqg.e;
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

