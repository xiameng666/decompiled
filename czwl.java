import android.app.PendingIntent.CanceledException;
import android.app.PendingIntent;
import java.util.Map;
import java.util.Set;
import jeb.synthetic.FIN;

public final class czwl {
    private static czwl a;
    private final Map b;
    private final Map c;
    private final Map d;
    private final Map e;

    private czwl() {
        this.b = new bxd();
        this.c = new bxd();
        this.d = new bxd();
        this.e = new bxd();
    }

    public final czle a(String s, czwk czwk0) {
        synchronized(this) {
            if(!this.c.containsKey(s)) {
                return new czle(Boolean.valueOf(false), gyxo.cR);
            }
            czlh czlh0 = (czlh)this.d.get(s);
            if(czlh0 == null) {
                return new czle(Boolean.valueOf(false), gyxo.cR);
            }
            czlj czlj0 = new czlj(czlh0.a, czlh0.b, czwk0);
            czlh0.a.b(czlj0);
        }
        return new czle(Boolean.valueOf(true), gyxo.b);
    }

    public static czwl b() {
        synchronized(czwl.class) {
            if(czwl.a == null) {
                czwl.a = new czwl();
            }
        }
        return czwl.a;
    }

    public final Set c() {
        Set set0;
        synchronized(this) {
            set0 = new bxf(this.c.values());
        }
        return set0;
    }

    public final void d(String s, String s1, byte[] arr_b) {
        synchronized(this) {
            cvmn cvmn0 = (cvmn)this.e.get(s);
            if(cvmn0 == null) {
                return;
            }
            cvmm cvmm0 = new cvmm(cvmn0, s1, arr_b);
            cvmn0.b.W(cvmm0);
        }
    }

    public final void e(String s) {
        synchronized(this) {
            this.c.remove(s);
            this.d.remove(s);
            this.e.remove(s);
        }
    }

    public final void f(String s) {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        PendingIntent pendingIntent0 = (PendingIntent)this.b.get(s);
        if(pendingIntent0 == null) {
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        try {
            pendingIntent0.send();
            FIN.finallyExec$NT(v);
        }
        catch(PendingIntent.CanceledException pendingIntent$CanceledException0) {
            czkq.a.c().f(pendingIntent$CanceledException0).h("Error sending PendingIntent %s", pendingIntent0);
            FIN.finallyExec$NT(v);
        }
    }

    public final byte[] g(String s) {
        byte[] arr_b;
        synchronized(this) {
            arr_b = (byte[])this.c.get(s);
        }
        return arr_b;
    }

    public final void h(String s, cvmn cvmn0, gyua gyua0, czlh czlh0) {
        synchronized(this) {
            byte[] arr_b = gyua0.toBytesArray();
            this.c.put(s, arr_b);
            this.d.put(s, czlh0);
            this.e.put(s, cvmn0);
        }
    }

    public final void i(PendingIntent pendingIntent0) {
        synchronized(this) {
            this.b.put("NearbySharing", pendingIntent0);
        }
    }
}

