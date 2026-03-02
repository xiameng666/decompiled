import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.tapandpay.internal.firstparty.GetTokenDetailsRequest;

public final class etcu implements azys {
    public final etgl a;
    public final GetTokenDetailsRequest b;

    public etcu(etgl etgl0, GetTokenDetailsRequest getTokenDetailsRequest0) {
        this.a = etgl0;
        this.b = getTokenDetailsRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        etau etau0 = (etau)object0;
        eszv eszv0 = (eszv)etau0.H();
        etfu etfu0 = new etfu(this.a, ((evqp)object1));
        ApiMetadata apiMetadata0 = cclr.a(etau0.r);
        eszv0.G(this.b, etfu0, apiMetadata0);
    }
}

