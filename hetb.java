public enum hetb implements hfub {
    UNKNOWN_CONTEXT_FENCE_TYPE(0),
    AND(1),
    OR(2),
    NOT(3),
    TIME_FENCE(4),
    LOCATION_FENCE(5),
    PLACE_FENCE(6),
    ACTIVITY_FENCE(7),
    SCREEN_FENCE(8),
    POWER_CONNECTION_FENCE(9),
    PHONE_LOCK_FENCE(10),
    AUDIO_STATE_FENCE(11),
    BEACON_FENCE(12),
    NETWORK_STATE_FENCE(13),
    WANDER_STATE_FENCE(14),
    TIME_INTERVAL_FENCE(15),
    INSTALLED_APPS_FENCE(16),
    PHONE_CALL_FENCE(17),
    PROXIMITY_DISTANCE_FENCE(18),
    SUN_STATE_FENCE(19),
    LOCAL_TIME_FENCE(20),
    WEATHER_FENCE(21),
    PREDICTIVE(22),
    SHUSH_STATE_FENCE(23),
    WIFI_STATE_FENCE(24);

    public final int z;

    private hetb(int v1) {
        this.z = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.z;
    }

    public static hetb b(int v) {
        switch(v) {
            case 0: {
                return hetb.a;
            }
            case 1: {
                return hetb.b;
            }
            case 2: {
                return hetb.c;
            }
            case 3: {
                return hetb.d;
            }
            case 4: {
                return hetb.e;
            }
            case 5: {
                return hetb.f;
            }
            case 6: {
                return hetb.g;
            }
            case 7: {
                return hetb.h;
            }
            case 8: {
                return hetb.i;
            }
            case 9: {
                return hetb.j;
            }
            case 10: {
                return hetb.k;
            }
            case 11: {
                return hetb.l;
            }
            case 12: {
                return hetb.m;
            }
            case 13: {
                return hetb.n;
            }
            case 14: {
                return hetb.o;
            }
            case 15: {
                return hetb.p;
            }
            case 16: {
                return hetb.q;
            }
            case 17: {
                return hetb.r;
            }
            case 18: {
                return hetb.s;
            }
            case 19: {
                return hetb.t;
            }
            case 20: {
                return hetb.u;
            }
            case 21: {
                return hetb.v;
            }
            case 22: {
                return hetb.w;
            }
            case 23: {
                return hetb.x;
            }
            case 24: {
                return hetb.y;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.z);
    }
}

