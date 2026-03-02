import android.accounts.Account;
import android.content.Context;
import android.content.Intent;

public final class fkxq implements Runnable {
    public final fkwo a;

    public fkxq(fkwo fkwo0) {
        this.a = fkwo0;
    }

    @Override
    public final void run() {
        Context context0 = this.a.a;
        Account account0 = this.a.b;
        int v = fkvw.a(context0, account0);
        context0.sendBroadcast(new Intent("com.google.android.mdi.sync.profile.PROFILE_PHOTO_UPDATED").putExtra("account_index", v));
        gged_interceptors gged0 = gged_interceptors.i(hvev.a.b().d().b);
        int v1 = gged0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            String s = (String)gged0.get(v2);
            context0.sendBroadcast(new Intent("com.google.android.mdi.sync.profile.PROFILE_PHOTO_UPDATED").putExtra("account_index", fkvw.a(context0, account0)).setPackage(s));
        }
    }
}

