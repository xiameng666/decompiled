import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.pay.SetSortOrderRequest;

public final class dope implements azys {
    public final SetSortOrderRequest a;
    public final azts b;

    public dope(azts azts0, SetSortOrderRequest setSortOrderRequest0) {
        this.b = azts0;
        this.a = setSortOrderRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        dota dota0 = (dota)object0;
        donm donm0 = (donm)dota0.H();
        dory dory0 = new dory(this.b, ((evqp)object1));
        ApiMetadata apiMetadata0 = cclr.a(dota0.r);
        donm0.aK(this.a, dory0, apiMetadata0);
    }
}

