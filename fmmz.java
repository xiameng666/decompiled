import android.net.Uri;
import j..util.Objects;

final class fmmz implements gmbg {
    final fmna a;

    public fmmz(fmna fmna0) {
        Objects.requireNonNull(fmna0);
        this.a = fmna0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        this.a.f.b(null);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        String s = Uri.parse(((String)object0)).getPath();
        this.a.f.b(s);
    }
}

