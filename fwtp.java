import android.net.Uri;
import android.os.Handler;
import j..util.Objects;

final class fwtp extends clid {
    final fwtu a;
    private final fxbx b;

    public fwtp(fwtu fwtu0, Handler handler0, fxbx fxbx0) {
        Objects.requireNonNull(fwtu0);
        this.a = fwtu0;
        super("location", "MyContentObserver", handler0);
        this.b = fxbx0;
    }

    @Override  // clid
    protected final void a(boolean z, Uri uri0) {
        this.a.c(this.b);
    }
}

