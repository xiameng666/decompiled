public enum hofh implements hfub {
    SOURCE_UNSPECIFIED(0),
    ANDROID_DEVICE_SETTINGS(1),
    GAIA_USERNAME_RECOVERY(2),
    AOB_SETUP_WIZARD(3),
    MINUTEMAID_JS_BRIDGE(4),
    GAIA_WEB_JS_BRIDGE(5),
    AM_PROFILES(6),
    UNRECOGNIZED(-1);

    private final int j;

    private hofh(int v1) {
        this.j = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != hofh.h) {
            return this.j;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static hofh b(int v) {
        switch(v) {
            case 0: {
                return hofh.a;
            }
            case 1: {
                return hofh.b;
            }
            case 2: {
                return hofh.c;
            }
            case 3: {
                return hofh.d;
            }
            case 4: {
                return hofh.e;
            }
            case 5: {
                return hofh.f;
            }
            case 6: {
                return hofh.g;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.j);
    }
}

