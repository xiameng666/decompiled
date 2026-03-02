import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.pay.AccessibleImage;
import com.google.android.gms.pay.GetTransitCardsResponse;
import com.google.android.gms.pay.TransitCard;

public final class dvfp {
    public static final bboh a;
    public static final GetTransitCardsResponse b;
    public final dvfo c;
    public final gged_interceptors d;
    public final dvfs e;
    public final Context f;
    private final tyb g;

    static {
        dvfp.a = bboh.b("Pay", bbcu.cZ);
        GetTransitCardsResponse getTransitCardsResponse0 = new GetTransitCardsResponse();
        getTransitCardsResponse0.a = new TransitCard[0];
        dvfp.b = getTransitCardsResponse0;
    }

    public dvfp(tyb tyb0, dvfo dvfo0, gged_interceptors gged0, Context context0, dvfs dvfs0) {
        this.g = tyb0;
        this.c = dvfo0;
        this.d = gged0;
        this.f = context0;
        this.e = dvfs0;
    }

    public final Bitmap a(String s) {
        return (Bitmap)this.g.b().h(s).l().get();
    }

    public final AccessibleImage b(hkpk hkpk0) {
        AccessibleImage accessibleImage0 = new AccessibleImage();
        accessibleImage0.a = hkpk0.b;
        accessibleImage0.b = hkpk0.c;
        accessibleImage0.c = hkpk0.d;
        return accessibleImage0;
    }
}

