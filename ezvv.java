import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.update.ConfigUpdateOptions;
import java.util.concurrent.ExecutionException;

public final class ezvv extends cjtm {
    private static final baun a;
    private final azxs b;
    private final ConfigUpdateOptions c;

    static {
        ezvv.a = fabk.a("CheckForConfigUpdateOperation");
    }

    public ezvv(azxs azxs0, ConfigUpdateOptions configUpdateOptions0, azug azug0) {
        super(0x9D, "CheckForConfigUpdate", azug0);
        this.b = azxs0;
        this.c = configUpdateOptions0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        if(hvxz.c()) {
            if((this.c.a ? ((ezxi)ezxi.b.b()).b(true) : ((ezxi)ezxi.b.b()).c()).h()) {
                this.b.a(Status.b);
                return;
            }
            this.b.a(Status.d);
            return;
        }
        avrl avrl0 = new avrl(context0);
        avqq avqq0 = new avqq(context0, this);
        avqq0.b();
        Bundle bundle0 = avqq0.a();
        bundle0.putBoolean("com.google.android.gms.checkin.FETCH_SYSTEM_UPDATES", this.c.a);
        evql evql0 = avrl0.c(bundle0);
        try {
            evrg.n(evql0);
        }
        catch(ExecutionException | InterruptedException exception0) {
            ezvv.a.g("Failed to checkin.", exception0, new Object[0]);
        }
        gfsx gfsx0 = gfsx.l(((Integer)evql0.j()));
        ezvv.a.h("Checkin request finished with code %s.", new Object[]{gfsx0});
        if(gfsx0.i() && ((int)(((Integer)gfsx0.d()))) == 21021) {
            this.b.a(Status.b);
            ((ezxs)ezxs.l.b()).i();
            return;
        }
        this.b.a(Status.d);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.a(status0);
    }
}

