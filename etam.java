import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.tapandpay.internal.firstparty.GetLinkingTokenRequest;

public final class etam implements azys {
    public final GetLinkingTokenRequest a;
    public final azts b;

    public etam(azts azts0, GetLinkingTokenRequest getLinkingTokenRequest0) {
        this.b = azts0;
        this.a = getLinkingTokenRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        etav etav0 = (etav)object0;
        etab etab0 = (etab)etav0.H();
        etap etap0 = new etap(this.b, ((evqp)object1));
        ApiMetadata apiMetadata0 = cclr.a(etav0.r);
        etab0.c(this.a, etap0, apiMetadata0);
    }
}

