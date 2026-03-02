import com.google.android.gms.common.api.Status;

public final class arku implements Runnable {
    public final arla a;
    public final Exception b;

    public arku(arla arla0, Exception exception0) {
        this.a = arla0;
        this.b = exception0;
    }

    @Override
    public final void run() {
        int v = (this.b instanceof aztb) ? ((aztb)this.b).b() : Status.d.i;
        this.a.f(v, this.b.getMessage());
    }
}

