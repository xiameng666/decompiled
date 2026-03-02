public enum hoea implements hfub {
    UNKNOWN(0),
    PHONE_VERIFICATION_DEFAULT(1),
    PHONE_VERIFICATION_MESSAGES_CALLS_V1(2),
    PHONE_VERIFICATION_INTL_SMS_CALLS(3),
    PHONE_VERIFICATION_REACHABILITY_INTL_SMS_CALLS(4),
    UNRECOGNIZED(-1);

    private final int h;

    private hoea(int v1) {
        this.h = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != hoea.f) {
            return this.h;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static hoea b(int v) {
        switch(v) {
            case 0: {
                return hoea.a;
            }
            case 1: {
                return hoea.b;
            }
            case 2: {
                return hoea.c;
            }
            case 3: {
                return hoea.d;
            }
            case 4: {
                return hoea.e;
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

