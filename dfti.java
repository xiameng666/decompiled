import com.google.android.gms.nearby.sharing.internal.OnShareTargetDiscoveredParams;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetDistanceChangedParams;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetLostParams;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetUpdatedParams;

public final class dfti extends ddpb {
    final dftj a;
    final dclv b;

    public dfti(dftj dftj0, dclv dclv0) {
        this.a = dftj0;
        this.b = dclv0;
        super();
    }

    @Override  // ddpc
    public final void a(OnShareTargetDiscoveredParams onShareTargetDiscoveredParams0) {
        ibuq.f(onShareTargetDiscoveredParams0, "params");
        dfte dfte0 = new dfte(this.a, onShareTargetDiscoveredParams0, this.b);
        this.a.d.a(dfte0);
    }

    @Override  // ddpc
    public final void c(OnShareTargetDistanceChangedParams onShareTargetDistanceChangedParams0) {
        ibuq.f(onShareTargetDistanceChangedParams0, "params");
        dftg dftg0 = new dftg(this.a, onShareTargetDistanceChangedParams0, this.b);
        this.a.d.a(dftg0);
    }

    @Override  // ddpc
    public final void d(OnShareTargetLostParams onShareTargetLostParams0) {
        ibuq.f(onShareTargetLostParams0, "params");
        dfth dfth0 = new dfth(this.a, onShareTargetLostParams0, this.b);
        this.a.d.a(dfth0);
    }

    @Override  // ddpc
    public final void e(OnShareTargetUpdatedParams onShareTargetUpdatedParams0) {
        ibuq.f(onShareTargetUpdatedParams0, "params");
        dftf dftf0 = new dftf(this.a, onShareTargetUpdatedParams0, this.b);
        this.a.d.a(dftf0);
    }
}

