import android.net.Uri.Builder;
import j..util.Objects;
import java.io.InputStream;

final class aqoo extends aqpt {
    final hisi a;

    public aqoo(aqov aqov0, aqwm aqwm0, hisi hisi0) {
        this.a = hisi0;
        Objects.requireNonNull(aqov0);
        super(aqwm0);
    }

    @Override  // aqpt
    protected final Object a(InputStream inputStream0) {
        return null;
    }

    @Override  // aqpt
    protected final String b() {
        Uri.Builder uri$Builder0 = aqov.a().appendEncodedPath(this.a.d + ":commitTransaction").appendQueryParameter("transaction_id", this.a.e);
        aqov.k(uri$Builder0, (this.a.c == null ? hise.a : this.a.c));
        return uri$Builder0.build().toString();
    }
}

