import android.util.Log;
import com.google.android.gms.wearable.internal.AddLocalCapabilityResponse;
import j..util.Objects;

final class ffiy extends ffee {
    final String c;
    final fdiy d;
    final fflv e;

    public ffiy(fflv fflv0, String s, String s1, fdiy fdiy0) {
        this.c = s1;
        this.d = fdiy0;
        Objects.requireNonNull(fflv0);
        this.e = fflv0;
        super(s);
    }

    @Override  // ffee
    public final void a() {
        try {
            fdpl fdpl0 = this.e.y.a(this.e.e, this.c);
            AddLocalCapabilityResponse addLocalCapabilityResponse0 = new AddLocalCapabilityResponse(this.e.j.b(fdpl0, fdqi.b, this.c));
            this.d.b(addLocalCapabilityResponse0);
        }
        catch(Exception exception0) {
            Log.e("WearableService", "addLocalCapability: exception during processing", exception0);
            AddLocalCapabilityResponse addLocalCapabilityResponse1 = new AddLocalCapabilityResponse(8);
            this.d.b(addLocalCapabilityResponse1);
        }
    }
}

