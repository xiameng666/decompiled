import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

public final class ezpy extends bark {
    public ezpy(Context context0, Looper looper0, baqv baqv0, aztu aztu0, aztv aztv0) {
        super(context0, looper0, 35, baqv0, aztu0, aztv0);
        batl.t(baqv0.a, "Must pass an account via UdcOptions or call GoogleApiClient.Builder.setAccount()");
    }

    @Override  // baqp, azsz
    public final int a() {
        return 12800000;
    }

    @Override  // baqp
    public final IInterface c(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.udc.internal.IUdcService");
        return (iInterface0 instanceof ezpq) ? ((ezpq)iInterface0) : new ezpo(iBinder0);
    }

    @Override  // baqp
    protected final String d() {
        return "com.google.android.gms.udc.internal.IUdcService";
    }

    @Override  // baqp
    protected final String e() {
        return "com.google.android.gms.udc.service.START";
    }

    @Override  // baqp
    public final boolean hg() {
        return true;
    }
}

