public enum gymb implements hfub {
    UNEXPECT_TARGET_LOST(0x1F),
    ESTABLISH_GATT_CONNECTION_FAILED(0x20),
    ESTABLISH_L2CAP_CONNECTION_FAILED(33),
    INVALID_MAC_ADDRESS(34),
    SLEEP_BEFORE_CONNECT_GATT_INTERRUPTED(35),
    SLEEP_AFTER_GATT_CONNECTED_INTERRUPTED(36),
    REQUEST_GATT_CONNECTION_PRIORITY_FAILED(37),
    L2CAP_SWITCH_TO_DATA_TRANSFERRING_FAILED(38),
    GATT_SWITCH_TO_DATA_TRANSFERRING_FAILED(39),
    ESTABLISH_CONNECTION_FAILED(40),
    DUPLICATE_CONNECTION_REQUESTED(41),
    CONNECTION_LOST(42),
    CONNECT_TO_NETWORK_FAILED(43),
    UNKNOWN_CONNECT_ERROR(44),
    CONNECT_SEND_AWARE_L2_MESSAGE_FAILED(45),
    CONNECT_READ_AWARE_L2_MESSAGE_FAILED(46);

    public final int q;

    private gymb(int v1) {
        this.q = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.q;
    }

    public static gymb b(int v) {
        switch(v) {
            case 0x1F: {
                return gymb.a;
            }
            case 0x20: {
                return gymb.b;
            }
            case 33: {
                return gymb.c;
            }
            case 34: {
                return gymb.d;
            }
            case 35: {
                return gymb.e;
            }
            case 36: {
                return gymb.f;
            }
            case 37: {
                return gymb.g;
            }
            case 38: {
                return gymb.h;
            }
            case 39: {
                return gymb.i;
            }
            case 40: {
                return gymb.j;
            }
            case 41: {
                return gymb.k;
            }
            case 42: {
                return gymb.l;
            }
            case 43: {
                return gymb.m;
            }
            case 44: {
                return gymb.n;
            }
            case 45: {
                return gymb.o;
            }
            case 46: {
                return gymb.p;
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

