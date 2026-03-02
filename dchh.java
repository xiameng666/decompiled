import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.RangingData;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetDiscoveredParams;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetDistanceChangedParams;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetLostParams;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetUpdatedParams;
import j..util.Objects;
import java.util.Map;

final class dchh implements dclv {
    final ddpc a;
    final dchp b;
    private final Map c;
    private final cumy d;

    public dchh(dchp dchp0, ddpc ddpc0) {
        this.a = ddpc0;
        Objects.requireNonNull(dchp0);
        this.b = dchp0;
        super();
        this.c = new bxd();
        this.d = new cumy(((int)hvqs.Q()));
    }

    @Override  // dclv
    public final void b(ShareTarget shareTarget0, int v, RangingData rangingData0) {
        if((this.b.c & 1) != 0 && shareTarget0.r == this.b.b) {
            return;
        }
        if(hvrc.G()) {
            this.d.j(Long.valueOf(shareTarget0.a), shareTarget0);
        }
        try {
            OnShareTargetDistanceChangedParams onShareTargetDistanceChangedParams0 = new OnShareTargetDistanceChangedParams();
            onShareTargetDistanceChangedParams0.a = shareTarget0;
            onShareTargetDistanceChangedParams0.b = v;
            if(rangingData0 != null) {
                onShareTargetDistanceChangedParams0.c = rangingData0;
            }
            this.a.c(onShareTargetDistanceChangedParams0);
        }
        catch(RemoteException remoteException0) {
            dcvz.a.e().f(remoteException0).p("Failed to invoke onShareTargetDistanceChanged on registered share sheet.", new Object[0]);
        }
    }

    @Override  // dclv
    public final void c(ShareTarget shareTarget0) {
        if((this.b.c & 1) != 0 && shareTarget0.r == this.b.b) {
            return;
        }
        if(hvrc.G()) {
            curq curq0 = new curq();
            this.d.c(Long.valueOf(shareTarget0.a), curq0);
        }
        else {
            this.c.remove(Long.valueOf(shareTarget0.a));
        }
        try {
            OnShareTargetLostParams onShareTargetLostParams0 = new OnShareTargetLostParams();
            onShareTargetLostParams0.a = shareTarget0;
            this.a.d(onShareTargetLostParams0);
        }
        catch(RemoteException remoteException0) {
            dcvz.a.e().f(remoteException0).p("Failed to invoke onShareTargetLost on registered share sheet.", new Object[0]);
        }
    }

    @Override  // dclv
    public final void d(ShareTarget shareTarget0) {
        ShareTarget shareTarget1;
        if((this.b.c & 1) != 0 && shareTarget0.r == this.b.b) {
            if(hvrc.G()) {
                cumy cumy0 = this.d;
                Long long0 = (long)shareTarget0.a;
                shareTarget1 = cumy0.k(long0) ? ((ShareTarget)cumy0.c(long0, new curq())) : null;
            }
            else {
                shareTarget1 = (ShareTarget)this.c.remove(Long.valueOf(shareTarget0.a));
            }
            if(hvrc.a.b().ap() && shareTarget1 != null) {
                try {
                    OnShareTargetLostParams onShareTargetLostParams0 = new OnShareTargetLostParams();
                    onShareTargetLostParams0.a = shareTarget1;
                    this.a.d(onShareTargetLostParams0);
                    return;
                }
                catch(RemoteException remoteException0) {
                    dcvz.a.e().f(remoteException0).p("Failed to invoke onShareTargetLost on registered share sheet.", new Object[0]);
                }
            }
            return;
        }
        if(hvrc.G()) {
            this.d.j(Long.valueOf(shareTarget0.a), shareTarget0);
        }
        else {
            this.c.put(Long.valueOf(shareTarget0.a), shareTarget0);
        }
        try {
            OnShareTargetUpdatedParams onShareTargetUpdatedParams0 = new OnShareTargetUpdatedParams();
            onShareTargetUpdatedParams0.a = shareTarget0;
            this.a.e(onShareTargetUpdatedParams0);
        }
        catch(RemoteException remoteException1) {
            dcvz.a.e().f(remoteException1).p("Failed to invoke onShareTargetUpdated on registered share sheet.", new Object[0]);
        }
    }

    @Override  // dclv
    public final void jJ(ShareTarget shareTarget0) {
        dchp dchp0 = this.b;
        if((dchp0.c & 1) != 0 && shareTarget0.r == dchp0.b) {
            return;
        }
        Uri uri0 = shareTarget0.c;
        if(uri0 != null) {
            dchp0.e.aa.b(dchp0.a, uri0);
        }
        if(hvrc.G()) {
            curq curq0 = new curq();
            this.d.i(Long.valueOf(shareTarget0.a), shareTarget0, curq0);
        }
        else {
            this.c.put(Long.valueOf(shareTarget0.a), shareTarget0);
        }
        try {
            OnShareTargetDiscoveredParams onShareTargetDiscoveredParams0 = new OnShareTargetDiscoveredParams();
            onShareTargetDiscoveredParams0.a = shareTarget0;
            this.a.a(onShareTargetDiscoveredParams0);
        }
        catch(RemoteException remoteException0) {
            dcvz.a.e().f(remoteException0).p("Failed to invoke onShareTargetDiscovered on registered share sheet.", new Object[0]);
        }
    }
}

