public enum gymr implements hfub {
    DUPLICATE_DISCOVERING_REQUESTED(0x1F),
    START_LEGACY_DISCOVERING_FAILED(0x20),
    START_EXTENDED_DISCOVERING_FAILED(33),
    START_DISCOVERING_FAILED(34),
    INVALID_TARGET_INFO(35),
    FETCH_ADVERTISEMENT_FAILED(36),
    GATT_FETCH_ADVERTISEMENT_FAILED(37),
    L2CAP_FETCH_ADVERTISEMENT_FAILED(38),
    NOT_AVAILABLE_TO_FETCH_ADVERTISEMENT(39),
    ACQUIRE_WIFI_AWARE_SESSION_FOR_DISCOVERING_FAILED(40),
    UNKNOWN_START_DISCOVERING_ERROR(41);

    public final int l;

    private gymr(int v1) {
        this.l = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.l;
    }

    public static gymr b(int v) {
        switch(v) {
            case 0x1F: {
                return gymr.a;
            }
            case 0x20: {
                return gymr.b;
            }
            case 33: {
                return gymr.c;
            }
            case 34: {
                return gymr.d;
            }
            case 35: {
                return gymr.e;
            }
            case 36: {
                return gymr.f;
            }
            case 37: {
                return gymr.g;
            }
            case 38: {
                return gymr.h;
            }
            case 39: {
                return gymr.i;
            }
            case 40: {
                return gymr.j;
            }
            case 41: {
                return gymr.k;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.l);
    }
}

