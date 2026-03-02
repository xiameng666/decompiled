import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.common.api.ApiMetadata;

public final class ahum implements azys {
    public final ahuo a;
    public final SavePasswordRequest b;

    public ahum(ahuo ahuo0, SavePasswordRequest savePasswordRequest0) {
        this.a = ahuo0;
        this.b = savePasswordRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ahra ahra0 = (ahra)object0;
        ahtx ahtx0 = new ahtx(this.a, ((evqp)object1));
        ahrx ahrx0 = (ahrx)ahra0.H();
        ApiMetadata apiMetadata0 = cclr.a(ahra0.r);
        ahrx0.a(ahtx0, this.b, apiMetadata0);
    }
}

