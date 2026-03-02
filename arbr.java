import com.google.android.gms.backup.d2d.component.D2dEarlySourceChimeraService;
import java.util.concurrent.Callable;

public final class arbr implements Callable {
    public final D2dEarlySourceChimeraService a;

    public arbr(D2dEarlySourceChimeraService d2dEarlySourceChimeraService0) {
        this.a = d2dEarlySourceChimeraService0;
    }

    @Override
    public final Object call() {
        D2dEarlySourceChimeraService.k(this.a.i);
        D2dEarlySourceChimeraService.k(this.a.j);
        D2dEarlySourceChimeraService.k(this.a.l);
        D2dEarlySourceChimeraService.k(this.a.k);
        Object[] arr_object = {this.a.c.get()};
        D2dEarlySourceChimeraService.a.h("Processing cancelled for session ID: %d", arr_object);
        this.a.i = gmbu.i(Boolean.valueOf(false));
        this.a.j = gmbu.i(asbo.a);
        this.a.l = gmbx.a;
        this.a.k = D2dEarlySourceChimeraService.a();
        this.a.d(0L);
        this.a.d.set(false);
        return null;
    }
}

