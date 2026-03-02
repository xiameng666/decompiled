import android.accounts.Account;
import android.content.Context;
import android.content.Intent;

public final class cchk {
    public static final Intent a(Context context0, Account account0) {
        return cchk.c("Choose account", account0);
    }

    public static final Intent b(Context context0, String s) {
        return cchk.a(context0, (s == null || ibzk.D(s) ? null : new Account(s, "com.google")));
    }

    public static final Intent c(String s, Account account0) {
        int v;
        ibuq.f(s, "titleText");
        gsac gsac0 = cchl.a();
        if(gsac0 == gsac.c && cchl.d()) {
            v = 1003;
        }
        else {
            v = gsac0 == gsac.b ? 1002 : 1004;
        }
        azor azor0 = new azor();
        azor0.c(ibpo.b("com.google"));
        azor0.d();
        azor0.e = "com.google.android.gms";
        azor0.b = true;
        azor0.c = s;
        azor0.f = v;
        azor0.e();
        if(account0 != null) {
            azor0.a = account0;
        }
        return azou.a(azor0.a());
    }
}

