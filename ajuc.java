import com.google.android.gms.auth.folsom.RecoveryRequest;
import com.google.android.gms.common.api.ApiMetadata;

public final class ajuc implements azys {
    public final RecoveryRequest a;
    public final azts b;

    public ajuc(azts azts0, RecoveryRequest recoveryRequest0) {
        this.b = azts0;
        this.a = recoveryRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ajvn ajvn0 = (ajvn)object0;
        ajuv ajuv0 = new ajuv(this.b, ((evqp)object1));
        ajti ajti0 = (ajti)ajvn0.H();
        ApiMetadata apiMetadata0 = cclr.a(ajvn0.r);
        ajti0.f(ajuv0, this.a, apiMetadata0);
    }
}

