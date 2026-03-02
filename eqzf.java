import android.content.Context;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;

public final class eqzf {
    public static final baun a;
    public final Context b;
    public final cvxr c;
    public eqwr d;
    public String e;
    public eqzh f;
    public boolean g;
    public final cvxg h;
    public final cvxf i;

    static {
        eqzf.a = new erqc(new String[]{"QuickStart", "TargetDeviceConnectorNearbyConnectionsV3"});
    }

    public eqzf(Context context0, cvxr cvxr0) {
        this.g = false;
        this.h = new eqzd(this, DctDevice.class);
        this.i = new eqze(this);
        this.b = context0;
        this.c = cvxr0;
    }

    public final void a() {
        this.c.f();
    }
}

