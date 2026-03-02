import android.app.KeyguardManager;
import android.os.UserManager;
import java.util.HashSet;
import java.util.Set;

public final class ajll implements ajma, ajmd {
    public static final bboh a;
    public final KeyguardManager b;
    public final ajme c;
    public final ajmb d;
    public final bbpj e;
    public final UserManager f;
    public final ajls g;
    public final Set h;
    private final ajly i;

    static {
        ajll.a = ajlr.a("StatusUpdateTracker");
    }

    public ajll(KeyguardManager keyguardManager0, ajly ajly0, ajme ajme0, ajmb ajmb0, bbpj bbpj0, UserManager userManager0, ajls ajls0) {
        this.h = new HashSet();
        batl.s(keyguardManager0);
        this.b = keyguardManager0;
        this.i = ajly0;
        batl.s(ajme0);
        this.c = ajme0;
        batl.s(ajmb0);
        this.d = ajmb0;
        this.e = bbpj0;
        batl.s(userManager0);
        this.f = userManager0;
        this.g = ajls0;
    }

    public final void a() {
        gmbu.t(this.i.a(), new ajlj(this), gmap.a);
    }

    @Override  // ajmd
    public final void b() {
        this.a();
    }

    @Override  // ajmd
    public final void c() {
        this.a();
    }

    public final boolean d() {
        return !this.h.isEmpty();
    }

    @Override  // ajma
    public final void e() {
        this.a();
    }
}

