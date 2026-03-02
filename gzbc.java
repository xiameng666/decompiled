public enum gzbc implements hfub {
    UNKNOWN_PARING_STATE(0),
    FAST_PAIR_PROMPT(1),
    FAST_PAIR_IN_PROGRESS(2),
    FAST_PAIR_COMPLETED(3),
    FAST_PAIR_FAILED(4),
    RETROACTIVE_PAIRING_PROMPT(21),
    RETROACTIVE_PROVISIONING_PROMPT(23),
    PROVISIONING_PROMPT(5),
    USE_FIND_MY_DEVICE_PROMPT(6),
    ENABLE_LOCATION_PROMPT(7),
    LAST_KNOWN_LOCATION_PROMPT(8),
    FINDER_NETWORK_PROMPT(28),
    PROVISIONING_IN_PROGRESS(9),
    PROVISIONING_COMPLETED(10),
    PROVISIONING_FAILED(11),
    PROVISIONING_FAILED_NO_RETRY(24),
    DEVICE_ALREADY_PROVISIONED(12),
    ACCESSORY_TRACKED_BY_DIFFERENT_OWNER(29),
    SHARED_DEVICE_PROMPT(13),
    TAKE_OWNERSHIP_PROMPT(14),
    FACTORY_RESET_DEVICE(15),
    ACCEPTABLE_USE_PROMPT(27),
    COMPANION_APP_PROMPT(16),
    OPEN_COMPANION_APP_PROMPT(22),
    FMD_COMPANION_APP_PROMPT(17),
    PAIRING_AND_PROVISIONING_COMPLETED(18),
    PAIRING_COMPLETED_SPOT_NOT_SUPPORTED(19),
    INVALID_ANDROID_VERSION(25),
    INVALID_FIRMWARE_VERSION(30),
    SCREEN_LOCK_PROMPT(26),
    DISMISS(20);

    public final int F;

    private gzbc(int v1) {
        this.F = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.F;
    }

    public static gzbc b(int v) {
        switch(v) {
            case 0: {
                return gzbc.a;
            }
            case 1: {
                return gzbc.b;
            }
            case 2: {
                return gzbc.c;
            }
            case 3: {
                return gzbc.d;
            }
            case 4: {
                return gzbc.e;
            }
            case 5: {
                return gzbc.h;
            }
            case 6: {
                return gzbc.i;
            }
            case 7: {
                return gzbc.j;
            }
            case 8: {
                return gzbc.k;
            }
            case 9: {
                return gzbc.m;
            }
            case 10: {
                return gzbc.n;
            }
            case 11: {
                return gzbc.o;
            }
            case 12: {
                return gzbc.q;
            }
            case 13: {
                return gzbc.s;
            }
            case 14: {
                return gzbc.t;
            }
            case 15: {
                return gzbc.u;
            }
            case 16: {
                return gzbc.w;
            }
            case 17: {
                return gzbc.y;
            }
            case 18: {
                return gzbc.z;
            }
            case 19: {
                return gzbc.A;
            }
            case 20: {
                return gzbc.E;
            }
            case 21: {
                return gzbc.f;
            }
            case 22: {
                return gzbc.x;
            }
            case 23: {
                return gzbc.g;
            }
            case 24: {
                return gzbc.p;
            }
            case 25: {
                return gzbc.B;
            }
            case 26: {
                return gzbc.D;
            }
            case 27: {
                return gzbc.v;
            }
            case 28: {
                return gzbc.l;
            }
            case 29: {
                return gzbc.r;
            }
            case 30: {
                return gzbc.C;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.F);
    }
}

