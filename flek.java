import com.google.android.libraries.messaging.lighter.model.AccountContext;

public final class flek implements gfsi {
    public final flen a;
    public final fmeo b;
    public final AccountContext c;

    public flek(flen flen0, fmeo fmeo0, AccountContext accountContext0) {
        this.a = flen0;
        this.b = fmeo0;
        this.c = accountContext0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        if(this.b.d.equals(((fmeo)object0).d) && ((fmeo)object0).e.i()) {
            return (fmeo)object0;
        }
        this.a.e(this.c, ((fmeo)object0));
        return (fmeo)object0;
    }
}

