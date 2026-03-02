import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.tapandpay.issuer.ViewTokenRequest;

public final class etaf implements azys {
    public final ViewTokenRequest a;
    public final azts b;

    public etaf(azts azts0, ViewTokenRequest viewTokenRequest0) {
        this.b = azts0;
        this.a = viewTokenRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        etau etau0 = (etau)object0;
        eszv eszv0 = (eszv)etau0.H();
        etak etak0 = new etak(this.b, ((evqp)object1));
        ApiMetadata apiMetadata0 = cclr.a(etau0.r);
        eszv0.as(this.a, etak0, apiMetadata0);
    }
}

