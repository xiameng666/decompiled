import com.google.android.libraries.messaging.lighter.model.AccountContext;
import java.security.InvalidParameterException;

public final class flhp implements Runnable {
    public final flit a;
    public final fmga b;
    public final AccountContext c;
    public final gmcu d;
    public final int e;

    public flhp(flit flit0, fmga fmga0, AccountContext accountContext0, gmcu gmcu0, int v) {
        this.a = flit0;
        this.b = fmga0;
        this.c = accountContext0;
        this.d = gmcu0;
        this.e = v;
    }

    @Override
    public final void run() {
        fmga fmga0 = this.b;
        boolean z = fmga0.g.equals(fmft.g);
        gmcu gmcu0 = this.d;
        flit flit0 = this.a;
        AccountContext accountContext0 = this.c;
        if(z && !flit0.d(accountContext0).ae(fmga0.a)) {
            flbj.c("LiMsgController", "Tried to resend unstored message.");
            gmcu0.r(new InvalidParameterException());
            return;
        }
        fmai fmai0 = fmaj.a();
        fmai0.g(9);
        fmai0.n(accountContext0.c().f());
        fmai0.o(accountContext0.d().toStringUtf8());
        fmai0.p(fmga0.a);
        fmai0.d(fmga0.c);
        fmai0.l(this.e);
        fmai0.i(flcs.a(fmga0));
        fmaj fmaj0 = fmai0.a();
        flit0.e.b(fmaj0);
        gmcu0.q(Boolean.valueOf(true));
    }
}

