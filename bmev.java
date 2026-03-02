import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.fido.fido2.api.common.HybridRequestData;

public final class bmev implements azys {
    public final bmfn a;
    public final HybridRequestData b;

    public bmev(bmfn bmfn0, HybridRequestData hybridRequestData0) {
        this.a = bmfn0;
        this.b = hybridRequestData0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        bmnu bmnu0 = (bmnu)object0;
        bmfe bmfe0 = new bmfe(this.a, ((evqp)object1));
        bmoa bmoa0 = (bmoa)bmnu0.H();
        ApiMetadata apiMetadata0 = cclr.a(bmnu0.r);
        bmoa0.f(bmfe0, this.b, apiMetadata0);
    }
}

