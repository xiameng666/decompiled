import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.auth.proximity.firstparty.SetupRequestedSubscription;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;

public final class alfz extends cjtm {
    private final azxs a;
    private final PendingIntent b;
    private final String c;
    private final boolean d;
    private final String e;

    static {
        alis.a("SetupRequestedListener");
    }

    public alfz(azxs azxs0, PendingIntent pendingIntent0, String s, boolean z, String s1, azug azug0) {
        super(0x8E, "RegisterSetupRequestedListenerOperation", azug0);
        this.a = azxs0;
        this.b = pendingIntent0;
        this.c = s;
        this.d = z;
        this.e = s1;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        gqus gqus0;
        if(!algb.a(this.b, this.e)) {
            this.a.a(Status.d);
            return;
        }
        try {
            gqus0 = gqus.b(this.c);
            batl.b(gqus0 != gqus.a);
        }
        catch(IllegalArgumentException unused_ex) {
            throw new cjuh(101, "Invalid feature name: " + this.c);
        }
        SetupRequestedSubscription setupRequestedSubscription0 = new SetupRequestedSubscription(this.b, gqus0.name(), this.e);
        gmcd gmcd0 = this.d ? algs.a().b(setupRequestedSubscription0) : algs.a().d(setupRequestedSubscription0);
        try {
            Status status0 = (Status)gmcd0.get();
            this.a.a(status0);
        }
        catch(InterruptedException unused_ex) {
            throw new cjuh(14, "Interrupted while executing operation.");
        }
        catch(ExecutionException executionException0) {
            throw new RuntimeException(executionException0.getCause());
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0);
    }
}

