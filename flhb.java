import com.google.android.libraries.messaging.lighter.model.AccountContext;

public final class flhb implements glzn {
    public final flit a;
    public final fmev b;
    public final AccountContext c;
    public final boolean d;

    public flhb(flit flit0, fmev fmev0, AccountContext accountContext0, boolean z) {
        this.a = flit0;
        this.b = fmev0;
        this.c = accountContext0;
        this.d = z;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        if(!this.b.c.equals(((fmev)object0).c) || !((fmev)object0).d.i()) {
            gmcd gmcd0 = this.a.o(this.c, ((fmev)object0));
            return this.d ? gmcd0 : gmbu.i(((fmev)object0));
        }
        return gmbu.i(((fmev)object0));
    }
}

