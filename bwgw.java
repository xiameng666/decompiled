import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

public final class bwgw extends bark {
    public bwgw(Context context0, Looper looper0, baqv baqv0, azvy azvy0, azyj azyj0) {
        super(context0, looper0, 0x150, baqv0, azvy0, azyj0);
    }

    @Override  // baqp, azsz
    public final int a() {
        return 205100000;
    }

    @Override  // baqp
    protected final IInterface c(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.home.internal.IChipService");
        return (iInterface0 instanceof bwgx) ? ((bwgx)iInterface0) : new bwgx(iBinder0);
    }

    @Override  // baqp
    protected final String d() {
        return "com.google.android.gms.home.internal.IChipService";
    }

    @Override  // baqp
    protected final String e() {
        return "com.google.android.gms.home.service.START";
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
        return bwgm.x;
    }
}

