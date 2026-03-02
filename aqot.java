import android.net.Uri.Builder;
import j..util.Objects;

final class aqot extends aqpo {
    final hisn a;

    public aqot(aqov aqov0, aqwm aqwm0, hisn hisn0) {
        this.a = hisn0;
        Objects.requireNonNull(aqov0);
        super(aqwm0);
    }

    @Override  // aqpo
    protected final String a() {
        Uri.Builder uri$Builder0 = aqov.a().appendEncodedPath(this.a.d).appendQueryParameter("transaction_id", this.a.e);
        aqov.k(uri$Builder0, (this.a.c == null ? hise.a : this.a.c));
        return uri$Builder0.build().toString();
    }
}

