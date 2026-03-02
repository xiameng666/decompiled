import android.accounts.Account;
import com.google.android.gms.nearby.sharing.internal.IgnoreConsentParams;

public final class ddqo implements azys {
    public final Account a;
    public final int b;

    public ddqo(Account account0, int v) {
        this.a = account0;
        this.b = v;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ddot ddot0 = (ddot)((ddub)object0).H();
        IgnoreConsentParams ignoreConsentParams0 = new IgnoreConsentParams();
        ignoreConsentParams0.a = this.a;
        ignoreConsentParams0.b = this.b;
        ignoreConsentParams0.c = true;
        ignoreConsentParams0.d = new ddrt(((evqp)object1));
        ddot0.v(ignoreConsentParams0);
    }
}

