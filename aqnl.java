import android.accounts.Account;
import android.content.Context;

public final class aqnl {
    private final Context a;
    private final aqxr b;

    public aqnl(Context context0, aqxr aqxr0) {
        this.a = context0;
        this.b = aqxr0;
    }

    public final String a() {
        Context context0 = this.a;
        Account account0 = new aqee(context0).a();
        if(account0 != null) {
            return aqxr.e(context0, account0, hqje.a.m().x());
        }
        throw new aqyb();
    }
}

