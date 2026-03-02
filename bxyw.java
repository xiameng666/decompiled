import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.identitycredentials.ClearRegistryRequest;

public final class bxyw implements azys {
    public final ClearRegistryRequest a;

    public bxyw(ClearRegistryRequest clearRegistryRequest0) {
        this.a = clearRegistryRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        bxyr bxyr0 = (bxyr)object0;
        bxyz bxyz0 = new bxyz(((evqp)object1));
        bxyq bxyq0 = (bxyq)bxyr0.H();
        ApiMetadata apiMetadata0 = cclr.a(bxyr0.r);
        bxyq0.d(bxyz0, this.a, apiMetadata0);
    }
}

