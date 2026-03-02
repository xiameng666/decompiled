public enum hlud implements hfub {
    UNKNOWN(0),
    ACCOUNTS_CHANGED(1),
    CONNECTIVITY_CHANGED(2),
    DEVICE_ADMIN_DISABLED(3),
    DEVICE_ADMIN_ENABLED(4),
    DEVICE_ADMIN_UNCHANGED_AFTER_PROMPT(5),
    GMS_UPDATED(6),
    GMS_GCM_REGISTERED(7),
    SITREP_REMOTE_INSTRUCTION(8),
    DEVICE_ADMIN_ALREADY_ENABLED(9),
    DEVICE_ADMIN_NOT_ENABLED(10),
    RETRY_AFTER_SERVER_DELAY(11),
    @Deprecated
    ASSURE_REMOTE_INSTRUCTION(12),
    LOCKSCREEN_STATE_CHANGED(13),
    PERIODIC_CHECK(14);

    public final int p;

    private hlud(int v1) {
        this.p = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.p;
    }

    public static hlud b(int v) {
        switch(v) {
            case 0: {
                return hlud.a;
            }
            case 1: {
                return hlud.b;
            }
            case 2: {
                return hlud.c;
            }
            case 3: {
                return hlud.d;
            }
            case 4: {
                return hlud.e;
            }
            case 5: {
                return hlud.f;
            }
            case 6: {
                return hlud.g;
            }
            case 7: {
                return hlud.h;
            }
            case 8: {
                return hlud.i;
            }
            case 9: {
                return hlud.j;
            }
            case 10: {
                return hlud.k;
            }
            case 11: {
                return hlud.l;
            }
            case 12: {
                return hlud.m;
            }
            case 13: {
                return hlud.n;
            }
            case 14: {
                return hlud.o;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.p);
    }
}

