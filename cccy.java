import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.learning.InAppTrainerOptions;

final class cccy extends bark {
    private final baqv a;
    private final InAppTrainerOptions b;

    protected cccy(Context context0, Looper looper0, baqv baqv0, InAppTrainerOptions inAppTrainerOptions0, azvy azvy0, azyj azyj0) {
        super(context0, looper0, 0x8B, baqv0, azvy0, azyj0);
        this.a = baqv0;
        this.b = inAppTrainerOptions0;
    }

    @Override  // baqp, azsz
    public final int a() {
        return 203900000;
    }

    @Override  // baqp
    protected final Bundle b() {
        Bundle bundle0 = new Bundle();
        bundle0.putString("learning.client", this.a.e);
        bundle0.putByteArray("learning.options", bauc.n(this.b));
        return bundle0;
    }

    @Override  // baqp
    protected final IInterface c(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.learning.internal.IGmsTrainer");
        return (iInterface0 instanceof ccdg) ? ((ccdg)iInterface0) : new ccde(iBinder0);
    }

    @Override  // baqp
    protected final String d() {
        return "com.google.android.gms.learning.internal.IGmsTrainer";
    }

    @Override  // baqp
    protected final String e() {
        return "com.google.android.gms.learning.trainer.v2.START";
    }

    @Override  // baqp
    protected final boolean f() {
        return true;
    }

    @Override  // baqp
    public final Feature[] h() {
        return atqd.b;
    }
}

