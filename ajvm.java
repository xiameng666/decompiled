import com.google.android.gms.auth.folsom.RecoveryRequest;
import com.google.android.gms.common.api.ApiMetadata;
import j..util.Objects;

public final class ajvm implements azys {
    final RecoveryRequest a;

    public ajvm(azts azts0, RecoveryRequest recoveryRequest0) {
        this.a = recoveryRequest0;
        Objects.requireNonNull(azts0);
        super();
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ajvn ajvn0 = (ajvn)object0;
        ajtq ajtq0 = new ajtq(this, ((evqp)object1));
        ajti ajti0 = (ajti)ajvn0.H();
        ApiMetadata apiMetadata0 = cclr.a(ajvn0.r);
        ajti0.z(ajtq0, this.a, apiMetadata0);
    }
}

