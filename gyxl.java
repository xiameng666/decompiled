public enum gyxl implements hfub {
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
    BLE_L2CAP(10),
    USB(11),
    WEB_RTC_NON_CELLULAR(12),
    AWDL(13);

    public final int o;

    private gyxl(int v1) {
        this.o = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.o;
    }

    public static gyxl b(int v) {
        switch(v) {
            case 0: {
                return gyxl.a;
            }
            case 1: {
                return gyxl.b;
            }
            case 2: {
                return gyxl.c;
            }
            case 3: {
                return gyxl.d;
            }
            case 4: {
                return gyxl.e;
            }
            case 5: {
                return gyxl.f;
            }
            case 6: {
                return gyxl.g;
            }
            case 7: {
                return gyxl.h;
            }
            case 8: {
                return gyxl.i;
            }
            case 9: {
                return gyxl.j;
            }
            case 10: {
                return gyxl.k;
            }
            case 11: {
                return gyxl.l;
            }
            case 12: {
                return gyxl.m;
            }
            case 13: {
                return gyxl.n;
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public final String toString() {
        return Integer.toString(this.o);
    }
}

