import android.content.Context;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import java.util.UUID;

public final class fmjd {
    public final Context a;
    public final flvd b;
    public final flsl c;
    private final flbe d;
    private final fieo e;

    public fmjd(Context context0, flvd flvd0, flbe flbe0, fieo fieo0) {
        this.a = context0;
        this.b = flvd0;
        this.d = flbe0;
        this.e = fieo0;
        this.c = flsl.a(context0);
    }

    public final gmcd a(AccountContext accountContext0, fmjm fmjm0, fmga fmga0, String s, flqw flqw0, int v) {
        gmcd gmcd0;
        fmai fmai0 = fmaj.a();
        fmai0.g(0x1F);
        fmai0.n(accountContext0.c().f());
        fmai0.o(accountContext0.d().toStringUtf8());
        fmai0.p(fmga0.a);
        fmai0.d(fmga0.c);
        fmaj fmaj0 = fmai0.a();
        this.c.b(fmaj0);
        UUID uUID0 = UUID.randomUUID();
        fmji fmji0 = new fmji(accountContext0, s, fmjm0, v);
        if(iadl.h()) {
            fmjf fmjf0 = new fmjf(this.a, this.d, this.e);
            gmcd0 = gmbu.i(new fmiz(this.a, fmjf0));
        }
        else {
            fmjf fmjf1 = new fmjf(null);
            gmcd0 = gmbu.i(new fmiz(this.a, fmjf1));
        }
        gmcd gmcd1 = this.b.b(uUID0, fmji0, gmcd0, accountContext0, flqw0, true);
        gmbu.t(gmcd1, new fmjb(this, accountContext0, fmga0), gmap.a);
        return gmcd1;
    }
}

