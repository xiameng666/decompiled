import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.identitycredentials.GetCredentialRequest;

public final class bxys implements azys {
    public final GetCredentialRequest a;

    public bxys(GetCredentialRequest getCredentialRequest0) {
        this.a = getCredentialRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        bxyr bxyr0 = (bxyr)object0;
        bxzb bxzb0 = new bxzb(((evqp)object1));
        bxyq bxyq0 = (bxyq)bxyr0.H();
        ApiMetadata apiMetadata0 = cclr.a(bxyr0.r);
        bxyq0.g(bxzb0, this.a, apiMetadata0);
    }
}

