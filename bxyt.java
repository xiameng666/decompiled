import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.identitycredentials.SignalCredentialStateRequest;

public final class bxyt implements azys {
    public final SignalCredentialStateRequest a;

    public bxyt(SignalCredentialStateRequest signalCredentialStateRequest0) {
        this.a = signalCredentialStateRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        bxyr bxyr0 = (bxyr)object0;
        bxze bxze0 = new bxze(((evqp)object1));
        bxyq bxyq0 = (bxyq)bxyr0.H();
        ApiMetadata apiMetadata0 = cclr.a(bxyr0.r);
        bxyq0.o(bxze0, this.a, apiMetadata0);
    }
}

