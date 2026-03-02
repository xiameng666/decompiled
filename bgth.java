import android.content.Context;
import com.google.android.gms.crisisalerts.state.CrisisAlertsSettingsChangeIntentOperation;
import j..util.Optional;
import java.util.concurrent.Executor;

public final class bgth extends fxov {
    public static final fxou a;
    public volatile fxou b;
    private final Executor c;
    private final bgvx d;
    private volatile boolean e;

    static {
        bgrz.a("USetLsnr");
        bgth.a = new fxou(2, 10);
    }

    public bgth(Context context0, fxnw fxnw0) {
        bgvx bgvx0 = bgvx.a(context0);
        bblp bblp0 = new bblp(1, 9);
        super(fxnw0);
        this.b = bgth.a;
        this.e = false;
        this.c = bblp0;
        this.d = bgvx0;
    }

    // Detected as a lambda impl.
    public final void a() {
        if(!this.e) {
            return;
        }
        gmbu.t(this.d.b(), new bgtg(this), this.c);
    }

    @Override  // fxov
    public final fxou b() {
        return this.b;
    }

    @Override  // fxov
    public final void f() {
        this.b = bgth.a;
        this.e = true;
        Optional optional0 = Optional.of(() -> {
            if(!this.e) {
                return;
            }
            gmbu.t(this.d.b(), new bgtg(this), this.c);
        });
        CrisisAlertsSettingsChangeIntentOperation.a.set(optional0);
        this.a();
    }

    @Override  // fxov
    public final void g() {
        CrisisAlertsSettingsChangeIntentOperation.a.set(Optional.empty());
        this.e = false;
        this.b = bgth.a;
    }
}

