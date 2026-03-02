import android.content.Context;
import android.net.wifi.WifiManager.MulticastLock;
import android.net.wifi.WifiManager;
import com.google.android.gms.mdns.MdnsSearchOptions;
import java.util.ArrayList;

public final class cqrs implements cqro {
    public final gpqm a;
    public gpqy b;
    public gpsm c;

    public cqrs(Context context0, WifiManager wifiManager0) {
        boolean z = hvfj.c();
        gpqm gpqm0 = new gpqm();
        this.a = gpqm0;
        WifiManager.MulticastLock wifiManager$MulticastLock0 = wifiManager0.createMulticastLock("mdns-android");
        wifiManager$MulticastLock0.setReferenceCounted(false);
        gpsv.a = new cqsy();
        gpqz gpqz0 = new gpqz(z, z, z, (z ? bbfj.a.b(0x900) : -1));
        gpsv gpsv0 = new gpsv(gpsv.a.a());
        this.c = new gpsm(context0.getApplicationContext(), wifiManager$MulticastLock0, gpsv0, gpqz0);
        gpqy gpqy0 = new gpqy(gpqm0, this.c, gpsv0, gpqz0);
        this.b = gpqy0;
        gpsm gpsm0 = this.c;
        if(gpsm0 != null) {
            gpsm0.d(gpqy0);
        }
    }

    @Override  // cqro
    public final void a(String s, cqsk cqsk0, MdnsSearchOptions mdnsSearchOptions0) {
        cqrr cqrr0 = new cqrr(cqsk0, mdnsSearchOptions0);
        gpqy gpqy0 = this.b;
        if(gpqy0 != null) {
            com.google.gms.mdns.MdnsSearchOptions mdnsSearchOptions1 = new com.google.gms.mdns.MdnsSearchOptions(new ArrayList(cqrr0.b.a), cqrr0.b.b, cqrr0.b.e, null, 0, cqrr0.b.f, cqrr0.b.c, cqrr0.b.d);
            gpqn.c(gpqy0.c, "Registering listener for serviceType: " + s);
            gpqw gpqw0 = new gpqw(gpqy0, s, cqrr0, mdnsSearchOptions1);
            gpqy0.e.a(gpqw0);
        }
    }

    @Override  // cqro
    public final void b(String s, cqsk cqsk0) {
        synchronized(this) {
            gpqy gpqy0 = this.b;
            if(gpqy0 != null) {
                cqrr cqrr0 = new cqrr(cqsk0, MdnsSearchOptions.a());
                gpqn.c(gpqy0.c, "Unregistering listener for serviceType:" + s);
                gpqu gpqu0 = new gpqu(gpqy0, s, cqrr0);
                gpqy0.e.a(gpqu0);
            }
        }
    }
}

