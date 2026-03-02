public enum hknl implements hfub {
    TRANSACTION_DISPLAY_STATUS_UNKNOWN(0),
    CANCELLED(1),
    COMPLETED(2),
    DECLINED(3),
    PENDING(4),
    REFUNDED(5),
    CREDIT(6),
    FAILED(7),
    UNRECOGNIZED(-1);

    private final int k;

    private hknl(int v1) {
        this.k = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != hknl.i) {
            return this.k;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static hknl b(int v) {
        switch(v) {
            case 0: {
                return hknl.a;
            }
            case 1: {
                return hknl.b;
            }
            case 2: {
                return hknl.c;
            }
            case 3: {
                return hknl.d;
            }
            case 4: {
                return hknl.e;
            }
            case 5: {
                return hknl.f;
            }
            case 6: {
                return hknl.g;
            }
            case 7: {
                return hknl.h;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.k);
    }
}

