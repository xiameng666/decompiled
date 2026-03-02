import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.pay.SelectPayGlobalActionCardRequest;

public final class dopz implements azys {
    public final SelectPayGlobalActionCardRequest a;
    public final azts b;

    public dopz(azts azts0, SelectPayGlobalActionCardRequest selectPayGlobalActionCardRequest0) {
        this.b = azts0;
        this.a = selectPayGlobalActionCardRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        dota dota0 = (dota)object0;
        donm donm0 = (donm)dota0.H();
        dosi dosi0 = new dosi(this.b, ((evqp)object1));
        ApiMetadata apiMetadata0 = cclr.a(dota0.r);
        donm0.aD(this.a, dosi0, apiMetadata0);
    }
}

