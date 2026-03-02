import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.app.Activity;

public final class akmd implements AccountManagerCallback {
    public final akme a;
    public final Activity b;

    public akmd(akme akme0, Activity activity0) {
        this.a = akme0;
        this.b = activity0;
    }

    @Override  // android.accounts.AccountManagerCallback
    public final void run(AccountManagerFuture accountManagerFuture0) {
        akme akme0 = this.a;
        akmg akmg0 = akmg.a(accountManagerFuture0);
        akme0.b.ii(akmg0);
        if(hpxj.c()) {
            akme.a(this.b, akme0.c, accountManagerFuture0);
        }
    }
}

