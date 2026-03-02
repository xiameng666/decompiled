import android.accounts.Account;
import android.content.Context;

public final class bdzt {
    public final Context a;

    public bdzt(Context context0) {
        this.a = context0;
    }

    public final aysr a(String s) {
        ibuq.f(s, "accountName");
        Account account0 = new Account(s, "com.google");
        return ayss.d(this.a, account0);
    }
}

