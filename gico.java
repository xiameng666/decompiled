public enum gico implements hfub {
    UNKNOWN_FRAGMENT_TYPE(0),
    DEVICE_BACKUP(1),
    TOGGLE_BACKUP_SETTINGS(2),
    APPS_BACKUP(3),
    DRIVE_BACKUP_SETTINGS(4),
    BACKUP_SETTINGS(5),
    BACKUP_AND_RESET(6),
    DEVICE_BACKUP_DETAIL(7),
    GENERAL_OPT_IN(9),
    PHOTOS_OPT_IN(10),
    ADD_ACCOUNT(11),
    WEAR_OPT_IN(12),
    COMPANION_OPT_IN(13),
    WEAR_BACKUP_SETTINGS(14),
    COMPANION_BACKUP_SETTINGS(15),
    COMPANION_TERMS_OF_SERVICE(16);

    public final int q;

    private gico(int v1) {
        this.q = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.q;
    }

    public static gico b(int v) {
        switch(v) {
            case 0: {
                return gico.a;
            }
            case 1: {
                return gico.b;
            }
            case 2: {
                return gico.c;
            }
            case 3: {
                return gico.d;
            }
            case 4: {
                return gico.e;
            }
            case 5: {
                return gico.f;
            }
            case 6: {
                return gico.g;
            }
            case 7: {
                return gico.h;
            }
            case 9: {
                return gico.i;
            }
            case 10: {
                return gico.j;
            }
            case 11: {
                return gico.k;
            }
            case 12: {
                return gico.l;
            }
            case 13: {
                return gico.m;
            }
            case 14: {
                return gico.n;
            }
            case 15: {
                return gico.o;
            }
            case 16: {
                return gico.p;
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

