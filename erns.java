import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.smartdevice.setup.ui.views.AccountChallengeWebView;
import j..util.Objects;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public final class erns extends AsyncTask {
    final AccountChallengeWebView a;

    public erns(AccountChallengeWebView accountChallengeWebView0) {
        Objects.requireNonNull(accountChallengeWebView0);
        this.a = accountChallengeWebView0;
        super();
    }

    @Override  // android.os.AsyncTask
    protected final Object doInBackground(Object[] arr_object) {
        Void[] arr_void = (Void[])arr_object;
        try {
            this.a.j.tryAcquire(this.a.i, 30L, TimeUnit.SECONDS);
        }
        catch(InterruptedException interruptedException0) {
            AccountChallengeWebView.a.n("Interrupted. Finishing this activity.", interruptedException0, new Object[0]);
        }
        return null;
    }

    @Override  // android.os.AsyncTask
    protected final void onPostExecute(Object object0) {
        Void void0 = (Void)object0;
        AccountChallengeWebView.a.j("Returning results.", new Object[0]);
        AccountChallengeWebView accountChallengeWebView0 = this.a;
        erir erir0 = accountChallengeWebView0.q;
        if(erir0 != null) {
            ArrayList arrayList0 = accountChallengeWebView0.h;
            Context context0 = erir0.b.getContext();
            if(context0 != null) {
                ((eriv)context0).q(arrayList0);
            }
        }
    }
}

