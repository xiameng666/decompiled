import java.io.PrintWriter;

public class czvg {
    private final cump a;
    private boolean b;
    private cumo c;
    public int n;
    public volatile boolean o;

    public czvg(int v) {
        this(v, null);
    }

    public czvg(int v, cump cump0) {
        this.b = false;
        this.o = false;
        this.n = v;
        this.a = cump0;
    }

    protected czvf a() {
        return czvf.b;
    }

    private static String c(int v) {
        switch(v) {
            case 1: {
                return "BT_RADIO_OFF";
            }
            case 2: {
                return "BT_RADIO_TOGGLE";
            }
            case 11: {
                return "WIFI_RADIO_OFF";
            }
            case 12: {
                return "WIFI_RADIO_TOGGLE";
            }
            case 13: {
                return "WIFI_AUTO_SELECTION_OFF";
            }
            case 21: {
                return "BT_CLASSIC_ADVERTISING";
            }
            case 22: {
                return "BT_CLASSIC_SCANNING";
            }
            case 23: {
                return "BT_CLASSIC_CONNECTING";
            }
            case 24: {
                return "BT_CLASSIC_CONNECTED";
            }
            case 0x1F: {
                return "BLE_ADVERTISING";
            }
            case 0x20: {
                return "BLE_SERVER_SOCKET_OPENED";
            }
            case 33: {
                return "BLE_L2CAP_SERVER_SOCKET_OPENED";
            }
            case 34: {
                return "BLE_ADVERTISEMENT_GATT_SERVER_STARTED";
            }
            case 35: {
                return "BLE_SCANNING";
            }
            case 36: {
                return "BLE_FETCH_ADVERTISEMENT";
            }
            case 37: {
                return "BLE_CONNECTING";
            }
            case 38: {
                return "BLE_CONNECTED";
            }
            case 41: {
                return "WIFI_LAN_ADVERTISING";
            }
            case 42: {
                return "WIFI_LAN_SCANNING";
            }
            case 43: {
                return "WIFI_LAN_CONNECTING";
            }
            case 44: {
                return "WIFI_LAN_CONNECTED";
            }
            case 51: {
                return "WIFI_AWARE_ADVERTISING";
            }
            case 52: {
                return "WIFI_AWARE_SCANNING";
            }
            case 53: {
                return "WIFI_AWARE_CONNECTING";
            }
            case 54: {
                return "WIFI_AWARE_CONNECTED";
            }
            case 61: {
                return "WIFI_HOTSPOT_HOSTING_WIFI_DIRECT";
            }
            case 62: {
                return "WIFI_HOTSPOT_HOSTING_LOCAL_ONLY";
            }
            case 0x3F: {
                return "WIFI_HOTSPOT_HOSTING_SOFT_AP";
            }
            case 0x40: {
                return "WIFI_HOTSPOT_AP_CONNECTED";
            }
            case 65: {
                return "WIFI_HOTSPOT_SOCKET_CONNECTED";
            }
            case 66: {
                return "WIFI_HOTSPOT_AP_MULTIPLE_STA_CONNECTED";
            }
            case 71: {
                return "WIFI_DIRECT_HOSTED";
            }
            case 72: {
                return "WIFI_DIRECT_CONNECTING";
            }
            case 73: {
                return "WIFI_DIRECT_CONNECTED";
            }
            case 74: {
                return "WIFI_DIRECT_DELAY_CLOSE_CHANNEL";
            }
            case 81: {
                return "WEB_RTC_LISTEN_FOR_CONNECTIONS";
            }
            case 82: {
                return "WEB_RTC_CONNECTING";
            }
            case 83: {
                return "WEB_RTC_CONNECTED";
            }
            case 91: {
                return "USB_ADVERTISING";
            }
            case 92: {
                return "USB_SCANNING";
            }
            default: {
                return "UNKNOWN";
            }
        }
    }

    protected void g() {
    }

    protected final czvf i(int v) {
        this.n = v;
        return czvf.e;
    }

    final czvf j() {
        synchronized(this) {
            if(!this.l()) {
                cump cump0 = this.a;
                if(cump0 != null && cump0.d()) {
                    czkq.a.b().h("Medium %s is cancelled", this.k());
                    return czvf.c;
                }
                if(cump0 != null) {
                    czve czve0 = new czve(this, Thread.currentThread());
                    this.c = czve0;
                    cump0.b(czve0);
                }
                czvf czvf0 = this.a();
                if(cump0 != null) {
                    cump0.c(this.c);
                    if(this.o) {
                        Thread.interrupted();
                        this.o = false;
                    }
                }
                if(czvf0 == czvf.b || czvf0 == czvf.e) {
                    this.b = true;
                }
                return czvf0;
            }
        }
        return czvf.b;
    }

    public final String k() {
        return czvg.c(this.n);
    }

    protected final boolean l() {
        synchronized(this) {
        }
        return this.b;
    }

    final void m(int v) {
        synchronized(this) {
            if(!this.l()) {
                return;
            }
            this.n(v);
            this.b = false;
        }
    }

    protected void n(int v) {
        this.g();
    }

    public void p(PrintWriter printWriter0) {
        printWriter0.write(String.format("  Medium Operation: %s\n", this.k()));
        cump cump0 = this.a;
        if(cump0 != null) {
            printWriter0.write(String.format("  Cancelled: %s\n", Boolean.valueOf(cump0.d())));
        }
        printWriter0.flush();
    }

    @Override
    public final String toString() {
        String s = czvg.c(this.n);
        Boolean boolean0 = Boolean.valueOf(this.b);
        return this.a == null ? String.format("MediumOperation{type=%s, isStarted=%s, isCancelled=%s}", s, boolean0, Boolean.valueOf(false)) : String.format("MediumOperation{type=%s, isStarted=%s, isCancelled=%s}", s, boolean0, Boolean.valueOf(this.a.d()));
    }
}

