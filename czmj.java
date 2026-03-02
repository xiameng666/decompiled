public final class czmj {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final gywn g;
    public final gged_interceptors h;
    public final gged_interceptors i;
    public final boolean j;
    public final int k;
    public final boolean l;
    public final int m;

    public czmj() {
        throw null;
    }

    public czmj(String s, String s1, boolean z, boolean z1, boolean z2, int v, gywn gywn0, gged_interceptors gged0, gged_interceptors gged1, boolean z3, int v1, int v2, boolean z4) {
        this.a = s;
        this.b = s1;
        this.c = z;
        this.d = z1;
        this.e = z2;
        this.f = v;
        this.g = gywn0;
        this.h = gged0;
        this.i = gged1;
        this.j = z3;
        this.k = v1;
        this.m = v2;
        this.l = z4;
    }

    public static czmi a() {
        czmi czmi0 = new czmi();
        czmi0.g(true);
        czmi0.h(-1);
        czmi0.c = null;
        czmi0.i(gywn.a);
        czmi0.d(false);
        czmi0.c(0);
        czmi0.d = 0;
        czmi0.b(true);
        return czmi0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof czmj)) {
            String s = this.a;
            if(s != null) {
                if(s.equals(((czmj)object0).a)) {
                label_8:
                    String s1 = this.b;
                    if(s1 != null) {
                        if(s1.equals(((czmj)object0).b)) {
                        label_13:
                            if(this.c == ((czmj)object0).c && this.d == ((czmj)object0).d && this.e == ((czmj)object0).e && this.f == ((czmj)object0).f && this.g.equals(((czmj)object0).g)) {
                                gged_interceptors gged0 = this.h;
                                if(gged0 != null) {
                                    if(ggia.i(gged0, ((czmj)object0).h)) {
                                    label_19:
                                        if(ggia.i(this.i, ((czmj)object0).i) && this.j == ((czmj)object0).j && this.k == ((czmj)object0).k) {
                                            int v = this.m;
                                            if(v == 0) {
                                                return ((czmj)object0).m == 0 ? this.l == ((czmj)object0).l : false;
                                            }
                                            return v == ((czmj)object0).m ? this.l == ((czmj)object0).l : false;
                                        }
                                    }
                                }
                                else if(((czmj)object0).h == null) {
                                    goto label_19;
                                }
                            }
                        }
                    }
                    else if(((czmj)object0).b == null) {
                        goto label_13;
                    }
                }
            }
            else if(((czmj)object0).a == null) {
                goto label_8;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = 0x4D5;
        int v2 = ((((((((((((this.a == null ? 0 : this.a.hashCode()) ^ 1000003) * 1000003 ^ (this.b == null ? 0 : this.b.hashCode())) * 1000003 ^ (this.c ? 0x4CF : 0x4D5)) * 1000003 ^ (this.d ? 0x4CF : 0x4D5)) * 1000003 ^ (this.e ? 0x4CF : 0x4D5)) * 1000003 ^ this.f) * 1000003 ^ this.g.hashCode()) * 1000003 ^ (this.h == null ? 0 : this.h.hashCode())) * 0xD5009D89 ^ this.i.hashCode()) * 1000003 ^ (this.j ? 0x4CF : 0x4D5)) * 1000003 ^ this.k) * 1000003;
        int v3 = this.m;
        if(v3 != 0) {
            v = v3;
        }
        if(this.l) {
            v1 = 0x4CF;
        }
        return (v2 ^ v) * 1000003 ^ v1;
    }

    @Override
    public final String toString() {
        String s = String.valueOf(this.g);
        String s1 = String.valueOf(this.h);
        String s2 = String.valueOf(this.i);
        switch(this.m) {
            case 1: {
                return "WifiHostMetadata{ssid=" + this.a + ", password=" + this.b + ", is5GHzBandAvailable=" + this.c + ", is6GHzBandAvailable=" + this.d + ", isDisruptiveUpgrade=" + this.e + ", remoteApFrequency=" + this.f + ", specifiedBandwidth=" + s + ", remoteAvailableChannels=" + s1 + ", wifiDirectCliUsableChannels=null, wifiScanResult=" + s2 + ", forceScc=" + this.j + ", connectionType=" + this.k + ", hotspotType=" + "WIFI_DIRECT_HOTSPOT" + ", allowWifiRadioToggling=" + this.l + "}";
            }
            case 2: {
                return "WifiHostMetadata{ssid=" + this.a + ", password=" + this.b + ", is5GHzBandAvailable=" + this.c + ", is6GHzBandAvailable=" + this.d + ", isDisruptiveUpgrade=" + this.e + ", remoteApFrequency=" + this.f + ", specifiedBandwidth=" + s + ", remoteAvailableChannels=" + s1 + ", wifiDirectCliUsableChannels=null, wifiScanResult=" + s2 + ", forceScc=" + this.j + ", connectionType=" + this.k + ", hotspotType=" + "WIFI_SOFT_AP_HOTSPOT" + ", allowWifiRadioToggling=" + this.l + "}";
            }
            case 3: {
                return "WifiHostMetadata{ssid=" + this.a + ", password=" + this.b + ", is5GHzBandAvailable=" + this.c + ", is6GHzBandAvailable=" + this.d + ", isDisruptiveUpgrade=" + this.e + ", remoteApFrequency=" + this.f + ", specifiedBandwidth=" + s + ", remoteAvailableChannels=" + s1 + ", wifiDirectCliUsableChannels=null, wifiScanResult=" + s2 + ", forceScc=" + this.j + ", connectionType=" + this.k + ", hotspotType=" + "LOCAL_ONLY_HOTSPOT" + ", allowWifiRadioToggling=" + this.l + "}";
            }
            default: {
                return "WifiHostMetadata{ssid=" + this.a + ", password=" + this.b + ", is5GHzBandAvailable=" + this.c + ", is6GHzBandAvailable=" + this.d + ", isDisruptiveUpgrade=" + this.e + ", remoteApFrequency=" + this.f + ", specifiedBandwidth=" + s + ", remoteAvailableChannels=" + s1 + ", wifiDirectCliUsableChannels=null, wifiScanResult=" + s2 + ", forceScc=" + this.j + ", connectionType=" + this.k + ", hotspotType=" + "null" + ", allowWifiRadioToggling=" + this.l + "}";
            }
        }
    }
}

