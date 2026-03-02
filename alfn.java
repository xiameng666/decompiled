import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;

public final class alfn extends cjtm {
    private final azxs a;
    private final Account b;

    public alfn(azxs azxs0, String s, azug azug0) {
        super(0x8E, "ForceDeviceSync", azug0);
        this.a = azxs0;
        this.b = new Account(s, "com.google");
    }

    @Override  // cjtm
    public final void f(Context context0) {
        if(!hpyw.a.f().l()) {
            return;
        }
        Account account0 = this.b;
        if(!bbmn.m(context0, account0)) {
            throw new cjuh(102, "Account not found: " + account0.name);
        }
        alfm.a(context0, account0);
        this.a.a(Status.b);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0);
    }
}

