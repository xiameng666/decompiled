import android.accounts.Account;
import android.content.Context;
import java.util.concurrent.TimeUnit;

public final class fkyt implements fkpz {
    private final Context a;
    private final ayud b;
    private final fkyw c;

    public fkyt(Context context0, String s, fkyw fkyw0, Account account0) {
        ibuq.f(context0, "context");
        ayud ayud0 = new ayud(context0, s, (account0 == null ? null : account0.name));
        ibuq.f(context0, "context");
        super();
        this.a = context0;
        this.b = ayud0;
        this.c = fkyw0;
    }

    @Override  // fkpz
    public final void a(fkpq fkpq0, fkpo fkpo0) {
        ibuq.f(fkpq0, "eventCode");
        ibuq.f(fkpo0, "logsExtension");
        icwk icwk0 = new icwk();
        ayvm ayvm0 = fhbe.b(this.a, icwk0);
        ayud ayud0 = this.b;
        ayuc ayuc0 = ayud0.j(((MessageLite)fkpo0), ayvm0);
        ayuc0.k(fkpq0.y);
        ayuc0.d();
        if(this.c.a()) {
            ayud0.e(10L, TimeUnit.SECONDS);
        }
    }
}

