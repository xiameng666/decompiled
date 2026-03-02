import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.multidevice.XdFeatureListenerOptions;

public final class ctcl implements azys {
    public final XdFeatureListenerOptions a;
    public final ctcj b;

    public ctcl(ctcj ctcj0, XdFeatureListenerOptions xdFeatureListenerOptions0) {
        this.b = ctcj0;
        this.a = xdFeatureListenerOptions0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ctbs ctbs0 = (ctbs)object0;
        ctcc ctcc0 = (ctcc)ctbs0.H();
        ctco ctco0 = new ctco(null, ((evqp)object1));
        ApiMetadata apiMetadata0 = cclr.a(ctbs0.r);
        ctcc0.b(ctco0, this.b, this.a, apiMetadata0);
    }
}

