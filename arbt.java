import android.content.Intent;
import com.google.android.gms.backup.d2d.component.D2dEarlySourceChimeraService;
import j..util.Objects;
import java.util.concurrent.CancellationException;

public final class arbt implements gmbg {
    final long a;
    final Intent b;
    final D2dEarlySourceChimeraService c;

    public arbt(D2dEarlySourceChimeraService d2dEarlySourceChimeraService0, long v, Intent intent0) {
        this.a = v;
        this.b = intent0;
        Objects.requireNonNull(d2dEarlySourceChimeraService0);
        this.c = d2dEarlySourceChimeraService0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        if((throwable0 instanceof CancellationException)) {
            D2dEarlySourceChimeraService.a.d("Checking presence of data in data store cancelled", new Object[0]);
            return;
        }
        D2dEarlySourceChimeraService.a.g("Getting data for session ID failed with error", throwable0, new Object[0]);
        this.c.d(0L);
        this.c.i();
    }

    @Override  // gmbg
    public final void b(Object object0) {
        if(((Boolean)object0).booleanValue()) {
            D2dEarlySourceChimeraService.a.h("Data already exists for session ID: %d", new Object[]{((long)this.a)});
            this.c.d(0L);
            this.c.i();
            return;
        }
        this.c.f(this.b);
    }
}

