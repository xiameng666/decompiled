import android.os.RemoteException;
import com.google.android.gms.common.api.ApiMetadata;

public final class atsf implements azys {
    public final atst a;
    public final String b;
    public final String c;

    public atsf(atst atst0, String s, String s1) {
        this.a = atst0;
        this.b = s;
        this.c = s1;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        aurd aurd0 = (aurd)object0;
        evqp evqp0 = (evqp)object1;
        atst atst0 = this.a;
        long v = atst0.g.incrementAndGet();
        atst0.f();
        try {
            atst0.q.put(Long.valueOf(v), evqp0);
            ApiMetadata apiMetadata0 = cclr.a(aurd0.r);
            ((aurk)aurd0.H()).hs(this.b, this.c, v, apiMetadata0);
        }
        catch(RemoteException remoteException0) {
            atst0.q.remove(Long.valueOf(v));
            evqp0.a(remoteException0);
        }
    }
}

