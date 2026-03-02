public enum crta implements hfub {
    CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN(0),
    CLIENT_UPLOAD_ELIGIBLE(1),
    MEASUREMENT_SERVICE_NOT_ENABLED(2),
    ANDROID_TOO_OLD(3),
    NON_PLAY_MODE(4),
    SDK_TOO_OLD(5),
    MISSING_JOB_SCHEDULER(6),
    NOT_ENABLED_IN_MANIFEST(7),
    CLIENT_FLAG_OFF(8),
    SERVICE_FLAG_OFF(20),
    PINNED_TO_SERVICE_UPLOAD(21),
    MISSING_SGTM_SERVER_URL(22);

    public final int m;

    private crta(int v1) {
        this.m = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.m;
    }

    public static crta b(int v) {
        switch(v) {
            case 0: {
                return crta.a;
            }
            case 1: {
                return crta.b;
            }
            case 2: {
                return crta.c;
            }
            case 3: {
                return crta.d;
            }
            case 4: {
                return crta.e;
            }
            case 5: {
                return crta.f;
            }
            case 6: {
                return crta.g;
            }
            case 7: {
                return crta.h;
            }
            case 8: {
                return crta.i;
            }
            case 20: {
                return crta.j;
            }
            case 21: {
                return crta.k;
            }
            case 22: {
                return crta.l;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.m);
    }
}

