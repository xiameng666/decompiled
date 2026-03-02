public enum gywr implements hfub {
    UNKNOWN_BANDWIDTH_UPGRADE_RESULT(0),
    UPGRADE_RESULT_SUCCESS(1),
    UPGRADE_RESULT_ERROR(2),
    MEDIUM_ERROR(3),
    PROTOCOL_ERROR(4),
    RESULT_IO_ERROR(5),
    CHANNEL_ERROR(6),
    ALREADY_ON_MEDIUM_ERROR(7),
    UNFINISHED_ERROR(10),
    BLUETOOTH_MEDIUM_ERROR(11),
    WIFI_AWARE_MEDIUM_ERROR(12),
    WIFI_LAN_MEDIUM_ERROR(13),
    WIFI_HOTSPOT_MEDIUM_ERROR(14),
    WIFI_DIRECT_MEDIUM_ERROR(15),
    WEB_RTC_MEDIUM_ERROR(16),
    RESULT_REMOTE_ERROR(17),
    ATTEMPT_SKIPPED(18),
    REMOTE_CONNECTION_ERROR(19);

    public final int s;

    private gywr(int v1) {
        this.s = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.s;
    }

    public static gywr b(int v) {
        switch(v) {
            case 0: {
                return gywr.a;
            }
            case 1: {
                return gywr.b;
            }
            case 2: {
                return gywr.c;
            }
            case 3: {
                return gywr.d;
            }
            case 4: {
                return gywr.e;
            }
            case 5: {
                return gywr.f;
            }
            case 6: {
                return gywr.g;
            }
            case 7: {
                return gywr.h;
            }
            case 10: {
                return gywr.i;
            }
            case 11: {
                return gywr.j;
            }
            case 12: {
                return gywr.k;
            }
            case 13: {
                return gywr.l;
            }
            case 14: {
                return gywr.m;
            }
            case 15: {
                return gywr.n;
            }
            case 16: {
                return gywr.o;
            }
            case 17: {
                return gywr.p;
            }
            case 18: {
                return gywr.q;
            }
            case 19: {
                return gywr.r;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.s);
    }
}

