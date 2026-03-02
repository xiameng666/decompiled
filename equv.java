import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;

public final class equv implements azys {
    public final eqvc a;
    public final HandshakeData b;

    public equv(eqvc eqvc0, HandshakeData handshakeData0) {
        this.a = eqvc0;
        this.b = handshakeData0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        eqjr eqjr0 = (eqjr)object0;
        eqva eqva0 = new eqva(this.a, ((evqp)object1));
        eqin eqin0 = (eqin)eqjr0.H();
        ApiMetadata apiMetadata0 = cclr.a(eqjr0.r);
        eqin0.k(eqva0, this.b, apiMetadata0);
    }
}

