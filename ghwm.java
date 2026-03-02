public enum ghwm implements hfub {
    UNKNOWN_ERROR(0),
    FEATURE_DISABLED(1),
    PACKAGE_NOT_ALLOWED(2),
    TELEPHONY_FEATURE_UNAVAILABLE(3),
    INVALID_PHONE_NUMBER_RANGE(4),
    RATE_LIMIT_REACHED(5),
    CONCURRENT_REQUESTS(6),
    IN_ECBM(7),
    IN_EMERGENCY_CALL(8),
    NETWORK_NOT_AVAILABLE(9),
    TIMED_OUT(10),
    TOO_MANY_CALLS(11),
    NULL_INTENT_RECEIVED(12),
    MISSING_CALLING_PACKAGE(13),
    THREAD_INTERRUPTED_DURING_VERIFICATION(14),
    PHONE_NUMBER_RANGE_ABSENT(15);

    public final int q;

    private ghwm(int v1) {
        this.q = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.q;
    }

    public static ghwm b(int v) {
        switch(v) {
            case 0: {
                return ghwm.a;
            }
            case 1: {
                return ghwm.b;
            }
            case 2: {
                return ghwm.c;
            }
            case 3: {
                return ghwm.d;
            }
            case 4: {
                return ghwm.e;
            }
            case 5: {
                return ghwm.f;
            }
            case 6: {
                return ghwm.g;
            }
            case 7: {
                return ghwm.h;
            }
            case 8: {
                return ghwm.i;
            }
            case 9: {
                return ghwm.j;
            }
            case 10: {
                return ghwm.k;
            }
            case 11: {
                return ghwm.l;
            }
            case 12: {
                return ghwm.m;
            }
            case 13: {
                return ghwm.n;
            }
            case 14: {
                return ghwm.o;
            }
            case 15: {
                return ghwm.p;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.q);
    }
}

