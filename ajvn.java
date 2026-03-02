import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

public final class ajvn extends bark {
    private final ajqp a;

    public ajvn(Context context0, Looper looper0, baqv baqv0, azvy azvy0, azyj azyj0, ajqp ajqp0) {
        super(context0, looper0, 0xAC, baqv0, azvy0, azyj0);
        this.a = ajqp0;
    }

    @Override  // baqp, azsz
    public final int a() {
        return 19609000;
    }

    @Override  // baqp
    protected final Bundle b() {
        Bundle bundle0 = new Bundle();
        bundle0.putString("SECURITY_DOMAIN", this.a.a);
        bundle0.putString("UTM_SOURCE", this.a.b);
        bundle0.putString("UTM_MEDIUM", this.a.c);
        bundle0.putString("UTM_CAMPAIGN", this.a.d);
        bundle0.putString("SESSION_ID", this.a.g);
        bundle0.putInt("CALLER_ID", this.a.e);
        bundle0.putBoolean("OFFER_RESET", this.a.f);
        return bundle0;
    }

    @Override  // baqp
    protected final IInterface c(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.auth.folsom.internal.IKeyRetrievalService");
        return (iInterface0 instanceof ajti) ? ((ajti)iInterface0) : new ajtg(iBinder0);
    }

    @Override  // baqp
    protected final String d() {
        return "com.google.android.gms.auth.folsom.internal.IKeyRetrievalService";
    }

    @Override  // baqp
    protected final String e() {
        return "com.google.android.gms.auth.key.retrieval.service.START";
    }

    @Override  // baqp
    protected final boolean f() {
        return true;
    }

    @Override  // baqp
    public final boolean g() {
        return true;
    }

    @Override  // baqp
    public final Feature[] h() {
        return amjz.o;
    }
}

