import android.net.Uri;
import android.os.Handler;
import j..util.Objects;

public final class fefe extends clid {
    final fefg a;

    public fefe(fefg fefg0, Handler handler0) {
        Objects.requireNonNull(fefg0);
        this.a = fefg0;
        super("wearable", "IosSetupWizardObserver", handler0);
    }

    @Override  // clid
    protected final void a(boolean z, Uri uri0) {
        fefg fefg0 = this.a;
        if(fefg0.f()) {
            fefg0.f.set(true);
            fefg0.a.a();
            fefg0.d();
        }
    }
}

