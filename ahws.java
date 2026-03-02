import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;

public final class ahws extends bark {
    private final Bundle a;

    public ahws(Context context0, Looper looper0, baqv baqv0, adsz adsz0, azvy azvy0, azyj azyj0) {
        super(context0, looper0, 16, baqv0, azvy0, azyj0);
        this.a = adsz0 == null ? new Bundle() : new Bundle(adsz0.a);
    }

    @Override  // baqp, azsz
    public final int a() {
        return 12451000;
    }

    @Override  // baqp
    protected final Bundle b() {
        return this.a;
    }

    @Override  // baqp
    protected final IInterface c(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return (iInterface0 instanceof ahwy) ? ((ahwy)iInterface0) : new ahww(iBinder0);
    }

    @Override  // baqp
    protected final String d() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override  // baqp
    protected final String e() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override  // baqp
    public final boolean g() {
        return true;
    }

    @Override  // baqp, azsz
    public final boolean gb() {
        baqv baqv0 = this.K;
        if(!TextUtils.isEmpty((baqv0.a == null ? null : baqv0.a.name))) {
            if(((baqu)baqv0.d.get(adsx.a)) == null) {
                return !baqv0.b.isEmpty();
            }
            throw null;
        }
        return false;
    }
}

