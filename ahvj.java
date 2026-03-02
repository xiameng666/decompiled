import com.google.android.gms.auth.api.identity.CallerVerificationRequest;
import com.google.android.gms.common.api.ApiMetadata;

public final class ahvj implements azys {
    public final ahwl a;
    public final CallerVerificationRequest b;

    public ahvj(ahwl ahwl0, CallerVerificationRequest callerVerificationRequest0) {
        this.a = ahwl0;
        this.b = callerVerificationRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ahug ahug0 = (ahug)object0;
        ahwf ahwf0 = new ahwf(this.a, ((evqp)object1));
        ahtj ahtj0 = (ahtj)ahug0.H();
        ApiMetadata apiMetadata0 = cclr.a(ahug0.r);
        ahtj0.I(ahwf0, this.b, apiMetadata0);
    }
}

