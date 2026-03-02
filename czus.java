import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.nsd.NsdServiceInfo;
import java.net.InetAddress;
import java.util.Map;

public abstract class czus {
    public final Context a;
    protected final ConnectivityManager b;
    public final gyxl c;
    private final cuqs d;
    private final czvk e;
    private final gmcg f;
    private final Map g;
    private final Map h;

    public czus(Context context0, czvk czvk0, gyxl gyxl0) {
        cuqs cuqs0 = new cuqs(context0);
        super();
        this.f = cuui.d();
        this.g = new bxd();
        this.h = new bxd();
        this.a = context0;
        this.d = cuqs0;
        this.b = (ConnectivityManager)context0.getSystemService("connectivity");
        this.e = czvk0;
        this.c = gyxl0;
    }

    public abstract int a();

    public abstract int b();

    protected final czle c(String s, Network network0, czkv czkv0, InetAddress inetAddress0) {
        gyxo gyxo0;
        synchronized(this) {
            czky czky0 = czkz.a();
            gyxl gyxl0 = this.c;
            czky0.c(gyxl0);
            czky0.b("_dct._tcp");
            czky0.d(hvol.h());
            czky0.f(hvol.i());
            czky0.e(hvol.a.r().j());
            czky0.a = null;
            czky0.b = inetAddress0;
            czkz czkz0 = czky0.a();
            czkx czkx0 = new czkx(czkz0, this.f, this.d, s, czkv0, czkz0);
            czuq czuq0 = new czuq(this, this.a, this.d, czkx0, s, network0);
            gyxo0 = czuq0.a;
            if(this.e.a(czuq0) == czvj.c) {
                czkq.a.b().h("Failed to start %s discovering because we were unable to register the MediumOperation", gyxl0.name());
                return new czle(Boolean.valueOf(false), czuq0.a);
            }
            this.h.put(s, czuq0);
        }
        return new czle(Boolean.valueOf(true), gyxo0);
    }

    public void d() {
        synchronized(this) {
            cuui.h(this.f, "BaseMdnsMedium.singleThreadOffloader");
            if(hvol.T()) {
                bxe bxe0 = new bxe(new bxf(this.g.keySet()));
                while(bxe0.hasNext()) {
                    Object object0 = bxe0.next();
                    this.f(((String)object0));
                }
                bxe bxe1 = new bxe(new bxf(this.h.keySet()));
                while(bxe1.hasNext()) {
                    Object object1 = bxe1.next();
                    this.e(((String)object1));
                }
            }
        }
    }

    protected void e(String s) {
        synchronized(this) {
            if(!this.g(s)) {
                return;
            }
            czvg czvg0 = (czvg)this.h.remove(s);
            this.e.e(czvg0);
            czkq.a.b().p("Stopped mDNs discovery.", new Object[0]);
        }
    }

    protected void f(String s) {
        synchronized(this) {
            if(!this.h(s)) {
                czkq.a.b().p("Can\'t stop nsd service because the service is not currently registered.", new Object[0]);
                return;
            }
            czvg czvg0 = (czvg)this.g.remove(s);
            this.e.e(czvg0);
            czkq.a.b().p("Stopped nsd service.", new Object[0]);
        }
    }

    protected final boolean g(String s) {
        boolean z;
        synchronized(this) {
            z = this.h.containsKey(s);
        }
        return z;
    }

    protected final boolean h(String s) {
        boolean z;
        synchronized(this) {
            z = this.g.containsKey(s);
        }
        return z;
    }

    protected czle i(String s, String s1, int v, Network network0, czlb czlb0) {
        czle czle1;
        czle czle0;
        czur czur0;
        czus czus0;
        Throwable throwable2;
        NsdServiceInfo nsdServiceInfo0;
        __monitor_enter(this);
        try {
            nsdServiceInfo0 = new NsdServiceInfo();
            nsdServiceInfo0.setServiceName(s1);
            nsdServiceInfo0.setServiceType("_dct._tcp");
            nsdServiceInfo0.setPort(v);
            if(network0 != null) {
                goto label_6;
            }
            goto label_12;
        }
        catch(Throwable throwable0) {
            czus0 = this;
            goto label_28;
        }
        try {
        label_6:
            nsdServiceInfo0.setNetwork(network0);
        }
        catch(Throwable throwable1) {
            throwable2 = throwable1;
            czus0 = this;
            goto label_29;
        }
        try {
        label_12:
            czus0 = this;
        }
        catch(Throwable throwable0) {
            czus0 = this;
            goto label_28;
        }
        try {
            czur0 = new czur(czus0, this.a, this.d, nsdServiceInfo0, s, czlb0);
            if(czus0.e.a(czur0) == czvj.c) {
                czkq.a.b().i("Failed to start %s registering with serviceInfo %s because we were unable to register the MediumOperation", czus0.c.name(), nsdServiceInfo0);
                czle0 = new czle(Boolean.valueOf(false), czur0.a);
                goto label_21;
            }
            goto label_23;
        }
        catch(Throwable throwable0) {
            goto label_28;
        }
    label_21:
        __monitor_exit(czus0);
        return czle0;
        try {
        label_23:
            czus0.g.put(s, czur0);
            czkq.a.b().j("Successfully registered nsd service %s on service id %s over %s.", nsdServiceInfo0.getServiceName(), s, czus0.c.name());
            czle1 = new czle(Boolean.valueOf(true), czur0.a);
            goto label_31;
        label_28:
            throwable2 = throwable0;
        label_29:
            __monitor_exit(czus0);
        }
        catch(Throwable throwable0) {
            goto label_28;
        }
        throw throwable2;
    label_31:
        __monitor_exit(czus0);
        return czle1;
    }
}

