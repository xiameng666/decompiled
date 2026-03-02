import android.net.Uri.Builder;
import j..util.Objects;

final class aqou extends aqpo {
    final hism a;

    public aqou(aqov aqov0, aqwm aqwm0, hism hism0) {
        this.a = hism0;
        Objects.requireNonNull(aqov0);
        super(aqwm0);
    }

    @Override  // aqpo
    protected final String a() {
        Uri.Builder uri$Builder0 = aqov.a();
        Uri.Builder uri$Builder1 = uri$Builder0.appendPath("backups");
        hism hism0 = this.a;
        uri$Builder1.appendPath(String.valueOf(hism0.d));
        if((hism0.b & 1) != 0) {
            aqov.k(uri$Builder0, (hism0.c == null ? hise.a : hism0.c));
        }
        return uri$Builder0.build().toString();
    }
}

