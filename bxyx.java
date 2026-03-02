import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.identitycredentials.RegisterCreationOptionsRequest;

public final class bxyx implements azys {
    public final RegisterCreationOptionsRequest a;

    public bxyx(RegisterCreationOptionsRequest registerCreationOptionsRequest0) {
        this.a = registerCreationOptionsRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        bxyr bxyr0 = (bxyr)object0;
        bxzc bxzc0 = new bxzc(((evqp)object1));
        bxyq bxyq0 = (bxyq)bxyr0.H();
        ApiMetadata apiMetadata0 = cclr.a(bxyr0.r);
        bxyq0.l(bxzc0, this.a, apiMetadata0);
    }
}

