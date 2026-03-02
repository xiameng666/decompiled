import android.util.Log;
import com.google.android.gms.wearable.internal.RemoveLocalCapabilityResponse;
import j..util.Objects;

final class ffiz extends ffee {
    final String c;
    final fdiy d;
    final fflv e;

    public ffiz(fflv fflv0, String s, String s1, fdiy fdiy0) {
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
            RemoveLocalCapabilityResponse removeLocalCapabilityResponse0 = new RemoveLocalCapabilityResponse(this.e.j.c(fdpl0, fdqi.b, this.c));
            this.d.Q(removeLocalCapabilityResponse0);
        }
        catch(Exception exception0) {
            Log.e("WearableService", "removeLocalCapability: exception during processing", exception0);
            RemoveLocalCapabilityResponse removeLocalCapabilityResponse1 = new RemoveLocalCapabilityResponse(8);
            this.d.Q(removeLocalCapabilityResponse1);
        }
    }
}

