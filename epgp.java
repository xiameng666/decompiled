import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.CancellationException;

public final class epgp extends cjtm {
    final ibts a;
    final azxs b;

    public epgp(ibts ibts0, azxs azxs0) {
        this.a = ibts0;
        this.b = azxs0;
        super(396, "registerSignificantPlacesClient");
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ibuq.f(context0, "context");
        try {
            this.a.a(context0);
            this.b.a(Status.b);
        }
        catch(CancellationException unused_ex) {
            this.b.a(Status.f);
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ibuq.f(status0, "status");
        this.b.a(status0);
    }
}

