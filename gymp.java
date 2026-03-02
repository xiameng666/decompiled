public enum gymp implements hfub {
    MULTIPLE_FAST_ADVERTISEMENT_NOT_ALLOWED(0x1F),
    FAST_ADVERTISEMENT_ALREADY_ADVERTISED(0x20),
    DUPLICATE_ADVERTISING_REQUESTED(33),
    START_GATT_SERVER_FAILED(34),
    BLE_MAX_GATT_ADVERTISEMENT_SLOT_REACHED(35),
    START_LEGACY_ADVERTISING_FAILED(36),
    START_EXTENDED_ADVERTISING_FAILED(38),
    BLUETOOTH_ALREADY_ADVERTISED(40),
    MODIFY_BLUETOOTH_NAME_FAILED(41),
    PERSIST_ORIGINAL_BLUETOOTH_NAME_FAILED(42),
    START_ADVERTISING_FAILED(43),
    SHOULD_ACCEPT_CONNECTIONS_BEFORE_ADVERTISING_ON_WIFI_LAN(44),
    ACQUIRE_WIFI_AWARE_SESSION_FAILED(45),
    UNKNOWN_START_ADVERTISING_ERROR(46),
    AWARE_UPDATE_PUBLISHING_FAILED(0x2F);

    public final int p;

    private gymp(int v1) {
        this.p = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.p;
    }

    public static gymp b(int v) {
        switch(v) {
            case 0x1F: {
                return gymp.a;
            }
            case 0x20: {
                return gymp.b;
            }
            case 33: {
                return gymp.c;
            }
            case 34: {
                return gymp.d;
            }
            case 35: {
                return gymp.e;
            }
            case 36: {
                return gymp.f;
            }
            case 38: {
                return gymp.g;
            }
            case 40: {
                return gymp.h;
            }
            case 41: {
                return gymp.i;
            }
            case 42: {
                return gymp.j;
            }
            case 43: {
                return gymp.k;
            }
            case 44: {
                return gymp.l;
            }
            case 45: {
                return gymp.m;
            }
            case 46: {
                return gymp.n;
            }
            case 0x2F: {
                return gymp.o;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.p);
    }
}

