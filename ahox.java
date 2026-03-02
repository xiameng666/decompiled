import com.google.android.gms.auth.api.fido.RegisteredCredentialData;
import com.google.android.gms.common.api.ApiMetadata;

public final class ahox implements azys {
    public final ahpc a;
    public final RegisteredCredentialData b;

    public ahox(ahpc ahpc0, RegisteredCredentialData registeredCredentialData0) {
        this.a = ahpc0;
        this.b = registeredCredentialData0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ahng ahng0 = (ahng)object0;
        ahpb ahpb0 = new ahpb(this.a, ((evqp)object1));
        ahnn ahnn0 = (ahnn)ahng0.H();
        ApiMetadata apiMetadata0 = cclr.a(ahng0.r);
        ahnn0.c(ahpb0, this.b, apiMetadata0);
    }
}

