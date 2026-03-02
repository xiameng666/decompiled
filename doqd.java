import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.pay.GetPayCardArtRequest;

public final class doqd implements azys {
    public final GetPayCardArtRequest a;
    public final azts b;

    public doqd(azts azts0, GetPayCardArtRequest getPayCardArtRequest0) {
        this.b = azts0;
        this.a = getPayCardArtRequest0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        dota dota0 = (dota)object0;
        donm donm0 = (donm)dota0.H();
        dosf dosf0 = new dosf(this.b, ((evqp)object1));
        ApiMetadata apiMetadata0 = cclr.a(dota0.r);
        donm0.K(this.a, dosf0, apiMetadata0);
    }
}

