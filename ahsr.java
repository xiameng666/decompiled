import android.os.Parcel;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class ahsr extends wby implements ahss {
    final evqp a;

    public ahsr() {
        super("com.google.android.gms.auth.api.identity.internal.IGetCachedSaveAccountLinkingTokenRequestCallback");
    }

    public ahsr(ahwl ahwl0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(ahwl0);
        super("com.google.android.gms.auth.api.identity.internal.IGetCachedSaveAccountLinkingTokenRequestCallback");
    }

    @Override  // ahss
    public final void a(Status status0, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest0) {
        azzf.b(status0, saveAccountLinkingTokenRequest0, this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest0 = (SaveAccountLinkingTokenRequest)wbz.a(parcel0, SaveAccountLinkingTokenRequest.CREATOR);
            ahsr.gr(parcel0);
            this.a(status0, saveAccountLinkingTokenRequest0);
            return true;
        }
        return false;
    }
}

