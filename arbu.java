import android.content.Intent;
import com.google.android.gms.backup.d2d.component.D2dEarlySourceChimeraService;
import j..util.Objects;

public final class arbu implements gmbg {
    final Intent a;
    final D2dEarlySourceChimeraService b;

    public arbu(D2dEarlySourceChimeraService d2dEarlySourceChimeraService0, Intent intent0) {
        this.a = intent0;
        Objects.requireNonNull(d2dEarlySourceChimeraService0);
        this.b = d2dEarlySourceChimeraService0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        D2dEarlySourceChimeraService.a.g("Cancellation of previous session failed with error", throwable0, new Object[0]);
        this.b.c();
        this.b.i();
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Void void0 = (Void)object0;
        long v = D2dEarlySourceChimeraService.j(this.a);
        this.b.d(v);
        this.b.f(this.a);
    }
}

