import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.ConnectivityManager;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.Message;
import android.provider.Settings.Global;
import android.provider.Settings.System;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.MessageOptions;
import com.google.android.gms.wearable.node.WifiService.SavedNetworkBroadcastReceiver;
import com.google.android.gms.wearable.node.WifiService.WifiOnReceiver;
import j..util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class feah implements fduo, fdyv {
    public static final AtomicReference a;
    public final SharedPreferences b;
    public final WifiManager c;
    public final boolean d;
    public final fdvl e;
    public final fdyu f;
    public final ConnectivityManager g;
    final AtomicBoolean h;
    final AtomicBoolean i;
    public final AtomicBoolean j;
    public final feag k;
    final HashMap l;
    final AtomicBoolean m;
    public final Object n;
    public fduq o;
    public ConnectivityManager.NetworkCallback p;
    private final Context q;
    private final fdpl r;
    private final BroadcastReceiver s;
    private final fdye t;

    static {
        feah.a = new AtomicReference();
    }

    public feah(Context context0, fdpl fdpl0, SharedPreferences sharedPreferences0, boolean z, fdye fdye0, WifiManager wifiManager0, fdvl fdvl0, fdyu fdyu0, ConnectivityManager connectivityManager0) {
        this.h = new AtomicBoolean(false);
        this.i = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean0 = new AtomicBoolean(false);
        this.j = atomicBoolean0;
        this.l = new HashMap();
        this.m = new AtomicBoolean(false);
        this.n = new Object();
        this.o = null;
        this.p = null;
        this.q = context0;
        this.r = fdpl0;
        this.b = sharedPreferences0;
        this.c = wifiManager0;
        this.t = fdye0;
        this.d = z;
        this.e = fdvl0;
        this.f = fdyu0;
        this.g = connectivityManager0;
        feag feag0 = new feag(this, new bblg("WearWifiServiceHandler", 9));
        this.k = feag0;
        WifiService.WifiOnReceiver wifiService$WifiOnReceiver0 = new WifiService.WifiOnReceiver(this);
        this.s = wifiService$WifiOnReceiver0;
        if(z) {
            jwe.b(context0, wifiService$WifiOnReceiver0, new IntentFilter("android.net.wifi.WIFI_STATE_CHANGED"), 2);
            ContentResolver contentResolver0 = context0.getContentResolver();
            if(Settings.System.getInt(contentResolver0, "setup_wizard_has_run", 0) == 0) {
                Log.d("Wear_WifiService", "Waiting for setup wizard to complete before syncing wifi credentials");
                fead fead0 = new fead(this, contentResolver0);
                contentResolver0.registerContentObserver(Settings.System.getUriFor("setup_wizard_has_run"), false, fead0);
                return;
            }
            atomicBoolean0.set(true);
            feag0.sendEmptyMessage(1);
            return;
        }
        jwe.b(context0, new WifiService.SavedNetworkBroadcastReceiver(this), new IntentFilter("android.net.wifi.CONFIGURED_NETWORKS_CHANGE"), 2);
    }

    @Override  // fdyv
    public final boolean a(int v, fdpl fdpl0, String s, byte[] arr_b, String s1, boolean z) {
        fezx fezx0;
        if(!Objects.equals(s, "/wifi_connect_immediate")) {
            return false;
        }
        if(Log.isLoggable("Wear_WifiService", 4)) {
            Log.i("Wear_WifiService", "Received immediate wifi connection request.");
        }
        feaf feaf0 = new feaf();
        if(z) {
            feaf0.a = true;
            feaf0.b = v;
            feaf0.c = s1;
        }
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)fezx.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            fezx0 = (fezx)hftv0;
        }
        catch(hfur hfur0) {
            Log.w("Wear_WifiService", "Received invalid Wifi Sync proto", hfur0);
            this.k(feaf0, 3);
            return true;
        }
        feaf0.d = fezx0;
        Message message0 = this.k.obtainMessage(5, feaf0);
        this.k.sendMessage(message0);
        return true;
    }

    static ffcu b(WifiConfiguration wifiConfiguration0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffcu.a).v_newBuilder();
        String s = feah.e(wifiConfiguration0.SSID);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffcu ffcu0 = (ffcu)hftp0.b_message;
        s.getClass();
        ffcu0.b |= 1;
        ffcu0.c = s;
        boolean z = wifiConfiguration0.hiddenSSID;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffcu ffcu1 = (ffcu)hftp0.b_message;
        ffcu1.b |= 2;
        ffcu1.d = z;
        if(iaak.c()) {
            boolean z1 = wifiConfiguration0.allowAutojoin;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ffcu ffcu2 = (ffcu)hftp0.b_message;
            ffcu2.b |= 0x20;
            ffcu2.h = z1;
            int v = wifiConfiguration0.macRandomizationSetting;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ffcu ffcu3 = (ffcu)hftp0.b_message;
            ffcu3.b |= 0x40;
            ffcu3.i = v;
        }
        if(wifiConfiguration0.allowedKeyManagement.get(1)) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((ffcu)hftp0.b_message).e = 1;
            ((ffcu)hftp0.b_message).b |= 4;
            String s1 = feah.e(wifiConfiguration0.preSharedKey);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ffcu ffcu4 = (ffcu)hftp0.b_message;
            s1.getClass();
            ffcu4.b |= 8;
            ffcu4.f = s1;
            return (ffcu)hftp0.N_build();
        }
        if(!wifiConfiguration0.allowedKeyManagement.get(2) && !wifiConfiguration0.allowedKeyManagement.get(3)) {
            if(wifiConfiguration0.allowedKeyManagement.get(8)) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((ffcu)hftp0.b_message).e = 8;
                ((ffcu)hftp0.b_message).b |= 4;
                String s2 = feah.e(wifiConfiguration0.preSharedKey);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ffcu ffcu5 = (ffcu)hftp0.b_message;
                s2.getClass();
                ffcu5.b |= 8;
                ffcu5.f = s2;
                return (ffcu)hftp0.N_build();
            }
            if(wifiConfiguration0.allowedKeyManagement.get(9)) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((ffcu)hftp0.b_message).e = 9;
                ((ffcu)hftp0.b_message).b |= 4;
                return (ffcu)hftp0.N_build();
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((ffcu)hftp0.b_message).e = 0;
            ((ffcu)hftp0.b_message).b |= 4;
            if(wifiConfiguration0.wepKeys[0] != null) {
                String s3 = feah.e(wifiConfiguration0.wepKeys[0]);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ffcu ffcu6 = (ffcu)hftp0.b_message;
                s3.getClass();
                ffcu6.b |= 16;
                ffcu6.g = s3;
                return (ffcu)hftp0.N_build();
            }
        }
        else {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((ffcu)hftp0.b_message).e = 2;
            ((ffcu)hftp0.b_message).b |= 4;
        }
        return (ffcu)hftp0.N_build();
    }

    public final gmcd c(String s, String s1) {
        WifiConfiguration wifiConfiguration0;
        List list0 = this.c.getPrivilegedConfiguredNetworks();
        String s2 = feah.d(s1);
        for(Object object0: list0) {
            wifiConfiguration0 = (WifiConfiguration)object0;
            if(wifiConfiguration0.SSID == null || !wifiConfiguration0.SSID.equals(s2)) {
                continue;
            }
            goto label_9;
        }
        wifiConfiguration0 = null;
    label_9:
        if(wifiConfiguration0 == null) {
            return gmbu.i(new Status(4008));
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fezx.a).v_newBuilder();
        ffcu ffcu0 = feah.b(wifiConfiguration0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fezx fezx0 = (fezx)hftp0.b_message;
        ffcu0.getClass();
        fezx0.c = ffcu0;
        fezx0.b |= 1;
        hfst hfst0 = hfyf.k(iaak.a.b().a());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fezx fezx1 = (fezx)hftp0.b_message;
        hfst0.getClass();
        fezx1.d = hfst0;
        fezx1.b |= 2;
        return jqy.a(new feab(this, s, ((fezx)hftp0.N_build())));
    }

    static String d(String s) {
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        return s.charAt(0) != 34 || s.charAt(s.length() - 1) != 34 ? a.a(s, "\"", "\"") : s;
    }

    static String e(String s) {
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        int v = s.length();
        return v <= 1 || s.charAt(0) != 34 || s.charAt(v - 1) != 34 ? s : s.substring(1, v - 1);
    }

    public final List f(boolean z) {
        boolean z1;
        WifiManager wifiManager0 = this.c;
        if(wifiManager0 == null) {
            return ggna.a;
        }
        if(bbqa.c() && cjmf.b(this.q, "android.permission.NEARBY_WIFI_DEVICES") != 0) {
            Log.e("Wear_WifiService", "android.permission.NEARBY_WIFI_DEVICES is not granted to GMS Core.");
            return ggna.a;
        }
        if(z && !wifiManager0.isWifiEnabled() && !this.i()) {
            z1 = true;
            wifiManager0.setWifiEnabled(true);
        }
        else {
            z1 = false;
        }
        List list0 = wifiManager0.getPrivilegedConfiguredNetworks();
        if(z1 && !this.i()) {
            wifiManager0.setWifiEnabled(false);
        }
        return list0;
    }

    public final void g(String s) {
        synchronized(this.n) {
            fduq fduq0 = this.o;
            if(fduq0 == null) {
                return;
            }
            if(Log.isLoggable("Wear_WifiService", 3)) {
                Log.d("Wear_WifiService", "Syncing credentials from " + s);
            }
            if(Objects.equals(fduq0.b.b, "/wifi_sync_proto")) {
                try {
                    byte[] arr_b = fduq0.b.c();
                    hftc hftc0 = hftc.a();
                    ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ffct.a), arr_b, 0, arr_b.length, hftc0);
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    Log.w("Wear_WifiService", "Adding " + ((ffct)hftv0).b.size() + " networks from proto.");
                    int v1 = 0;
                    for(Object object1: ((ffct)hftv0).b) {
                        if(this.h(((ffcu)object1), false)) {
                            ++v1;
                        }
                    }
                    if(v1 <= 0) {
                        goto label_110;
                    }
                    this.c.saveConfiguration();
                    goto label_110;
                }
                catch(hfur hfur0) {
                    Log.w("Wear_WifiService", "Received invalid Wifi Sync proto", hfur0);
                    return;
                }
            }
            if(Objects.equals(fduq0.b.b, "/sync_wifi_credentials")) {
                fcez fcez0 = fcez.b(fduq0.b.c());
                int v2 = fcez0.z("source");
                if(Log.isLoggable("Wear_WifiService", 3)) {
                    Log.d("Wear_WifiService", "Credential source is from: " + v2);
                }
                ArrayList arrayList0 = fcez0.f("list");
                if(arrayList0 == null) {
                    Log.w("Wear_WifiService", "Received an empty wifi credentials data item.");
                    return;
                }
                if(Log.isLoggable("Wear_WifiService", 3)) {
                    Log.d("Wear_WifiService", "Wifi Credentials to sync: " + arrayList0.size());
                }
                if(Log.isLoggable("Wear_WifiService", 3)) {
                    Log.d("Wear_WifiService", "Adding " + arrayList0.size() + " networks.");
                }
                int v3 = arrayList0.size();
                for(int v4 = 0; v4 < v3; ++v4) {
                    fcez fcez1 = (fcez)arrayList0.get(v4);
                    String s1 = fcez1.d("ssid");
                    int v5 = fcez1.z("key_mgmt");
                    String s2 = fcez1.d("key");
                    if(s1 != null && v5 != 3) {
                        boolean z = fcez1.z("hiddenSsid") != 0;
                        if(v5 == 0) {
                            WifiConfiguration wifiConfiguration0 = new WifiConfiguration();
                            wifiConfiguration0.SSID = feah.d(s1);
                            wifiConfiguration0.hiddenSSID = z;
                            wifiConfiguration0.allowedKeyManagement.set(0);
                            this.n(this.l(wifiConfiguration0), false);
                        }
                        else {
                            WifiConfiguration wifiConfiguration1 = new WifiConfiguration();
                            wifiConfiguration1.hiddenSSID = z;
                            wifiConfiguration1.SSID = feah.d(s1);
                            wifiConfiguration1.priority = 1;
                            wifiConfiguration1.status = 2;
                            int v6 = s2 == null ? 0 : s2.length();
                            if(v5 == 1) {
                                wifiConfiguration1.allowedKeyManagement.set(0);
                                wifiConfiguration1.allowedProtocols.set(1);
                                wifiConfiguration1.allowedProtocols.set(0);
                                wifiConfiguration1.allowedAuthAlgorithms.set(0);
                                wifiConfiguration1.allowedAuthAlgorithms.set(1);
                                wifiConfiguration1.allowedPairwiseCiphers.set(2);
                                wifiConfiguration1.allowedPairwiseCiphers.set(1);
                                wifiConfiguration1.allowedGroupCiphers.set(0);
                                wifiConfiguration1.allowedGroupCiphers.set(1);
                                wifiConfiguration1.wepKeys = new String[4];
                                if(s2 != null && v6 > 0) {
                                    if((v6 == 10 || v6 == 26 || v6 == 58) && s2.matches("[0-9A-Fa-f]*")) {
                                        wifiConfiguration1.wepKeys[0] = s2;
                                    }
                                    else {
                                        String[] arr_s = wifiConfiguration1.wepKeys;
                                        arr_s[0] = feah.d(s2);
                                    }
                                    wifiConfiguration1.wepTxKeyIndex = 0;
                                }
                                this.n(this.l(wifiConfiguration1), false);
                            }
                            else {
                                if(v5 != 2) {
                                    throw new UnsupportedOperationException("Unrecognized key management scheme: " + v5);
                                }
                                wifiConfiguration1.allowedKeyManagement.set(1);
                                wifiConfiguration1.allowedProtocols.set(1);
                                wifiConfiguration1.allowedProtocols.set(0);
                                wifiConfiguration1.allowedPairwiseCiphers.set(1);
                                wifiConfiguration1.allowedPairwiseCiphers.set(2);
                                wifiConfiguration1.allowedGroupCiphers.set(0);
                                wifiConfiguration1.allowedGroupCiphers.set(1);
                                wifiConfiguration1.allowedGroupCiphers.set(2);
                                wifiConfiguration1.allowedGroupCiphers.set(3);
                                if(s2 != null && v6 > 0) {
                                    wifiConfiguration1.preSharedKey = s2.matches("[0-9A-Fa-f]{64}") ? s2 : feah.d(s2);
                                }
                                this.n(this.l(wifiConfiguration1), false);
                                continue;
                            }
                        }
                    }
                }
                if(Log.isLoggable("Wear_WifiService", 3)) {
                    Log.d("Wear_WifiService", "Saving configurations to disk...");
                }
                this.c.saveConfiguration();
            label_110:
                ConnectivityManager.NetworkCallback connectivityManager$NetworkCallback0 = this.p;
                if(connectivityManager$NetworkCallback0 != null) {
                    this.g.unregisterNetworkCallback(connectivityManager$NetworkCallback0);
                    this.p = null;
                }
                this.b.edit().putLong("last_sync_dataitem_written", fduq0.h).commit();
                this.o = null;
                return;
            }
            Log.w("Wear_WifiService", "Sync initialized with a non-wifi data item");
        }
    }

    public final boolean h(ffcu ffcu0, boolean z) {
        String s1;
        WifiConfiguration wifiConfiguration0 = new WifiConfiguration();
        wifiConfiguration0.SSID = feah.d(ffcu0.c);
        wifiConfiguration0.hiddenSSID = ffcu0.d;
        wifiConfiguration0.status = 2;
        if(iaak.c()) {
            if((ffcu0.b & 0x20) != 0) {
                wifiConfiguration0.allowAutojoin = ffcu0.h;
            }
            if((ffcu0.b & 0x40) != 0) {
                wifiConfiguration0.macRandomizationSetting = ffcu0.i;
            }
        }
        int v = ffcu0.e;
        int v1 = ffcs.a(v) == 0 ? 1 : ffcs.a(v);
        switch(v1 - 1) {
            case 0: {
                wifiConfiguration0.allowedKeyManagement.set(0);
                if((ffcu0.b & 16) == 0) {
                    wifiConfiguration0.priority = 0;
                }
                else {
                    wifiConfiguration0.allowedProtocols.set(1);
                    wifiConfiguration0.allowedProtocols.set(0);
                    wifiConfiguration0.allowedAuthAlgorithms.set(0);
                    wifiConfiguration0.allowedAuthAlgorithms.set(1);
                    wifiConfiguration0.allowedPairwiseCiphers.set(2);
                    wifiConfiguration0.allowedPairwiseCiphers.set(1);
                    wifiConfiguration0.allowedGroupCiphers.set(0);
                    wifiConfiguration0.allowedGroupCiphers.set(1);
                    wifiConfiguration0.wepKeys = new String[4];
                    int v3 = ffcu0.g.length();
                    if(v3 > 0) {
                        if((v3 == 10 || v3 == 26 || v3 == 58) && ffcu0.g.matches("[0-9A-Fa-f]*")) {
                            wifiConfiguration0.wepKeys[0] = ffcu0.g;
                        }
                        else {
                            String[] arr_s = wifiConfiguration0.wepKeys;
                            arr_s[0] = feah.d(ffcu0.g);
                        }
                        wifiConfiguration0.wepTxKeyIndex = 0;
                    }
                }
                break;
            }
            case 1: {
                wifiConfiguration0.allowedKeyManagement.set(1);
                wifiConfiguration0.allowedProtocols.set(1);
                wifiConfiguration0.allowedProtocols.set(0);
                wifiConfiguration0.allowedPairwiseCiphers.set(1);
                wifiConfiguration0.allowedPairwiseCiphers.set(2);
                wifiConfiguration0.allowedGroupCiphers.set(0);
                wifiConfiguration0.allowedGroupCiphers.set(1);
                wifiConfiguration0.allowedGroupCiphers.set(2);
                wifiConfiguration0.allowedGroupCiphers.set(3);
                if(ffcu0.f.length() > 0) {
                    wifiConfiguration0.preSharedKey = ffcu0.f.matches("[0-9A-Fa-f]{64}") ? ffcu0.f : feah.d(ffcu0.f);
                }
                break;
            }
            default: {
                if(v1 - 1 != 8 && v1 - 1 != 9) {
                    String s = ffcu0.c;
                    int v2 = ffcs.a(v);
                    if(v2 == 0) {
                        s1 = "NONE";
                    }
                    else {
                        switch(v2) {
                            case 1: {
                                s1 = "NONE";
                                break;
                            }
                            case 2: {
                                s1 = "WPA_PSK";
                                break;
                            }
                            case 3: {
                                s1 = "WPA_EAP";
                                break;
                            }
                            case 4: {
                                s1 = "IEEE8021X";
                                break;
                            }
                            case 5: {
                                s1 = "WPA2_PSK";
                                break;
                            }
                            case 6: {
                                s1 = "OPEN";
                                break;
                            }
                            case 7: {
                                s1 = "FT_PSK";
                                break;
                            }
                            case 8: {
                                s1 = "FT_EAP";
                                break;
                            }
                            case 9: {
                                s1 = "SAE";
                                break;
                            }
                            case 10: {
                                s1 = "OWE";
                                break;
                            }
                            case 11: {
                                s1 = "SUITE_B_192";
                                break;
                            }
                            case 12: {
                                s1 = "WPA_PSK_SHA256";
                                break;
                            }
                            case 13: {
                                s1 = "WPA_EAP_SHA256";
                                break;
                            }
                            case 14: {
                                s1 = "WAPI_PSK";
                                break;
                            }
                            case 15: {
                                s1 = "WAPI_CERT";
                                break;
                            }
                            case 16: {
                                s1 = "FILS_SHA256";
                                break;
                            }
                            default: {
                                s1 = "FILS_SHA384";
                            }
                        }
                    }
                    Log.e("Wear_WifiService", a.V(s1, s, " has unsupported security type ", "; skipping."));
                    wifiConfiguration0 = null;
                }
                else {
                    wifiConfiguration0.allowedProtocols.set(1);
                    wifiConfiguration0.allowedPairwiseCiphers.set(2);
                    wifiConfiguration0.allowedPairwiseCiphers.set(3);
                    wifiConfiguration0.allowedGroupCiphers.set(3);
                    wifiConfiguration0.allowedGroupCiphers.set(5);
                    wifiConfiguration0.requirePmf = true;
                    if(ffcs.a(ffcu0.e) == 10) {
                        wifiConfiguration0.allowedKeyManagement.set(9);
                    }
                    else {
                        wifiConfiguration0.allowedKeyManagement.set(8);
                        if(ffcu0.f.length() > 0) {
                            wifiConfiguration0.preSharedKey = ffcu0.f.matches("[0-9A-Fa-f]{64}") ? ffcu0.f : feah.d(ffcu0.f);
                        }
                    }
                }
            }
        }
        if(wifiConfiguration0 != null) {
            if(z) {
                wifiConfiguration0.networkId = this.l(wifiConfiguration0);
                this.n(wifiConfiguration0.networkId, true);
                return true;
            }
            String s2 = wifiConfiguration0.getKey();
            ffcu ffcu1 = (ffcu)this.l.get(s2);
            if(ffcu1 == null) {
                wifiConfiguration0.networkId = this.l(wifiConfiguration0);
                this.n(wifiConfiguration0.networkId, false);
                this.m(wifiConfiguration0);
                return true;
            }
            if(!Objects.equals(ffcu1.c, ffcu0.c) || ffcu1.d != ffcu0.d || iaak.c() && (((ffcu1.b & 0x20) == 0 ? 0 : 1) != ((ffcu0.b & 0x20) == 0 ? 0 : 1) || (ffcu1.b & 0x20) != 0 && ffcu1.h != ffcu0.h || (((ffcu1.b & 0x40) == 0 ? 0 : 1) != ((ffcu0.b & 0x40) == 0 ? 0 : 1) || (ffcu1.b & 0x40) != 0 && ffcu1.i != ffcu0.i)) || ((ffcs.a(ffcu1.e) == 0 ? 1 : ffcs.a(ffcu1.e)) != (ffcs.a(ffcu0.e) == 0 ? 1 : ffcs.a(ffcu0.e)) || !Objects.equals(ffcu1.f, ffcu0.f))) {
                wifiConfiguration0.networkId = this.l(wifiConfiguration0);
                this.m(wifiConfiguration0);
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        return Settings.Global.getInt(this.q.getContentResolver(), "airplane_mode_on", 0) == 1;
    }

    public final boolean j(boolean z) {
        if(!this.d) {
            Log.w("Wear_WifiService", "Syncing Wifi Credentials");
            if(this.c == null) {
                Log.w("Wear_WifiService", "No WiFi service. Exit...");
                return false;
            }
            List list0 = this.f(z);
            if(list0 != null && !list0.isEmpty()) {
                if(Log.isLoggable("Wear_WifiService", 3)) {
                    Log.d("Wear_WifiService", a.S(list0, "Number of wifi credentials: "));
                }
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffct.a).v_newBuilder();
                for(Object object0: list0) {
                    ffcu ffcu0 = feah.b(((WifiConfiguration)object0));
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ffct ffct0 = (ffct)hftp0.b_message;
                    ffcu0.getClass();
                    hfuo hfuo0 = ffct0.b;
                    if(!hfuo0.c()) {
                        ffct0.b = ProtoLiteMessage.E(hfuo0);
                    }
                    ffct0.b.add(ffcu0);
                }
                fdye fdye0 = this.t;
                fdun fdun0 = new fdun(fdye0.a().a, "/wifi_sync_proto");
                fdun0.e = ((ffct)hftp0.N_build()).toBytesArray();
                fdvl fdvl0 = this.e;
                fdpl fdpl0 = this.r;
                fdvl0.o(fdpl0, fdun0);
                ArrayList arrayList0 = new ArrayList();
                for(Object object1: list0) {
                    WifiConfiguration wifiConfiguration0 = (WifiConfiguration)object1;
                    fcez fcez0 = new fcez();
                    fcez0.s("ssid", feah.e(wifiConfiguration0.SSID));
                    if(wifiConfiguration0.hiddenSSID) {
                        fcez0.p("hiddenSsid", 1);
                    }
                    if(wifiConfiguration0.allowedKeyManagement.get(1)) {
                        fcez0.p("key_mgmt", 2);
                        fcez0.s("key", feah.e(wifiConfiguration0.preSharedKey));
                    }
                    else if(wifiConfiguration0.allowedKeyManagement.get(2) || wifiConfiguration0.allowedKeyManagement.get(3)) {
                        fcez0.p("key_mgmt", 3);
                    }
                    else if(wifiConfiguration0.wepKeys[0] == null) {
                        fcez0.p("key_mgmt", 0);
                    }
                    else {
                        fcez0.p("key_mgmt", 1);
                        fcez0.s("key", feah.e(wifiConfiguration0.wepKeys[0]));
                    }
                    arrayList0.add(fcez0);
                }
                fdun fdun1 = new fdun(fdye0.a().a, "/sync_wifi_credentials");
                fcez fcez1 = new fcez();
                fcez1.m("list", arrayList0);
                fcez1.p("source", 1);
                fdun1.e = fcez1.y();
                fdvl0.o(fdpl0, fdun1);
                return true;
            }
        }
        return false;
    }

    public final void k(feaf feaf0, int v) {
        if(feaf0 != null && feaf0.a) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffaa.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((ffaa)hftp0.b_message).c = v - 1;
            ((ffaa)hftp0.b_message).b |= 1;
            ffaa ffaa0 = (ffaa)hftp0.N_build();
            fdpl fdpl0 = ffgp.a;
            String s = feaf0.c;
            byte[] arr_b = ffaa0.toBytesArray();
            fdyr fdyr0 = new fdyr(feaf0.b, new byte[0]);
            MessageOptions messageOptions0 = new MessageOptions(1);
            this.f.g(fdpl0, s, "/wifi_connect_immediate", arr_b, null, fdyr0, messageOptions0);
        }
    }

    private final int l(WifiConfiguration wifiConfiguration0) {
        int v = this.c.addNetwork(wifiConfiguration0);
        if(v == -1) {
            Log.w("Wear_WifiService", "Add network <" + wifiConfiguration0.SSID + "> failed.");
            return -1;
        }
        Log.i("Wear_WifiService", "Network <" + wifiConfiguration0.SSID + "> added.");
        return v;
    }

    private final void m(WifiConfiguration wifiConfiguration0) {
        if(wifiConfiguration0.networkId == -1) {
            Log.w("Wear_WifiService", "Network id is invalid. Not adding to store.");
            return;
        }
        String s = wifiConfiguration0.getKey();
        ffcu ffcu0 = feah.b(wifiConfiguration0);
        this.l.put(s, ffcu0);
        if(Log.isLoggable("Wear_WifiService", 3)) {
            Log.d("Wear_WifiService", "Network with id <" + wifiConfiguration0.SSID + "> added to store.");
        }
    }

    private final void n(int v, boolean z) {
        if(v == -1) {
            Log.w("Wear_WifiService", "Network id is invalid. Enable network failed.");
            return;
        }
        this.c.enableNetwork(v, z);
        Log.i("Wear_WifiService", a.f(v, "Network with id <", "> enabled."));
    }

    @Override  // fduo
    public final void o(ArrayList arrayList0) {
        if(this.d && this.c != null) {
            int v = arrayList0.size();
            int v1 = 0;
            while(v1 < v) {
                fduq fduq0 = (fduq)arrayList0.get(v1);
                if(this.r.equals(fduq0.a)) {
                    if(Objects.equals(fduq0.b.b, "/wifi_sync_proto")) {
                        this.i.set(true);
                        goto label_10;
                    }
                    else if(Objects.equals(fduq0.b.b, "/sync_wifi_credentials") && !this.i.get()) {
                    label_10:
                        if(!fduq0.c) {
                            if(!this.j.get()) {
                                Log.d("Wear_WifiService", "Received wifi creds but setup has not completed, delaying until completion");
                                goto label_20;
                            }
                            Message message0 = this.k.obtainMessage(2, fduq0);
                            this.k.sendMessage(message0);
                            return;
                        }
                        else if(Log.isLoggable("Wear_WifiService", 3)) {
                            Log.d("Wear_WifiService", "Wifi Credentials data item was deleted.");
                        }
                    }
                }
            label_20:
                ++v1;
            }
        }
    }
}

