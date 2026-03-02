public enum gyyq implements hfub {
    UNKNOWN_ERROR_CODE(0),
    OTHER_ERROR(1),
    TIMEOUT(2),
    INTERRUPTED(3),
    REFLECTIVE_OPERATION_EXCEPTION(4),
    EXECUTION_EXCEPTION(5),
    PARSE_EXCEPTION(6),
    MDH_REMOTE_EXCEPTION(7),
    SUCCESS_RETRY_GATT_ERROR(8),
    SUCCESS_RETRY_GATT_TIMEOUT(9),
    SUCCESS_RETRY_SECRET_HANDSHAKE_ERROR(10),
    SUCCESS_RETRY_SECRET_HANDSHAKE_TIMEOUT(11),
    SUCCESS_SECRET_HANDSHAKE_RECONNECT(12),
    SUCCESS_ADDRESS_ROTATE(13),
    SUCCESS_SIGNAL_LOST(14),
    DEVICE_NOT_IN_PAIRED_HISTORY_EXCEPTION(15),
    DEVICE_NOT_BONDED_DURING_RETROACTIVE_PAIR(16);

    public final int r;

    private gyyq(int v1) {
        this.r = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.r;
    }

    public static gyyq b(int v) {
        switch(v) {
            case 0: {
                return gyyq.a;
            }
            case 1: {
                return gyyq.b;
            }
            case 2: {
                return gyyq.c;
            }
            case 3: {
                return gyyq.d;
            }
            case 4: {
                return gyyq.e;
            }
            case 5: {
                return gyyq.f;
            }
            case 6: {
                return gyyq.g;
            }
            case 7: {
                return gyyq.h;
            }
            case 8: {
                return gyyq.i;
            }
            case 9: {
                return gyyq.j;
            }
            case 10: {
                return gyyq.k;
            }
            case 11: {
                return gyyq.l;
            }
            case 12: {
                return gyyq.m;
            }
            case 13: {
                return gyyq.n;
            }
            case 14: {
                return gyyq.o;
            }
            case 15: {
                return gyyq.p;
            }
            case 16: {
                return gyyq.q;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.r);
    }
}

