import android.os.Handler;
import com.google.android.gms.auth.proximity.firstparty.Subscription;
import com.google.android.gms.chimera.modules.auth.proximity.AppContextProvider;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;

public final class algs {
    public final baiw a;
    public final Handler b;
    public final List c;
    public volatile boolean d;
    public static final int e;
    private static final baun f;
    private static algs g;
    private final bais h;

    static {
        algs.f = new baun("ProximityAuth", new String[]{"SubscriptionCache"});
    }

    public algs() {
        algn algn0 = new algn();
        this.h = algn0;
        this.d = false;
        this.b = new bblf(new bblg("SubscriptionCache", 10));
        this.a = new baiw(AppContextProvider.a(), "com.google.android.gms.auth.proximity.firstparty.SystemMemoryCacheService", algn0, 0);
        this.c = new ArrayList();
    }

    public static algs a() {
        synchronized(algs.class) {
            if(algs.g == null) {
                algs.g = new algs();
            }
        }
        return algs.g;
    }

    public final gmcd b(Subscription subscription0) {
        algs.f.d("Adding subscription: %s", new Object[]{subscription0});
        gmcd gmcd0 = new gmce(new algk(this, subscription0), Status.b);
        this.e(((Runnable)gmcd0));
        return gmcd0;
    }

    public final gmcd c() {
        gmcd gmcd0 = new gmce(new algp(this));
        this.e(((Runnable)gmcd0));
        return gmcd0;
    }

    public final gmcd d(Subscription subscription0) {
        algs.f.d("Removing subscription: %s", new Object[]{subscription0});
        gmcd gmcd0 = new gmce(new algo(this, subscription0), Status.b);
        this.e(((Runnable)gmcd0));
        return gmcd0;
    }

    public final void e(Runnable runnable0) {
        algl algl0 = new algl(this, runnable0);
        this.b.post(algl0);
    }
}

