import android.graphics.Bitmap;
import com.google.android.libraries.messaging.lighter.model.AccountContext;

public final class fleg implements gfsi {
    public final flen a;
    public final fmeo b;
    public final AccountContext c;

    public fleg(flen flen0, fmeo fmeo0, AccountContext accountContext0) {
        this.a = flen0;
        this.b = fmeo0;
        this.c = accountContext0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Object object1;
        flen flen0 = this.a;
        AccountContext accountContext0 = this.c;
        fmeo fmeo0 = this.b;
        if(((Bitmap)object0) == null) {
            fmen fmen1 = new fmen(fmeo0);
            fmen1.g(true);
            object1 = fmen1.a();
            fmai fmai1 = fmaj.a();
            fmai1.g(39);
            fmai1.n(accountContext0.c().f());
            fmai1.o(accountContext0.d().toStringUtf8());
            fmai1.c(fmeo0.a);
            fmaj fmaj1 = fmai1.a();
            flen0.b.b(fmaj1);
        }
        else {
            fmen fmen0 = new fmen(fmeo0);
            fmen0.g(false);
            fmen0.e(((Bitmap)object0));
            object1 = fmen0.a();
            fmai fmai0 = fmaj.a();
            fmai0.g(38);
            fmai0.n(accountContext0.c().f());
            fmai0.o(accountContext0.d().toStringUtf8());
            fmai0.c(fmeo0.a);
            fmaj fmaj0 = fmai0.a();
            flen0.b.b(fmaj0);
        }
        flen0.a(accountContext0).ak(((fmeo)object1));
        return object1;
    }
}

