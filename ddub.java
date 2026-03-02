import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

public final class ddub extends bark {
    private final dcnc a;

    public ddub(Context context0, Looper looper0, aztu aztu0, aztv aztv0, baqv baqv0, dcnc dcnc0) {
        super(context0, looper0, 0xC2, baqv0, aztu0, aztv0);
        fpjb.f(context0);
        this.a = dcnc0;
        czho.d(context0.getCacheDir());
    }

    @Override  // baqp, azsz
    public final boolean C() {
        return cumi.i(this.r);
    }

    @Override  // baqp
    public final void P(int v) {
        if(v == 1) {
            ddun.a().e();
            ddua.a().e();
            dduf.a().b();
            v = 1;
        }
        super.P(v);
    }

    @Override  // baqp, azsz
    public final int a() {
        return 15000000;
    }

    @Override  // baqp
    protected final Bundle b() {
        Bundle bundle0 = new Bundle();
        bundle0.putInt("vendor_id", this.a.b);
        bundle0.putInt("vendor_flags", 0);
        return bundle0;
    }

    @Override  // baqp
    protected final IInterface c(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
        return (iInterface0 instanceof ddot) ? ((ddot)iInterface0) : new ddor(iBinder0);
    }

    @Override  // baqp
    protected final String d() {
        return "com.google.android.gms.nearby.sharing.internal.INearbySharingService";
    }

    @Override  // baqp
    protected final String e() {
        return "com.google.android.gms.nearby.sharing.START_SERVICE";
    }

    @Override  // baqp
    public final boolean g() {
        return true;
    }

    @Override  // baqp
    public final Feature[] h() {
        return new Feature[]{cumh.a, cumh.b, cumh.c, cumh.d, cumh.e, cumh.G, cumh.I, cumh.H, cumh.R, cumh.S, cumh.T, cumh.U, cumh.V, cumh.W, cumh.X, cumh.Y, cumh.Z, cumh.aa, cumh.ab, cumh.ac, cumh.ad};
    }
}

