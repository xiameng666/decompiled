import android.util.Log;
import com.google.android.gms.common.api.Status;

public final class azur extends azuv {
    protected final azvc a;

    public azur(int v, azvc azvc0) {
        super(v);
        this.a = azvc0;
    }

    @Override  // azuv
    public final void c(Status status0) {
        try {
            this.a.a(status0);
        }
        catch(IllegalStateException illegalStateException0) {
            Log.w("ApiCallRunner", "Exception reporting failure", illegalStateException0);
        }
    }

    @Override  // azuv
    public final void d(Exception exception0) {
        Status status0 = new Status(10, exception0.getClass().getSimpleName() + ": " + exception0.getLocalizedMessage());
        try {
            this.a.a(status0);
        }
        catch(IllegalStateException illegalStateException0) {
            Log.w("ApiCallRunner", "Exception reporting failure", illegalStateException0);
        }
    }

    @Override  // azuv
    public final void e(azxi azxi0) {
        try {
            this.a.i(azxi0.b);
        }
        catch(RuntimeException runtimeException0) {
            this.d(runtimeException0);
        }
    }

    @Override  // azuv
    public final void f(azwb azwb0, boolean z) {
        azwb0.a.put(this.a, Boolean.valueOf(z));
        azvz azvz0 = new azvz(azwb0, this.a);
        this.a.c(azvz0);
    }
}

