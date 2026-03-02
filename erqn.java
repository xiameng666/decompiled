import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.os.Process;
import com.google.android.gms.smartdevice.utils.wifi.WifiConnectionManager.WifiConnectionReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class erqn {
    public static final baun a;
    private final Context b;
    private final WifiManager c;
    private final CountDownLatch d;

    static {
        erqn.a = new erqc(new String[]{"WifiConnectionManager"});
    }

    public erqn(Context context0) {
        WifiManager wifiManager0 = erqr.b(context0);
        gftb.check(context0);
        ConnectivityManager connectivityManager0 = (ConnectivityManager)context0.getSystemService("connectivity");
        super();
        this.d = new CountDownLatch(1);
        batl.s(context0);
        this.b = context0;
        batl.s(wifiManager0);
        this.c = wifiManager0;
        batl.s(connectivityManager0);
    }

    public final int a(WifiConfiguration wifiConfiguration0, boolean z) {
        int v = -1;
        batl.s(wifiConfiguration0.SSID);
        String s = erqe.b(wifiConfiguration0.SSID);
        if(s != null) {
            for(Object object0: this.h()) {
                WifiConfiguration wifiConfiguration1 = (WifiConfiguration)object0;
                String s1 = erqe.b(wifiConfiguration1.SSID);
                if(s1 != null && s1.equals(s)) {
                    v = wifiConfiguration1.networkId;
                    break;
                }
            }
        }
        if(v != -1) {
            erqn.a.m("Network already exists, updating network configuration.", new Object[0]);
            v = this.c.updateNetwork(wifiConfiguration0);
        }
        if(v == -1) {
            v = this.c.addNetwork(wifiConfiguration0);
        }
        if(v == -1) {
            erqn.a.f("Could not create/add network configuration for %s", new Object[]{wifiConfiguration0.SSID});
            return -1;
        }
        return this.g(v, z);
    }

    public final int b(WifiConfiguration wifiConfiguration0) {
        return this.a(wifiConfiguration0, true);
    }

    public final int c() {
        WifiInfo wifiInfo0 = this.c.getConnectionInfo();
        return wifiInfo0 == null ? -1 : wifiInfo0.getNetworkId();
    }

    public final WifiConfiguration d(String s) {
        for(Object object0: this.f()) {
            WifiConfiguration wifiConfiguration0 = (WifiConfiguration)object0;
            String s1 = erqe.b(wifiConfiguration0.SSID);
            if(s1 != null && s1.equals(s)) {
                return wifiConfiguration0;
            }
        }
        return null;
    }

    public final String e() {
        WifiInfo wifiInfo0 = this.c.getConnectionInfo();
        return wifiInfo0 == null ? "" : gfta.b(erqe.b(wifiInfo0.getSSID()));
    }

    public final List f() {
        List list0;
        Context context0 = this.b;
        if(context0.checkPermission("android.permission.READ_WIFI_CREDENTIAL", Process.myPid(), Process.myUid()) == 0) {
            if(Build.VERSION.SDK_INT >= 33 && !erpr.b(context0)) {
                return new ArrayList();
            }
            list0 = erqr.b(erpr.a(context0)).getPrivilegedConfiguredNetworks();
        }
        else {
            list0 = this.h();
        }
        return list0 == null ? new ArrayList() : list0;
    }

    private final int g(int v, boolean z) {
        int v2;
        WifiConnectionManager.WifiConnectionReceiver wifiConnectionManager$WifiConnectionReceiver1;
        WifiConnectionManager.WifiConnectionReceiver wifiConnectionManager$WifiConnectionReceiver0;
        int v1;
        synchronized(this) {
            baun baun0 = erqn.a;
            baun0.j("doConnect. NetworkId: %d", new Object[]{v});
            v1 = -1;
            if(v == -1) {
                baun0.m("Network not found", new Object[0]);
                return -1;
            }
            goto label_8;
        }
        return -1;
    label_8:
        if(this.c() != v) {
            Iterator iterator0 = this.h().iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    erqn.a.m("Network not found", new Object[0]);
                    return -1;
                }
                wifiConnectionManager$WifiConnectionReceiver0 = null;
                Object object0 = iterator0.next();
                if(((WifiConfiguration)object0).networkId == v) {
                    goto label_14;
                }
            }
        }
        return v;
        try {
            try {
            label_14:
                if(z) {
                    wifiConnectionManager$WifiConnectionReceiver1 = new WifiConnectionManager.WifiConnectionReceiver(this, v, this.d);
                    goto label_16;
                }
                goto label_24;
            }
            catch(InterruptedException interruptedException0) {
                goto label_44;
            }
            try {
            label_16:
                IntentFilter intentFilter0 = new IntentFilter("android.net.wifi.STATE_CHANGE");
                wifiConnectionManager$WifiConnectionReceiver0 = wifiConnectionManager$WifiConnectionReceiver1;
                jwe.b(this.b, wifiConnectionManager$WifiConnectionReceiver1, intentFilter0, 2);
                wifiConnectionManager$WifiConnectionReceiver0 = wifiConnectionManager$WifiConnectionReceiver1;
                goto label_24;
            }
            catch(InterruptedException interruptedException0) {
            }
        }
        catch(Throwable throwable1) {
            goto label_47;
        }
        wifiConnectionManager$WifiConnectionReceiver0 = wifiConnectionManager$WifiConnectionReceiver1;
        goto label_44;
        try {
        label_24:
            WifiManager wifiManager0 = this.c;
            v2 = wifiManager0.enableNetwork(v, true) ? v : -1;
            if(z && v2 != -1) {
                this.d.await(15L, TimeUnit.SECONDS);
                if(this.c() != v) {
                    if(v != -1) {
                        Iterator iterator1 = this.h().iterator();
                        while(true) {
                        label_31:
                            if(!iterator1.hasNext()) {
                                break;
                            }
                            Object object1 = iterator1.next();
                            if(((WifiConfiguration)object1).networkId == v) {
                                wifiManager0.removeNetwork(v);
                                break;
                            }
                        }
                    }
                    goto label_37;
                }
            }
            v1 = v2;
            goto label_51;
        }
        catch(InterruptedException interruptedException0) {
            goto label_44;
        }
        catch(Throwable throwable1) {
            goto label_47;
        }
        goto label_31;
    label_37:
        erqn.a.j("Unregistering wifi state receiver", new Object[0]);
        this.b.unregisterReceiver(wifiConnectionManager$WifiConnectionReceiver0);
        return -1;
        try {
            v1 = v2;
            goto label_51;
        }
        catch(InterruptedException interruptedException0) {
            try {
            label_44:
                erqn.a.g("WiFi connection interrupted", interruptedException0, new Object[0]);
                goto label_51;
            }
            catch(Throwable throwable1) {
            }
            goto label_47;
        }
        catch(Throwable throwable1) {
        label_47:
            if(wifiConnectionManager$WifiConnectionReceiver0 != null) {
                erqn.a.j("Unregistering wifi state receiver", new Object[0]);
                this.b.unregisterReceiver(wifiConnectionManager$WifiConnectionReceiver0);
            }
            throw throwable1;
        label_51:
            if(wifiConnectionManager$WifiConnectionReceiver0 != null) {
                erqn.a.j("Unregistering wifi state receiver", new Object[0]);
                this.b.unregisterReceiver(wifiConnectionManager$WifiConnectionReceiver0);
            }
        }
        return v1;
    }

    private final List h() {
        List list0 = this.c.getConfiguredNetworks();
        return list0 == null ? new ArrayList() : list0;
    }
}

