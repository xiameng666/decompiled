import android.content.Context;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public final class flen {
    public final gmcg a;
    public final flsl b;
    public final Object c;
    public final Object d;
    public final Random e;
    final Map f;
    final Map g;
    public final flwa h;
    private final Context i;
    private final flky j;
    private final flbe k;

    public flen(Context context0, flky flky0, flwa flwa0, flbe flbe0, flsl flsl0) {
        this.c = new Object();
        this.d = new Object();
        this.f = new HashMap();
        this.g = new HashMap();
        this.i = context0;
        this.j = flky0;
        this.h = flwa0;
        this.k = flbe0;
        this.b = flsl0;
        this.a = flbs.b().a;
        this.e = new Random();
    }

    public final fmou a(AccountContext accountContext0) {
        return this.j.b(accountContext0);
    }

    public final fmpa b(AccountContext accountContext0, ContactId contactId0, gftc gftc0) {
        flbj.a("LitContactCtrlr", "getContactAndMaybeSync called");
        return fmot.d(this.a(accountContext0).o(contactId0), new flec(this, accountContext0, contactId0, gftc0));
    }

    public final fmpa c(AccountContext accountContext0, ContactId contactId0) {
        return this.b(accountContext0, contactId0, new fleh());
    }

    public final fmpa d(AccountContext accountContext0, ContactId contactId0) {
        return this.b(accountContext0, contactId0, new flel());
    }

    public final void e(AccountContext accountContext0, fmeo fmeo0) {
        gfsx gfsx0 = fmeo0.d;
        if(!gfsx0.i()) {
            return;
        }
        fmai fmai0 = fmaj.a();
        fmai0.g(37);
        fmai0.n(accountContext0.c().f());
        fmai0.o(accountContext0.d().toStringUtf8());
        fmai0.c(fmeo0.a);
        fmaj fmaj0 = fmai0.a();
        this.b.b(fmaj0);
        String s = (String)gfsx0.d();
        flcl flcl0 = new flcl(this.i, this.k, s);
        gmcd gmcd0 = this.a.e(flcl0);
        gmbu.t(gmcd0, new flem(this, accountContext0, fmeo0), gmap.a);
        glzd.f(gmcd0, new fleg(this, fmeo0, accountContext0), gmap.a);
    }
}

