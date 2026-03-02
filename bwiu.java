import android.content.Context;
import android.net.nsd.NsdManager;

public final class bwiu implements bwip {
    public static final bboh a;
    public final NsdManager b;
    private final Context c;

    static {
        bwiu.a = bboh.b("HubDiscovery", bbcu.fA);
    }

    public bwiu(Context context0) {
        ibuq.f(context0, "context");
        super();
        this.c = context0;
        this.b = (NsdManager)context0.getSystemService("servicediscovery");
    }
}

