import android.graphics.Bitmap;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import j..util.Objects;

final class flem implements gmbg {
    final AccountContext a;
    final fmeo b;
    final flen c;

    public flem(flen flen0, AccountContext accountContext0, fmeo fmeo0) {
        this.a = accountContext0;
        this.b = fmeo0;
        Objects.requireNonNull(flen0);
        this.c = flen0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        fmai fmai0 = fmaj.a();
        fmai0.g(39);
        fmai0.n(this.a.c().f());
        fmai0.o(this.a.d().toStringUtf8());
        fmai0.c(this.b.a);
        fmaj fmaj0 = fmai0.a();
        this.c.b.b(fmaj0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Bitmap bitmap0 = (Bitmap)object0;
    }
}

