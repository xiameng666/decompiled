public enum abyk implements hfub {
    UNSPECIFIED_FIX(0),
    DO_NOTHING(1),
    TEST_ONLY_FIX(2),
    FILE_DELETION(3),
    EXEC_SQL_FIX(4),
    SEND_BROADCAST(5),
    WEBVIEW_SAFEMODE_FIX(6),
    LOCAL_APP_ERROR(7),
    PROCESS_RESTART(8),
    SHARED_PREFERENCES_DELETION(9),
    PHONESKY_FIX(10),
    COMPONENT_ENABLED_SETTING_FIX(11),
    EMERGENCY_PLAY_STORE_INSTALL(12),
    START_SERVICE(13),
    UNRECOGNIZED(-1);

    private final int q;

    private abyk(int v1) {
        this.q = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != abyk.o) {
            return this.q;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static abyk b(int v) {
        switch(v) {
            case 0: {
                return abyk.a;
            }
            case 1: {
                return abyk.b;
            }
            case 2: {
                return abyk.c;
            }
            case 3: {
                return abyk.d;
            }
            case 4: {
                return abyk.e;
            }
            case 5: {
                return abyk.f;
            }
            case 6: {
                return abyk.g;
            }
            case 7: {
                return abyk.h;
            }
            case 8: {
                return abyk.i;
            }
            case 9: {
                return abyk.j;
            }
            case 10: {
                return abyk.k;
            }
            case 11: {
                return abyk.l;
            }
            case 12: {
                return abyk.m;
            }
            case 13: {
                return abyk.n;
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

