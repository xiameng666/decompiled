public enum buyi implements hfub {
    SETTINGS_CATEGORY_UNKNOWN(0),
    SETTINGS_CATEGORY_INTERNAL(1),
    SETTINGS_CATEGORY_DEVICE_POLICY(2),
    SETTINGS_CATEGORY_CONNECTED_DEVICES_AND_SHARING(3),
    SETTINGS_CATEGORY_BACKUP_AND_RESTORE(4),
    SETTINGS_CATEGORY_PRIVACY_AND_SECURITY(5),
    SETTINGS_CATEGORY_KIDS_AND_FAMILY(6),
    SETTINGS_CATEGORY_PERSONAL_AND_DEVICE_SAFETY(7),
    SETTINGS_CATEGORY_DATA_PLANS(8),
    SETTINGS_CATEGORY_DRIVING(9),
    SETTINGS_CATEGORY_GOOGLE_APPS(10),
    SETTINGS_CATEGORY_AUTOFILL_AND_PASSWORDS(11),
    SETTINGS_CATEGORY_DEVELOPER(12),
    SETTINGS_CATEGORY_OTHER(13),
    UNRECOGNIZED(-1);

    private final int q;

    private buyi(int v1) {
        this.q = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != buyi.o) {
            return this.q;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static buyi b(int v) {
        switch(v) {
            case 0: {
                return buyi.a;
            }
            case 1: {
                return buyi.b;
            }
            case 2: {
                return buyi.c;
            }
            case 3: {
                return buyi.d;
            }
            case 4: {
                return buyi.e;
            }
            case 5: {
                return buyi.f;
            }
            case 6: {
                return buyi.g;
            }
            case 7: {
                return buyi.h;
            }
            case 8: {
                return buyi.i;
            }
            case 9: {
                return buyi.j;
            }
            case 10: {
                return buyi.k;
            }
            case 11: {
                return buyi.l;
            }
            case 12: {
                return buyi.m;
            }
            case 13: {
                return buyi.n;
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

