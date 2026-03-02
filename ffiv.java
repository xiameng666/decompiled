import android.util.Log;
import com.google.android.gms.wearable.internal.GetCapabilityResponse;
import j..util.Objects;
import java.util.Set;

final class ffiv extends ffee {
    final String c;
    final int d;
    final fdiy e;
    final fflv f;

    public ffiv(fflv fflv0, String s, String s1, int v, fdiy fdiy0) {
        this.c = s1;
        this.d = v;
        this.e = fdiy0;
        Objects.requireNonNull(fflv0);
        this.f = fflv0;
        super(s);
    }

    @Override  // ffee
    public final void a() {
        try {
            Set set0 = this.f.j.v(this.f.e, this.c, this.d);
            GetCapabilityResponse getCapabilityResponse0 = new GetCapabilityResponse(0, ffel.a(this.c, set0));
            this.e.p(getCapabilityResponse0);
        }
        catch(Exception exception0) {
            Log.e("WearableService", "getConnectedCapability: exception during processing", exception0);
            GetCapabilityResponse getCapabilityResponse1 = new GetCapabilityResponse(8, null);
            this.e.p(getCapabilityResponse1);
        }
    }
}

