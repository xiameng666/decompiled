import com.google.android.gms.backup.d2d.component.D2dEarlySourceChimeraService;
import j..util.Objects;
import java.util.concurrent.CancellationException;

public final class arbv implements gmbg {
    final D2dEarlySourceChimeraService a;

    public arbv(D2dEarlySourceChimeraService d2dEarlySourceChimeraService0) {
        Objects.requireNonNull(d2dEarlySourceChimeraService0);
        this.a = d2dEarlySourceChimeraService0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        if((throwable0 instanceof CancellationException)) {
            D2dEarlySourceChimeraService.a.d("Summary generation cancelled", new Object[0]);
            return;
        }
        D2dEarlySourceChimeraService.a.g("Summary generation failed with error", throwable0, new Object[0]);
        this.a.b.a(hgvs.d);
        this.a.c();
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Void void0 = (Void)object0;
        D2dEarlySourceChimeraService.a.h("Summary generated and stored successfully", new Object[0]);
        this.a.b.a(hgvs.c);
        this.a.c();
    }
}

