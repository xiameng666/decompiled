import android.graphics.Bitmap;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import j..util.Objects;

final class flir implements gmbg {
    final AccountContext a;
    final fmev b;
    final flit c;

    public flir(flit flit0, AccountContext accountContext0, fmev fmev0) {
        this.a = accountContext0;
        this.b = fmev0;
        Objects.requireNonNull(flit0);
        this.c = flit0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        fmai fmai0 = fmaj.a();
        fmai0.g(39);
        fmai0.n(this.a.c().f());
        fmai0.o(this.a.d().toStringUtf8());
        fmai0.d(this.b.a);
        fmaj fmaj0 = fmai0.a();
        this.c.e.b(fmaj0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Bitmap bitmap0 = (Bitmap)object0;
    }
}

