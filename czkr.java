import android.net.nsd.NsdServiceInfo;
import java.util.concurrent.atomic.AtomicReference;

public final class czkr implements jqv {
    public final AtomicReference a;
    public final cuqs b;
    public final NsdServiceInfo c;
    public final czkz d;

    public czkr(AtomicReference atomicReference0, cuqs cuqs0, NsdServiceInfo nsdServiceInfo0, czkz czkz0) {
        this.a = atomicReference0;
        this.b = cuqs0;
        this.c = nsdServiceInfo0;
        this.d = czkz0;
    }

    @Override  // jqv
    public final Object a(jqt jqt0) {
        czku czku0 = new czku(jqt0);
        this.a.set(czku0);
        cuqr cuqr0 = (cuqr)this.a.get();
        NsdServiceInfo nsdServiceInfo0 = this.c;
        if(!this.b.b(nsdServiceInfo0, cuqr0)) {
            cunf cunf0 = czkq.a.b();
            String s = nsdServiceInfo0.getServiceName();
            cunf0.i("%s discovered service %s, but failed to resolve service.", this.d.a.name(), s);
        }
        return "resolveService operation";
    }
}

