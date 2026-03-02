public enum hdqm implements hfub {
    FLEX_DIRECTION_UNKNOWN(0),
    FLEX_DIRECTION_ROW(1),
    FLEX_DIRECTION_ROW_REVERSE(2),
    FLEX_DIRECTION_COLUMN(3),
    FLEX_DIRECTION_COLUMN_REVERSE(4);

    public final int f;

    private hdqm(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.f;
    }

    public static hdqm b(int v) {
        switch(v) {
            case 0: {
                return hdqm.a;
            }
            case 1: {
                return hdqm.b;
            }
            case 2: {
                return hdqm.c;
            }
            case 3: {
                return hdqm.d;
            }
            case 4: {
                return hdqm.e;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}

