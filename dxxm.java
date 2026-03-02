import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class dxxm {
    final frli a;

    public dxxm(Context context0, Account account0) {
        frce frce0 = new frce(context0);
        frce0.d("tapandpay");
        frce0.c(account0);
        frce0.e("auth_user_cohort_datastore.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)hhkj.a));
        frie0.h(new frjp(cjtd.a));
        frif frif0 = frie0.a();
        this.a = cjtb.a.a(frif0);
    }

    public final hhki a() {
        try {
            hhki hhki0 = hhki.b(((hhkj)this.a.a().get(10L, TimeUnit.SECONDS)).b);
            return hhki0 == null ? hhki.g : hhki0;
        }
        catch(ExecutionException | InterruptedException | TimeoutException unused_ex) {
            return hhki.g;
        }
    }

    public final void b(hhki hhki0) {
        dxxl dxxl0 = new dxxl(hhki0);
        bblp bblp0 = new bblp(1, 10);
        this.a.b(dxxl0, bblp0);
    }
}

