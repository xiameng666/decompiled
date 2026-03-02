import android.graphics.Bitmap;
import com.google.android.libraries.messaging.lighter.model.AccountContext;

public final class flgs implements gfsi {
    public final flit a;
    public final fmev b;
    public final AccountContext c;

    public flgs(flit flit0, fmev fmev0, AccountContext accountContext0) {
        this.a = flit0;
        this.b = fmev0;
        this.c = accountContext0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Object object1;
        flit flit0 = this.a;
        AccountContext accountContext0 = this.c;
        fmev fmev0 = this.b;
        if(((Bitmap)object0) == null) {
            fmeu fmeu1 = new fmeu(fmev0);
            fmeu1.l(true);
            object1 = fmeu1.a();
            fmai fmai1 = fmaj.a();
            fmai1.g(39);
            fmai1.n(accountContext0.c().f());
            fmai1.o(accountContext0.d().toStringUtf8());
            fmai1.d(fmev0.a);
            fmaj fmaj1 = fmai1.a();
            flit0.e.b(fmaj1);
        }
        else {
            fmeu fmeu0 = new fmeu(fmev0);
            fmeu0.l(false);
            fmeu0.j(((Bitmap)object0));
            object1 = fmeu0.a();
            fmai fmai0 = fmaj.a();
            fmai0.g(38);
            fmai0.n(accountContext0.c().f());
            fmai0.o(accountContext0.d().toStringUtf8());
            fmai0.d(fmev0.a);
            fmaj fmaj0 = fmai0.a();
            flit0.e.b(fmaj0);
        }
        flit0.d(accountContext0).al(((fmev)object1));
        return object1;
    }
}

