import android.content.Context;
import com.google.android.wallet.bender3.framework.storage.Bender3Database;
import java.util.Map;

public final class gbfq {
    public final String a;
    public final boolean b;
    public final gbkj c;
    private final icck d;
    private final gmcd e;

    public gbfq(Context context0, String s, boolean z, gaym gaym0, icck icck0) {
        ibuq.f(context0, "applicationContext");
        ibuq.f(s, "sessionId");
        ibuq.f(gaym0, "eventLogger");
        gbkj gbkj0 = gbku.b(Bender3Database.m, context0).u();
        gmcd gmcd0 = icpu.e(icck0, new gbfl(z, gbkj0, s, null));
        ibuq.f(context0, "applicationContext");
        ibuq.f(s, "sessionId");
        ibuq.f(gaym0, "eventLogger");
        ibuq.f(gbkj0, "actionDao");
        ibuq.f(gmcd0, "futureActionMap");
        super();
        this.a = s;
        this.b = z;
        this.d = icck0;
        this.c = gbkj0;
        this.e = gmcd0;
    }

    public final Map a() {
        Object object0 = this.e.get();
        ibuq.e(object0, "get(...)");
        return (Map)object0;
    }

    public final void b(ibtw ibtw0) {
        gbfp gbfp0 = new gbfp(this, ibtw0, null);
        icpu.e(this.d, gbfp0);
    }
}

