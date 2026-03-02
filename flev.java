import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.UUID;

public final class flev implements glzm {
    public final flfv a;
    public final flfu b;
    public final flqw c;

    public flev(flfv flfv0, flfu flfu0, flqw flqw0) {
        this.a = flfv0;
        this.b = flfu0;
        this.c = flqw0;
    }

    @Override  // glzm
    public final gmcd a() {
        flvd flvd0 = this.a.t.a;
        UUID uUID0 = UUID.randomUUID();
        AccountContext accountContext0 = this.a.b;
        flyz flyz0 = new flyz(accountContext0, this.a.t.b, this.a.t.f);
        gpgz gpgz0 = flvd0.d.d;
        gmcd gmcd0 = gpgz0 == null ? gmbu.i(new flve(hnvo.b(flvd0.d.c))) : gmbu.i(flvd0.d.a(hnvo.b(gpgz0.a(hnzn.n))));
        ContactId contactId0 = accountContext0.c().f();
        return flvd0.c(accountContext0, contactId0, new flun(flvd0, uUID0, this.b, flyz0, gmcd0, contactId0, accountContext0), 0, this.c, true);
    }
}

