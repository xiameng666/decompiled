public enum asch implements hfub {
    PACKET_TYPE_UNSPECIFIED(0),
    HANDSHAKE(1),
    SMART_DEVICE(2),
    REQUEST_AUTHORIZATION(3),
    AUTHORIZATION_GRANTED(4),
    REQUEST_SUPPORTED_TYPES(6),
    REQUEST_SUMMARY(7),
    REQUEST_FLAVOR_ITEM_LIST(8),
    REQUEST_ITEM(9),
    TRANSFER_COMPLETED(10),
    REQUEST_HEALTH(11),
    HEALTH_REPORT(12),
    ERROR(13),
    PRE_L_DEVICE(14),
    POST_SMARTSETUP_AUTH_INIT(15),
    POST_SMARTSETUP_AUTH_FINISH(16),
    NEARBY_AUTHENTICATION(17),
    NEARBY_AUTHENTICATION_SUCCESS(18),
    REQUEST_RESTORE_CHOICE(19),
    REQUEST_RESTORE_ITEM_META(20),
    REQUEST_THROUGHPUT_TEST(21),
    DUPLEXING_DEVICE_AUTHENTICATION(22),
    REQUEST_MULTIPLE_ITEMS(23),
    CONTINUOUS_STREAMING(24);

    public final int y;

    private asch(int v1) {
        this.y = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.y;
    }

    public static asch b(int v) {
        switch(v) {
            case 0: {
                return asch.a;
            }
            case 1: {
                return asch.b;
            }
            case 2: {
                return asch.c;
            }
            case 3: {
                return asch.d;
            }
            case 4: {
                return asch.e;
            }
            case 6: {
                return asch.f;
            }
            case 7: {
                return asch.g;
            }
            case 8: {
                return asch.h;
            }
            case 9: {
                return asch.i;
            }
            case 10: {
                return asch.j;
            }
            case 11: {
                return asch.k;
            }
            case 12: {
                return asch.l;
            }
            case 13: {
                return asch.m;
            }
            case 14: {
                return asch.n;
            }
            case 15: {
                return asch.o;
            }
            case 16: {
                return asch.p;
            }
            case 17: {
                return asch.q;
            }
            case 18: {
                return asch.r;
            }
            case 19: {
                return asch.s;
            }
            case 20: {
                return asch.t;
            }
            case 21: {
                return asch.u;
            }
            case 22: {
                return asch.v;
            }
            case 23: {
                return asch.w;
            }
            case 24: {
                return asch.x;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.y);
    }
}

