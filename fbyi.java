public enum fbyi implements hfub {
    CALLBACK_TYPE_UNKNOWN(0),
    CALLBACK_TYPE_PAYMENT_AUTHORIZATION(1),
    CALLBACK_TYPE_PAYMENT_DATA_CHANGE(2),
    UNRECOGNIZED(-1);

    private final int f;

    private fbyi(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != fbyi.d) {
            return this.f;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static fbyi b(int v) {
        switch(v) {
            case 0: {
                return fbyi.a;
            }
            case 1: {
                return fbyi.b;
            }
            case 2: {
                return fbyi.c;
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

