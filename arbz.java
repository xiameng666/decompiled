import com.google.android.gms.backup.d2d.component.D2dEarlySourceChimeraService;
import j..util.Objects;

public final class arbz implements gmbg {
    public arbz(D2dEarlySourceChimeraService d2dEarlySourceChimeraService0) {
        Objects.requireNonNull(d2dEarlySourceChimeraService0);
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        if((throwable0 instanceof aqvu)) {
            D2dEarlySourceChimeraService.a.m("App updates resume failed because disabled", new Object[0]);
            return;
        }
        D2dEarlySourceChimeraService.a.g("App updates resume failed", throwable0, new Object[0]);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Void void0 = (Void)object0;
        D2dEarlySourceChimeraService.a.h("App updates successfully resumed", new Object[0]);
    }
}

