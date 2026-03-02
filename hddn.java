public enum hddn implements hfub {
    RESULT_CODE_UNKNOWN(0),
    RESULT_CODE_SUCCESS(1),
    RESULT_CODE_CANCEL(2),
    RESULT_CODE_ERROR(3);

    public final int e;

    private hddn(int v1) {
        this.e = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.e;
    }

    public static hddn b(int v) {
        switch(v) {
            case 0: {
                return hddn.a;
            }
            case 1: {
                return hddn.b;
            }
            case 2: {
                return hddn.c;
            }
            case 3: {
                return hddn.d;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}

