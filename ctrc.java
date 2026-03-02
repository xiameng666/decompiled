import com.google.android.gms.dtdi.core.ChannelInfo;
import com.google.android.gms.dtdi.core.ConnectionCapabilities;

public final class ctrc implements ibts {
    public final ctrq a;

    public ctrc(ctrq ctrq0) {
        this.a = ctrq0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ctrq ctrq0 = this.a;
        synchronized(ctrq0) {
            ctrq0.e = (ChannelInfo)object0;
        }
        icck icck0 = ctrq0.f;
        if(icck0 != null) {
            iccl.i(icck0);
        }
        ctrq0.f = iccl.b(ctrq0.c);
        icck icck1 = ctrq0.f;
        if(icck1 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        icbb.b(icck1, null, null, new ctrm(ctrq0, ((ChannelInfo)object0), null), 3);
        ConnectionCapabilities connectionCapabilities0 = new ConnectionCapabilities(0);
        evql evql0 = ctrq0.b.c(ctrq0.a.a, connectionCapabilities0, ctrq0.g);
        evql0.b(new ctra(new ctqz()));
        evql0.A(new ctrb(ctrq0));
        return ibom.a;
    }
}

