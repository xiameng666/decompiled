public enum grju implements hfub {
    SOURCE_UNKNOWN(0),
    SOURCE_SYSTEM_SETTINGS(1),
    SOURCE_QUICK_SETTINGS(2),
    SOURCE_LOCATION_ACCURACY(3),
    SOURCE_LOCATION_SETTINGS_DIALOG(4),
    SOURCE_LOCATION_OFF_WARNING_DIALOG(5),
    SOURCE_SETUP_WIZARD(6),
    SOURCE_ADD_ACCOUNT(7),
    SOURCE_EMERGENCY_LOCATION_SERVICE(8),
    SOURCE_FAMILY_LINK(9),
    SOURCE_TEST(10),
    SOURCE_DEMO_USER(11);

    public final int m;

    private grju(int v1) {
        this.m = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.m;
    }

    public static grju b(int v) {
        switch(v) {
            case 0: {
                return grju.a;
            }
            case 1: {
                return grju.b;
            }
            case 2: {
                return grju.c;
            }
            case 3: {
                return grju.d;
            }
            case 4: {
                return grju.e;
            }
            case 5: {
                return grju.f;
            }
            case 6: {
                return grju.g;
            }
            case 7: {
                return grju.h;
            }
            case 8: {
                return grju.i;
            }
            case 9: {
                return grju.j;
            }
            case 10: {
                return grju.k;
            }
            case 11: {
                return grju.l;
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

