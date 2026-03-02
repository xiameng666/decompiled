public enum gyan implements hfub {
    UNKNOWN_MEDIUM(0),
    @Deprecated
    MDNS(1),
    BLUETOOTH(2),
    WIFI_HOTSPOT(3),
    BLE(4),
    WIFI_LAN(5),
    WIFI_AWARE(6),
    NFC(7),
    WIFI_DIRECT(8),
    WEB_RTC(9),
    USB(11),
    WEB_RTC_NON_CELLULAR(12),
    AWDL(13);

    public final int n;

    private gyan(int v1) {
        this.n = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.n;
    }

    public static gyan b(int v) {
        switch(v) {
            case 0: {
                return gyan.a;
            }
            case 1: {
                return gyan.b;
            }
            case 2: {
                return gyan.c;
            }
            case 3: {
                return gyan.d;
            }
            case 4: {
                return gyan.e;
            }
            case 5: {
                return gyan.f;
            }
            case 6: {
                return gyan.g;
            }
            case 7: {
                return gyan.h;
            }
            case 8: {
                return gyan.i;
            }
            case 9: {
                return gyan.j;
            }
            case 11: {
                return gyan.k;
            }
            case 12: {
                return gyan.l;
            }
            case 13: {
                return gyan.m;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.n);
    }
}

