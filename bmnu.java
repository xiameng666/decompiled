import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

public final class bmnu extends bark {
    public bmnu(Context context0, Looper looper0, baqv baqv0, aztu aztu0, aztv aztv0) {
        super(context0, looper0, 180, baqv0, aztu0, aztv0);
    }

    @Override  // baqp, azsz
    public final int a() {
        return 13000000;
    }

    @Override  // baqp
    protected final Bundle b() {
        Bundle bundle0 = new Bundle();
        bundle0.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.zeroparty.START");
        return bundle0;
    }

    @Override  // baqp
    protected final IInterface c(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService");
        return (iInterface0 instanceof bmoa) ? ((bmoa)iInterface0) : new bmny(iBinder0);
    }

    @Override  // baqp
    protected final String d() {
        return "com.google.android.gms.fido.fido2.internal.zeroparty.IFido2ZeroPartyService";
    }

    @Override  // baqp
    protected final String e() {
        return "com.google.android.gms.fido.fido2.zeroparty.START";
    }

    @Override  // baqp
    public final boolean g() {
        return true;
    }

    @Override  // baqp
    public final Feature[] h() {
        return blfo.E;
    }
}

