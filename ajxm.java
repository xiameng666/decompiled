public enum ajxm implements hfub {
    WEAR_KEY_RETRIEVAL_RESPONSE_UNSPECIFIED(0),
    CHECK_YOUR_PHONE(1),
    KEY_RETRIEVED(2),
    NON_RECOVERABLE_ERROR(3),
    NON_RECOVERABLE_ERROR_AFTER_CHALLENGE(4),
    USER_CANCELLATION(5),
    UNRECOGNIZED(-1);

    private final int i;

    private ajxm(int v1) {
        this.i = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != ajxm.g) {
            return this.i;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static ajxm b(int v) {
        switch(v) {
            case 0: {
                return ajxm.a;
            }
            case 1: {
                return ajxm.b;
            }
            case 2: {
                return ajxm.c;
            }
            case 3: {
                return ajxm.d;
            }
            case 4: {
                return ajxm.e;
            }
            case 5: {
                return ajxm.f;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.i);
    }
}

