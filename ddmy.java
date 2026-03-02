import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetDiscoveredParams;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetDistanceChangedParams;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetLostParams;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetUpdatedParams;

public final class ddmy extends ddpb {
    private azyf a;

    public ddmy(azyf azyf0) {
        this.a = azyf0;
    }

    @Override  // ddpc
    public final void a(OnShareTargetDiscoveredParams onShareTargetDiscoveredParams0) {
        synchronized(this) {
            if(this.a == null) {
                return;
            }
            ddua ddua0 = ddua.a();
            ShareTarget shareTarget0 = onShareTargetDiscoveredParams0.a;
            azyf azyf0 = this.a;
            batl.s(azyf0);
            ddua0.b(shareTarget0, azyf0);
            azyf azyf1 = this.a;
            batl.s(azyf1);
            azyf1.b(new ddmu(this, onShareTargetDiscoveredParams0));
        }
    }

    @Override  // ddpc
    public final void c(OnShareTargetDistanceChangedParams onShareTargetDistanceChangedParams0) {
        synchronized(this) {
            azyf azyf0 = this.a;
            if(azyf0 == null) {
                return;
            }
            azyf0.b(new ddmw(this, onShareTargetDistanceChangedParams0));
        }
    }

    @Override  // ddpc
    public final void d(OnShareTargetLostParams onShareTargetLostParams0) {
        synchronized(this) {
            if(this.a == null) {
                return;
            }
            ddua ddua0 = ddua.a();
            ShareTarget shareTarget0 = onShareTargetLostParams0.a;
            azyf azyf0 = this.a;
            batl.s(azyf0);
            ddua0.d(shareTarget0, azyf0);
            azyf azyf1 = this.a;
            batl.s(azyf1);
            azyf1.b(new ddmv(this, onShareTargetLostParams0));
        }
    }

    @Override  // ddpc
    public final void e(OnShareTargetUpdatedParams onShareTargetUpdatedParams0) {
        synchronized(this) {
            if(this.a == null) {
                return;
            }
            ddua ddua0 = ddua.a();
            ShareTarget shareTarget0 = onShareTargetUpdatedParams0.a;
            azyf azyf0 = this.a;
            batl.s(azyf0);
            ddua0.f(shareTarget0, azyf0);
            azyf azyf1 = this.a;
            batl.s(azyf1);
            azyf1.b(new ddmx(this, onShareTargetUpdatedParams0));
        }
    }

    public final void f() {
        synchronized(this) {
            ddua ddua0 = ddua.a();
            azyf azyf0 = this.a;
            batl.s(azyf0);
            ddua0.c(azyf0);
            this.a = null;
        }
    }
}

