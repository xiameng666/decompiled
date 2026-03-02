import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

public final class ahug extends bark {
    private final Bundle a;

    public ahug(Context context0, Looper looper0, baqv baqv0, ahqf ahqf0, azvy azvy0, azyj azyj0) {
        super(context0, looper0, 0xD5, baqv0, azvy0, azyj0);
        batl.s(ahqf0);
        Bundle bundle0 = new Bundle();
        bundle0.putString("session_id", ahqf0.a);
        this.a = bundle0;
    }

    @Override  // baqp, azsz
    public final int a() {
        return 17895000;
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
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService");
        return (iInterface0 instanceof ahtj) ? ((ahtj)iInterface0) : new ahth(iBinder0);
    }

    @Override  // baqp
    protected final String d() {
        return "com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService";
    }

    @Override  // baqp
    protected final String e() {
        return "com.google.android.gms.auth.api.identity.service.gis_internal.START";
    }

    @Override  // baqp
    protected final boolean f() {
        return true;
    }

    @Override  // baqp
    public final boolean g() {
        return true;
    }
}

