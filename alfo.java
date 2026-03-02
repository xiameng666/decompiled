import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;

public final class alfo extends cjtm {
    private final alhx a;
    private final String b;
    private final Account c;

    public alfo(alhx alhx0, String s, String s1, azug azug0) {
        super(0x8E, "GetFeatureEnabledState", azug0);
        this.a = alhx0;
        this.b = s;
        this.c = new Account(s1, "com.google");
    }

    @Override  // cjtm
    public final void f(Context context0) {
        gqus gqus0;
        try {
            gqus0 = gqus.b(this.b);
            batl.b(gqus0 != gqus.a);
        }
        catch(IllegalArgumentException unused_ex) {
            throw new cjuh(101, "Invalid feature name: " + this.b);
        }
        Account account0 = this.c;
        if(!bbmn.m(context0, account0)) {
            throw new cjuh(102, "Account not found: " + account0.name);
        }
        boolean z = akwr.a(context0).d(account0, gqus0);
        this.a.a(Status.b, ((int)z));
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0, -1);
    }
}

