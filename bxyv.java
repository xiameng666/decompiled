import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.identitycredentials.CreateCredentialRequest;

public final class bxyv implements azys {
    public final CreateCredentialRequest a;

    public bxyv(CreateCredentialRequest createCredentialRequest0) {
        this.a = createCredentialRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        bxyr bxyr0 = (bxyr)object0;
        bxza bxza0 = new bxza(((evqp)object1));
        bxyq bxyq0 = (bxyq)bxyr0.H();
        ApiMetadata apiMetadata0 = cclr.a(bxyr0.r);
        bxyq0.e(bxza0, this.a, apiMetadata0);
    }
}

