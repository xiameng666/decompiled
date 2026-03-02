import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.pay.SetWalletItemSurfacingEnabledRequest;

public final class dopy implements azys {
    public final SetWalletItemSurfacingEnabledRequest a;
    public final azts b;

    public dopy(azts azts0, SetWalletItemSurfacingEnabledRequest setWalletItemSurfacingEnabledRequest0) {
        this.b = azts0;
        this.a = setWalletItemSurfacingEnabledRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        dota dota0 = (dota)object0;
        donm donm0 = (donm)dota0.H();
        dosj dosj0 = new dosj(this.b, ((evqp)object1));
        ApiMetadata apiMetadata0 = cclr.a(dota0.r);
        donm0.aM(this.a, dosj0, apiMetadata0);
    }
}

