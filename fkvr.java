import android.net.Uri;
import j..util.Objects;

final class fkvr implements fkue {
    final Uri a;
    final fkvs b;

    public fkvr(fkvs fkvs0, Uri uri0) {
        this.a = uri0;
        Objects.requireNonNull(fkvs0);
        this.b = fkvs0;
        super();
    }

    @Override  // fkue
    public final void a() {
        this.b.b.d(this.a);
    }

    @Override  // fkue
    public final void b() {
        this.b.b.d(this.a);
    }
}

