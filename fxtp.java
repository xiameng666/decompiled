import android.accounts.Account;
import android.content.Context;
import android.content.Intent;

public final class fxtp {
    public static final String[] a;
    public final Context b;

    static {
        fxtp.a = new String[]{"com.google.android.googlequicksearchbox", "com.google.android.apps.maps", "com.google.android.apps.gmm", "com.google.android.apps.gmm.fishfood", "com.google.android.apps.gmm.dev", "com.google.android.apps.gmm.qp"};
    }

    public fxtp(Context context0) {
        this.b = context0;
    }

    public static Account a(Intent intent0) {
        return intent0.hasExtra("account") ? ((Account)intent0.getParcelableExtra("account")) : null;
    }

    public final void b(Account account0, int v) {
        Intent intent0 = new Intent("com.google.android.gms.location.reporting.INITIALIZATION_CHANGED");
        intent0.putExtra("initialization", v);
        intent0.putExtra("account", account0);
        Intent intent1 = bbmq.j(intent0);
        this.b.sendBroadcast(intent1);
    }
}

