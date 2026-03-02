import com.google.android.gms.measurement.internal.AppMetadata;
import j..util.Objects;
import java.util.concurrent.Callable;

final class crqk implements Callable {
    final AppMetadata a;
    final crqq b;

    public crqk(crqq crqq0, AppMetadata appMetadata0) {
        this.a = appMetadata0;
        Objects.requireNonNull(crqq0);
        this.b = crqq0;
        super();
    }

    @Override
    public final Object call() {
        AppMetadata appMetadata0 = this.a;
        batl.s(appMetadata0.a);
        crqq crqq0 = this.b;
        if(crqq0.w(appMetadata0.a).q() && crmb.h(appMetadata0.s).q()) {
            return crqq0.j(appMetadata0).u();
        }
        crqq0.aJ().k.a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}

