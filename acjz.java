import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

public final class acjz extends bark {
    public acjz(Context context0, Looper looper0, baqv baqv0, azvy azvy0, azyj azyj0) {
        super(context0, looper0, 332, baqv0, azvy0, azyj0);
    }

    @Override  // baqp, azsz
    public final int a() {
        return 17895000;
    }

    @Override  // baqp
    protected final IInterface c(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.appsearch.aidl.IAppSearchManager");
        return (iInterface0 instanceof acjk) ? ((acjk)iInterface0) : new acjk(iBinder0);
    }

    @Override  // baqp
    protected final String d() {
        return "com.google.android.gms.appsearch.aidl.IAppSearchManager";
    }

    @Override  // baqp
    protected final String e() {
        return "com.google.android.gms.appsearch.START";
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
        return achf.c;
    }
}

