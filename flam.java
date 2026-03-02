import android.accounts.Account;
import android.content.Context;
import android.net.Uri;

public final class flam {
    public final frbx a;
    private final Context b;
    private final String c;

    public flam(Context context0, frbx frbx0) {
        this.b = context0;
        this.a = frbx0;
        this.c = "udcmobstoreprivate";
    }

    public final Uri a(Account account0) {
        frce frce0 = new frce(this.b);
        frce0.d(this.c);
        frce0.c(account0);
        return frce0.a();
    }

    public final Uri b() {
        frce frce0 = new frce(this.b);
        frce0.d(this.c);
        return frce0.a();
    }
}

