import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;

public final class ezax extends luw {
    private final int c;
    private final Bundle d;
    private final Object e;
    private final bboe f;

    public ezax(Context context0, int v, Bundle bundle0, bboe bboe0) {
        super(context0);
        this.c = v;
        batl.s(bundle0);
        this.d = bundle0;
        this.e = new Object();
        this.f = bboe0;
    }

    public ezax(Context context0, Bundle bundle0) {
        this(context0, 3, bundle0, new ezav());
    }

    @Override  // luw
    public final Object loadInBackground() {
        Context context0 = this.getContext();
        evql evql0 = ((azts)this.f.a(context0)).cf(this.c, this.d);
        try {
            Bundle bundle0 = (Bundle)evrg.n(evql0);
            return new ezaw(Status.b, bundle0);
        }
        catch(InterruptedException | ExecutionException exception0) {
            return exception0.getClass().equals(InterruptedException.class) ? new ezaw(Status.c, new Bundle()) : new ezaw(Status.d, new Bundle());
        }
    }

    @Override  // luw
    protected final boolean onCancelLoad() {
        synchronized(this.e) {
        }
        return super.onCancelLoad();
    }

    @Override  // lvb
    protected final void onReset() {
        this.onCancelLoad();
    }

    @Override  // lvb
    protected final void onStartLoading() {
        synchronized(this.e) {
            this.forceLoad();
        }
    }
}

