import android.content.Context;
import android.net.nsd.NsdServiceInfo;
import android.net.wifi.WifiManager.MulticastLock;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.mdns.MdnsOptions;
import com.google.android.gms.mdns.MdnsServiceInfo;
import java.util.List;

public final class cqvy extends bark {
    public volatile long a;
    public final bzs b;
    public WifiManager.MulticastLock c;
    public final MdnsOptions d;
    public final ggtl e;
    public final cqvv f;

    public cqvy(Context context0, Looper looper0, baqv baqv0, aztu aztu0, aztv aztv0, MdnsOptions mdnsOptions0) {
        cqvv cqvv0 = new cqvv();
        super(context0, looper0, 0xA8, baqv0, aztu0, aztv0);
        this.a = -1L;
        this.b = new bzs();
        this.d = mdnsOptions0;
        this.f = cqvv0;
        this.e = ggtn.b("MdnsServiceBrowser");
    }

    static String[] V(NsdServiceInfo nsdServiceInfo0) {
        List list0 = gfud.e('.').d().n(nsdServiceInfo0.getServiceType());
        String[] arr_s = new String[list0.size() + 1];
        list0.toArray(arr_s);
        arr_s[list0.size()] = "local";
        return arr_s;
    }

    static void W(NsdServiceInfo nsdServiceInfo0, String s) {
        new MdnsServiceInfo(nsdServiceInfo0.getServiceName(), cqvy.V(nsdServiceInfo0), (s == null ? ggna.a : gged_interceptors.l(s)), new String[0], 0, null, null, null, null, -1);
    }

    @Override  // baqp, azsz
    public final int a() {
        return 12800000;
    }

    @Override  // baqp
    protected final Bundle b() {
        Bundle bundle0 = new Bundle();
        bundle0.putByteArray("MDNS_OPTIONS", bauc.n(this.d));
        return bundle0;
    }

    @Override  // baqp
    protected final IInterface c(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.mdns.internal.IMdnsApiService");
        return (iInterface0 instanceof cqum) ? ((cqum)iInterface0) : new cquk(iBinder0);
    }

    @Override  // baqp
    protected final String d() {
        return "com.google.android.gms.mdns.internal.IMdnsApiService";
    }

    @Override  // baqp
    protected final String e() {
        return "com.google.android.gms.mdns.service.START";
    }

    public static String r(MdnsOptions mdnsOptions0) {
        String s = mdnsOptions0.a.endsWith(".") ? mdnsOptions0.a.substring(0, mdnsOptions0.a.length() - 1) : mdnsOptions0.a;
        return s.endsWith(".local") ? s.substring(0, s.length() - 6) : null;
    }

    public final void s(azyf azyf0) {
        azyf0.b(new cqvt(this));
    }

    public final void t(azyf azyf0, ApiMetadata apiMetadata0) {
        azyd_linstner azyd0 = azyf0.listener_;
        if(azyd0 == null) {
            return;
        }
        bzs bzs0 = this.b;
        synchronized(bzs0) {
            cqvw cqvw0 = (cqvw)bzs0.remove(azyd0);
            if(cqvw0 == null) {
                ((ggtj)((ggtj)this.e.j()).ar(7143)).x("Tried to unregister nonexistent listener");
            }
            else {
                cqvw0.h(apiMetadata0);
                WifiManager.MulticastLock wifiManager$MulticastLock0 = this.c;
                if(wifiManager$MulticastLock0 != null) {
                    int v1 = 0;
                    while(v1 < bzs0.d_num) {
                        if(!(bzs0.i(v1) instanceof cquo)) {
                            goto label_20;
                        }
                        ++v1;
                    }
                    wifiManager$MulticastLock0.release();
                    this.c = null;
                }
            }
        label_20:
        }
    }
}

