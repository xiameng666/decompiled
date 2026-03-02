import android.content.Context;
import com.google.android.gms.nearby.sharing.WifiCredentialsAttachment;
import com.google.android.gms.smartdevice.wifi.ConnectToWifiNetworkRequest;

public final class dfsd implements icih {
    final icih a;
    final dfsg b;

    public dfsd(icih icih0, dfsg dfsg0) {
        this.b = dfsg0;
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        Object object4;
        aztb aztb1;
        WifiCredentialsAttachment wifiCredentialsAttachment1;
        WifiCredentialsAttachment wifiCredentialsAttachment2;
        String s3;
        Object object3;
        String s2;
        WifiCredentialsAttachment wifiCredentialsAttachment0;
        String s1;
        dfsc dfsc0;
        if((ibrl0 instanceof dfsc)) {
            dfsc0 = (dfsc)ibrl0;
            int v = dfsc0.b;
            if((v & 0x80000000) == 0) {
                dfsc0 = new dfsc(this, ibrl0);
            }
            else {
                dfsc0.b = v - 0x80000000;
            }
        }
        else {
            dfsc0 = new dfsc(this, ibrl0);
        }
        Object object1 = dfsc0.a;
        Object object2 = ibrx.a;
        switch(dfsc0.b) {
            case 0: {
                ibnx.b(object1);
                icih icih0 = this.a;
                String s = ((WifiCredentialsAttachment)object0).a;
                if(djbz.f(this.b.a, s)) {
                    dcvz.a.b().h("Already connected to ssid %s.", ((WifiCredentialsAttachment)object0).a);
                    ibuq.e(((WifiCredentialsAttachment)object0).a, "getSsid(...)");
                    dfrt dfrt0 = new dfrt(((WifiCredentialsAttachment)object0).a);
                    dfsc0.b = 1;
                    return icih0.a(dfrt0, dfsc0) != object2 ? ibom.a : object2;
                }
                int v1 = ((WifiCredentialsAttachment)object0).b;
                if(v1 == 1) {
                    s1 = "Open";
                }
                else {
                    switch(v1) {
                        case 2: {
                            s1 = "PSK";
                            break;
                        }
                        case 3: {
                            s1 = "WEP";
                            break;
                        }
                        case 4: {
                            s1 = "SAE";
                            break;
                        }
                        default: {
                            dcvz.a.e().i("WifiUtils#connectToWifi failed to connect to %s, unknown type %d", ((WifiCredentialsAttachment)object0).a, new Integer(((WifiCredentialsAttachment)object0).b));
                            ibuq.e(((WifiCredentialsAttachment)object0).a, "getSsid(...)");
                            dfrv dfrv0 = new dfrv(((WifiCredentialsAttachment)object0).a);
                            dfsc0.b = 2;
                            return icih0.a(dfrv0, dfsc0) != object2 ? ibom.a : object2;
                        }
                    }
                }
                ibuq.e(s, "getSsid(...)");
                dfru dfru0 = new dfru(s);
                dfsc0.e = (WifiCredentialsAttachment)object0;
                dfsc0.d = icih0;
                dfsc0.f = s1;
                dfsc0.b = 3;
                if(icih0.a(dfru0, dfsc0) != object2) {
                    wifiCredentialsAttachment0 = (WifiCredentialsAttachment)object0;
                    s2 = s1;
                    object3 = icih0;
                    goto label_56;
                }
                break;
            }
            case 3: {
                s2 = dfsc0.f;
                object3 = dfsc0.d;
                wifiCredentialsAttachment0 = dfsc0.e;
                ibnx.b(object1);
            label_56:
                if(hvrc.A()) {
                    Context context0 = this.b.a;
                    if(djbz.h(context0)) {
                        s3 = s2;
                        wifiCredentialsAttachment2 = wifiCredentialsAttachment0;
                        goto label_97;
                    }
                    else {
                        dcvz.a.b().h("Wifi is disabled, enable and then connect to ssid %s", wifiCredentialsAttachment0.a);
                        try {
                            evql evql0 = djbz.c(context0);
                            dfsc0.e = wifiCredentialsAttachment0;
                            dfsc0.d = object3;
                            dfsc0.f = s2;
                            dfsc0.b = 4;
                            object1 = ictn.b(evql0, dfsc0);
                        }
                        catch(IllegalStateException illegalStateException0) {
                            wifiCredentialsAttachment1 = wifiCredentialsAttachment0;
                            goto label_88;
                        }
                        if(object1 != object2) {
                            wifiCredentialsAttachment1 = wifiCredentialsAttachment0;
                            goto label_83;
                        }
                    }
                }
                else {
                    s3 = s2;
                    wifiCredentialsAttachment2 = wifiCredentialsAttachment0;
                    goto label_97;
                }
                break;
            }
            case 4: {
                try {
                    s2 = dfsc0.f;
                    object3 = dfsc0.d;
                    wifiCredentialsAttachment1 = dfsc0.e;
                    ibnx.b(object1);
                label_83:
                    Void void0 = (Void)object1;
                    s3 = s2;
                    wifiCredentialsAttachment2 = wifiCredentialsAttachment1;
                    goto label_97;
                }
                catch(IllegalStateException illegalStateException0) {
                }
            label_88:
                dcvz.a.e().f(illegalStateException0).p("Failed to enable Wi-Fi", new Object[0]);
                ibuq.e(wifiCredentialsAttachment1.a, "getSsid(...)");
                dfrv dfrv1 = new dfrv(wifiCredentialsAttachment1.a);
                dfsc0.e = null;
                dfsc0.d = null;
                dfsc0.f = null;
                dfsc0.b = 5;
                return ((icih)object3).a(dfrv1, dfsc0) != object2 ? ibom.a : object2;
            label_97:
                ConnectToWifiNetworkRequest connectToWifiNetworkRequest0 = new ConnectToWifiNetworkRequest();
                connectToWifiNetworkRequest0.a = wifiCredentialsAttachment2.a;
                connectToWifiNetworkRequest0.b = s3;
                String s4 = wifiCredentialsAttachment2.d;
                if(s4 != null) {
                    connectToWifiNetworkRequest0.c = s4;
                }
                try {
                    connectToWifiNetworkRequest0.d = wifiCredentialsAttachment2.e;
                    evql evql1 = ((erqw)this.b.b.get()).b(connectToWifiNetworkRequest0);
                    dfsc0.e = wifiCredentialsAttachment2;
                    dfsc0.d = object3;
                    dfsc0.f = null;
                    dfsc0.b = 6;
                    if(ictn.b(evql1, dfsc0) != object2) {
                        object4 = object3;
                        goto label_120;
                    }
                    break;
                }
                catch(aztb aztb0) {
                    aztb1 = aztb0;
                    object4 = object3;
                    goto label_132;
                }
                object4 = object3;
                goto label_120;
            }
            case 6: {
                try {
                    object4 = dfsc0.d;
                    wifiCredentialsAttachment2 = dfsc0.e;
                    ibnx.b(object1);
                label_120:
                    ibuq.e(wifiCredentialsAttachment2.a, "getSsid(...)");
                    dfrx dfrx0 = new dfrx(wifiCredentialsAttachment2.a);
                    dfsc0.e = wifiCredentialsAttachment2;
                    dfsc0.d = object4;
                    dfsc0.b = 7;
                    return ((icih)object4).a(dfrx0, dfsc0) != object2 ? ibom.a : object2;
                label_127:
                    object4 = dfsc0.d;
                    wifiCredentialsAttachment2 = dfsc0.e;
                    ibnx.b(object1);
                    return ibom.a;
                }
                catch(aztb aztb1) {
                    goto label_132;
                }
            }
            case 7: {
                goto label_127;
            label_132:
                dcvz.a.e().f(aztb1).h("WifiUtils#connectToWifi failed to connect to %s", wifiCredentialsAttachment2.a);
                ibuq.e(wifiCredentialsAttachment2.a, "getSsid(...)");
                dfrv dfrv2 = new dfrv(wifiCredentialsAttachment2.a);
                dfsc0.e = null;
                dfsc0.d = null;
                dfsc0.f = null;
                dfsc0.b = 8;
                if(((icih)object4).a(dfrv2, dfsc0) != object2) {
                    return ibom.a;
                }
                break;
            }
            case 1: 
            case 2: 
            case 5: 
            case 8: {
                ibnx.b(object1);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return object2;
    }
}

