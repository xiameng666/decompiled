import android.content.Context;
import com.google.android.gms.findmydevice.spot.GetFindMyDeviceSettingsRequest;
import java.util.concurrent.Executor;

public final class bplz implements bpnj {
    public static final bboh a;
    public final bpde b;
    public final Context c;
    private final fqxe d;
    private final Executor e;

    static {
        bplz.a = bboh.b("GetFindMyDeviceSettings", bbcu.eD);
    }

    public bplz(bpde bpde0, Context context0, fqxe fqxe0, Executor executor0) {
        this.b = bpde0;
        this.c = context0;
        this.d = fqxe0;
        this.e = executor0;
    }

    @Override  // bpnj
    public final gmcd a(Object object0) {
        return gdta.g(this.d.f()).h(new bply(this, ((GetFindMyDeviceSettingsRequest)object0)), this.e);
    }
}

