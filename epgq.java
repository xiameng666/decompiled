import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.CancellationException;

public final class epgq extends cjtm {
    final epgt a;
    final ibts b;

    public epgq(epgt epgt0, ibts ibts0) {
        this.a = epgt0;
        this.b = ibts0;
        super(396, "unregisterSignificantPlacesClient");
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ibuq.f(context0, "context");
        try {
            boolean z = ((Boolean)this.b.a(context0)).booleanValue();
            this.a.a(Status.b, z);
        }
        catch(CancellationException unused_ex) {
            this.a.a(Status.f, false);
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ibuq.f(status0, "status");
        this.a.a(status0, false);
    }
}

