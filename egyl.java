import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;

public final class egyl extends bbkj {
    private final Context a;
    private egyh b;

    public egyl(Context context0) {
        super(context0.getApplicationContext(), false, "people");
        this.a = context0;
    }

    @Override  // bbkj
    protected final int a() {
        return 5380;
    }

    @Override  // bbkj
    protected final void b(Account account0, Bundle bundle0, String s, SyncResult syncResult0) {
        egig.e("FSA2_GmsContactsSyncAdapter", "@onPerformSync");
        int v = this.a.getApplicationInfo().uid;
        egke egke0 = egke.a(this.a, v);
        Context context0 = this.a.getApplicationContext();
        ContentResolver contentResolver0 = this.a.getContentResolver();
        efur efur0 = efur.i(this.a);
        egyk.a();
        egyh egyh0 = egyh.f(context0, contentResolver0, egke0, efur0);
        this.b = egyh0;
        egyh0.d(account0, bundle0, syncResult0);
    }

    @Override  // android.content.AbstractThreadedSyncAdapter
    public final void onSyncCanceled() {
        egig.e("FSA2_GmsContactsSyncAdapter", "onSyncCanceled");
        egyh egyh0 = this.b;
        if(egyh0 != null) {
            if(hxbk.g()) {
                egyh0.c(1);
                return;
            }
            if(egyh0.a != null) {
                Account account0 = egyh0.b;
                if(hxdh.i() && account0 != null && !ContentResolver.getSyncAutomatically(account0, "com.android.contacts")) {
                    egyh0.a.b.q();
                }
                egyh0.a.b(new ehfg(1));
            }
            return;
        }
        super.onSyncCanceled();
    }
}

