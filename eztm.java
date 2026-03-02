import android.accounts.Account;
import android.content.Context;

public final class eztm implements ezsz {
    private final Context a;

    public eztm(Context context0) {
        this.a = context0;
    }

    @Override  // ezsz
    public final String a(Account account0) {
        return acso.e(this.a, account0.name);
    }
}

