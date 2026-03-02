import com.google.android.gms.backup.d2d.component.D2dSourceChimeraService;
import j..util.Objects;

public final class ardd implements gmbg {
    public ardd(D2dSourceChimeraService d2dSourceChimeraService0) {
        Objects.requireNonNull(d2dSourceChimeraService0);
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        if((throwable0 instanceof aqvu)) {
            D2dSourceChimeraService.a.m("App updates pause failed because disabled", new Object[0]);
            return;
        }
        D2dSourceChimeraService.a.g("App updates pause failed", throwable0, new Object[0]);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Void void0 = (Void)object0;
        D2dSourceChimeraService.a.h("App updates successfully paused", new Object[0]);
    }
}

