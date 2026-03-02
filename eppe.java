import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.ArrayMap;
import com.google.android.gms.significantplaces.tracking.TrackingManager.GeofenceReceiver;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Set;

public final class eppe extends cjdc {
    public final Context c;
    public final icck d;
    public PendingIntent e;
    public final ArrayMap f;
    public final icnl g;
    public final azts h;
    private final epop i;
    private boolean j;
    private boolean k;
    private icck l;
    private icck m;
    private TrackingManager.GeofenceReceiver n;

    public eppe(Context context0, icck icck0) {
        ibuq.f(icck0, "scope");
        azts azts0 = new azts(context0, null, null);
        ibuq.f(icck0, "scope");
        super();
        this.c = context0;
        this.d = icck0;
        this.h = azts0;
        icnl icnl0 = icnm.a(epfz.c);
        this.g = icnl0;
        this.i = new epop(context0);
        this.f = new ArrayMap();
        epos epos0 = new epos(new icjm(new iclv(new icmp(icnl0), new epoy(this, null)), new epoz(this, null)), null);
        icbb.b(icck0, cclw.f, null, epos0, 2);
    }

    @Override  // cjdc
    protected final void A() {
        if(this.k) {
            epop epop0 = this.i;
            epop0.c.remove(this);
            if(epop0.c.isEmpty()) {
                epop0.a.j(epop0);
                epop0.a.k(epop0);
            }
            this.k = false;
        }
        this.E();
        this.G();
    }

    public static final ibrt C() {
        return cclv.c(clhr.b);
    }

    public final void D(boolean z) {
        this.j = z;
        if(z) {
            synchronized(this.a) {
                if(this.m == null) {
                    if(this.n != null || this.e != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    this.G();
                    this.m = iccl.b(cclw.f);
                    icck icck0 = this.m;
                    ibuq.c(icck0);
                    TrackingManager.GeofenceReceiver trackingManager$GeofenceReceiver0 = new TrackingManager.GeofenceReceiver(this, icck0);
                    this.n = trackingManager$GeofenceReceiver0;
                    IntentFilter intentFilter0 = new IntentFilter("com.google.android.gms.significantplaces.tracking.GEOFENCE");
                    jwe.b(this.c, trackingManager$GeofenceReceiver0, intentFilter0, 4);
                    Intent intent0 = new Intent("com.google.android.gms.significantplaces.tracking.GEOFENCE").setPackage("com.google.android.gms");
                    this.e = PendingIntent.getBroadcast(this.c, 0, intent0, 0x12000000);
                    iclv iclv0 = new iclv(epom.a.g(), new eppc(this, null));
                    icck icck1 = this.m;
                    ibuq.c(icck1);
                    icir.d(iclv0, icck1);
                    return;
                }
            }
            return;
        }
        synchronized(this.a) {
            this.E();
        }
        if(this.l != null) {
            return;
        }
        this.l = iccl.b(eppe.C());
        iclv iclv1 = new iclv(epom.a.g(), new eppd(this, null));
        icck icck2 = this.l;
        if(icck2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        icir.d(iclv1, icck2);
    }

    public final void E() {
        icck icck0 = this.m;
        if(icck0 == null) {
            return;
        }
        iccl.i(icck0);
        this.m = null;
        PendingIntent pendingIntent0 = this.e;
        ibuq.c(pendingIntent0);
        evql evql0 = this.h.ad(pendingIntent0);
        epor epor0 = new epor();
        evql0.v(gmap.a, epor0);
        pendingIntent0.cancel();
        this.e = null;
        TrackingManager.GeofenceReceiver trackingManager$GeofenceReceiver0 = this.n;
        ibuq.c(trackingManager$GeofenceReceiver0);
        this.c.unregisterReceiver(trackingManager$GeofenceReceiver0);
        this.n = null;
        this.f.clear();
        this.F();
    }

    public final void F() {
        ArrayMap arrayMap0 = this.f;
        if(arrayMap0.isEmpty()) {
            this.g.g(epfz.c);
            return;
        }
        Collection collection0 = arrayMap0.values();
        ibuq.e(collection0, "<get-values>(...)");
        if(!collection0.isEmpty()) {
            for(Object object0: collection0) {
                if(((epoq)object0).b == 1) {
                    this.g.g(epfz.a);
                    new ccmp().a(bbdg.wC);
                    return;
                }
            }
        }
        this.g.g(epfz.b);
        new ccmp().a(bbdg.wD);
    }

    private final void G() {
        icck icck0 = this.l;
        if(icck0 == null) {
            return;
        }
        iccl.i(icck0);
        this.l = null;
        synchronized(this.a) {
            this.F();
        }
    }

    @Override  // cjdc
    public final Object b(Collection collection0) {
        return ibom.a;
    }

    @Override  // cjdc
    public final void h(Object object0) {
        ibuq.f(((ibom)object0), "merged");
        if(!this.k) {
            epop epop0 = this.i;
            Set set0 = epop0.c;
            if(set0.isEmpty()) {
                epop0.a.f(epop0, gmap.a);
                epop0.a.g(epop0, gmap.a);
            }
            set0.add(this);
            this.D(epop0.b);
            this.k = true;
        }
    }

    @Override  // cjdc
    protected final void n(PrintWriter printWriter0) {
        String s;
        ibuq.f(printWriter0, "pw");
        bbpd bbpd0 = new bbpd(printWriter0, "  ");
        bbpd0.print("tracking state: ");
        bbpd0.println(this.g.b());
        if(this.j) {
            bbpd0.b();
            for(Object object0: this.f.values()) {
                System.out.print(((epoq)object0).a.f);
                System.out.print(": ");
                switch(((epoq)object0).b) {
                    case 1: {
                        s = "INSIDE";
                        break;
                    }
                    case 2: {
                        s = "OUTSIDE";
                        break;
                    }
                    default: {
                        s = "UNKNOWN";
                    }
                }
                System.out.println(s);
            }
            bbpd0.a();
        }
        else {
            bbpd0.print("location settings do not support accurate geofencing");
        }
        super.n(printWriter0);
    }

    @Override  // cjcp
    public final boolean y(cjdm cjdm0) {
        ibuq.f(((epow)cjdm0), "registration");
        return true;
    }
}

