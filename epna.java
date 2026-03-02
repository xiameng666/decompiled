import android.content.Context;
import com.android.location.provider.SignificantPlaceProvider;
import com.google.android.gms.significantplaces.SignificantPlacesRequest;

public final class epna extends SignificantPlaceProvider {
    public final Context a;
    public final icck b;
    public final ibrt c;
    public final ibts d;
    public icck e;
    private final azts f;

    public epna(Context context0, icck icck0) {
        ibuq.f(icck0, "scope");
        azts azts0 = new azts(context0, null);
        ibrt ibrt0 = cclv.c(clhr.b);
        ibuq.f(icck0, "scope");
        ibuq.f(ibrt0, "coroutineContext");
        super();
        this.a = context0;
        this.b = icck0;
        this.f = azts0;
        this.c = ibrt0;
        this.d = new epmp(this);
    }

    public final void a(boolean z) {
        if(z) {
            if(this.e != null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this.e = iccl.b(cclw.f);
            SignificantPlacesRequest significantPlacesRequest0 = new SignificantPlacesRequest(cjar.c("android", 1000, -1, null, null, 120));
            icjr icjr0 = new icjr(new iclv(new ichv(new ephj(this.f, significantPlacesRequest0, null)), new epmq(this, null)), new epmr(null));
            icck icck0 = this.e;
            ibuq.c(icck0);
            icir.d(icjr0, icck0);
            return;
        }
        icck icck1 = this.e;
        if(icck1 != null) {
            iccl.i(icck1);
        }
        this.e = null;
        this.d.a(Boolean.valueOf(false));
    }

    public final void onSignificantPlaceCheck() {
    }
}

