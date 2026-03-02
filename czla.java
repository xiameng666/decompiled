import android.net.nsd.NsdServiceInfo;
import android.text.TextUtils;
import java.net.InetAddress;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class czla implements cuqq {
    private final cuqs a;
    private final NsdServiceInfo b;
    private final gyxl c;
    private final long d;
    private final long e;
    private final gmcu f;
    private final gmcu g;
    private final czlb h;

    public czla(cuqs cuqs0, NsdServiceInfo nsdServiceInfo0, gyxl gyxl0, long v, long v1, czlb czlb0) {
        this.f = new gmcu();
        this.g = new gmcu();
        this.a = cuqs0;
        this.b = nsdServiceInfo0;
        this.c = gyxl0;
        this.d = v;
        this.e = v1;
        this.h = czlb0;
    }

    public final void a(String s) {
        if(this.a.d(this)) {
            this.c(s);
            return;
        }
        czke.m(this.c, s, 3, gymv.a, gymd.bB);
    }

    public final boolean b(String s) {
        gymd gymd0;
        NsdServiceInfo nsdServiceInfo0 = this.b;
        if(!this.a.g(nsdServiceInfo0, this)) {
            gyxl gyxl0 = this.c;
            gymp gymp0 = gymp.k;
            if(nsdServiceInfo0.getPort() <= 0) {
                gymd0 = gymd.E;
            }
            else if(TextUtils.isEmpty(nsdServiceInfo0.getServiceName())) {
                gymd0 = gymd.F;
            }
            else {
                gymd0 = TextUtils.isEmpty(nsdServiceInfo0.getServiceType()) ? gymd.G : gymd.a;
            }
            czke.m(gyxl0, s, 2, gymp0, gymd0);
            return false;
        }
        if(this.d(s)) {
            return true;
        }
        this.a(s);
        return false;
    }

    private final void c(String s) {
        try {
            this.g.v(this.e, TimeUnit.SECONDS);
        }
        catch(InterruptedException unused_ex) {
            czke.m(this.c, s, 3, gymv.a, gymd.t);
            Thread.currentThread().interrupt();
        }
        catch(ExecutionException unused_ex) {
            czke.m(this.c, s, 3, gymv.a, gymd.u);
        }
        catch(TimeoutException unused_ex) {
            czke.m(this.c, s, 3, gymv.a, gymd.y);
        }
    }

    private final boolean d(String s) {
        try {
            this.f.v(this.d, TimeUnit.SECONDS);
            return true;
        }
        catch(InterruptedException unused_ex) {
            czke.m(this.c, s, 2, gymp.k, gymd.t);
            Thread.currentThread().interrupt();
            return false;
        }
        catch(ExecutionException unused_ex) {
            czke.m(this.c, s, 2, gymp.k, gymd.u);
            return false;
        }
        catch(TimeoutException unused_ex) {
            czke.m(this.c, s, 2, gymp.k, gymd.y);
            return false;
        }
    }

    @Override  // android.net.nsd.NsdManager$RegistrationListener
    public final void onRegistrationFailed(NsdServiceInfo nsdServiceInfo0, int v) {
        Exception exception0 = new Exception("Failed to register service: " + czkj.a(v));
        this.f.r(exception0);
    }

    @Override  // android.net.nsd.NsdManager$RegistrationListener
    public final void onServiceRegistered(NsdServiceInfo nsdServiceInfo0) {
        NsdServiceInfo nsdServiceInfo1 = this.b;
        if(!nsdServiceInfo1.getServiceName().equals(nsdServiceInfo0.getServiceName())) {
            cunf cunf0 = czkq.a.b();
            String s = nsdServiceInfo1.getServiceName();
            String s1 = nsdServiceInfo0.getServiceName();
            cunf0.j("%s failed to register service because another device is already using that service name (expected:%s, actual:%s).", this.c.name(), s, s1);
            Exception exception0 = new Exception("Failed to register service because another device is already using that service name.");
            this.f.r(exception0);
            return;
        }
        this.f.q(null);
        cunf cunf1 = czkq.a.b();
        String s2 = nsdServiceInfo0.getServiceName();
        String s3 = nsdServiceInfo0.getServiceType();
        InetAddress inetAddress0 = nsdServiceInfo0.getHost();
        Integer integer0 = nsdServiceInfo0.getPort();
        cunf1.l("%s registered service name:%s type:%s at ip:%s port:%s", this.c.name(), s2, s3, inetAddress0, integer0);
        czlb czlb0 = this.h;
        if(czlb0 != null) {
            czlb0.a(nsdServiceInfo0);
        }
    }

    @Override  // android.net.nsd.NsdManager$RegistrationListener
    public final void onServiceUnregistered(NsdServiceInfo nsdServiceInfo0) {
        this.g.q(null);
        czlb czlb0 = this.h;
        if(czlb0 != null) {
            czlb0.b(nsdServiceInfo0);
        }
    }

    @Override  // android.net.nsd.NsdManager$RegistrationListener
    public final void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo0, int v) {
        Exception exception0 = new Exception("Failed to unregister service: " + czkj.a(v));
        this.g.r(exception0);
    }
}

