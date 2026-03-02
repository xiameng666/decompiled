import android.accounts.Account;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import com.google.android.gms.mdisync.CallerInfo;
import com.google.android.gms.mdisync.SyncOptions;

public final class fkzg {
    public final cpzn a;
    public final CallerInfo b;

    public fkzg(Context context0, cpzn cpzn0, String s, Account account0, gful_cronetEngineProvider gful0, gful_cronetEngineProvider gful1) {
        this.a = cpzn0;
        this.b = new CallerInfo("profile-" + s, 1L);
        fkze fkze0 = new fkze(this, gful1, account0);
        if(Build.VERSION.SDK_INT >= 33) {
            context0.registerReceiver(fkze0, new IntentFilter("com.google.android.mdi.sync.profile.PROFILE_PHOTO_UPDATED"), 2);
        }
        else {
            context0.registerReceiver(fkze0, new IntentFilter("com.google.android.mdi.sync.profile.PROFILE_PHOTO_UPDATED"));
        }
        fkzf fkzf0 = new fkzf(this, gful0, account0);
        if(Build.VERSION.SDK_INT >= 33) {
            context0.registerReceiver(fkzf0, new IntentFilter("com.google.android.mdi.sync.profile.PROFILE_INFO_UPDATED"), 2);
            return;
        }
        context0.registerReceiver(fkzf0, new IntentFilter("com.google.android.mdi.sync.profile.PROFILE_INFO_UPDATED"));
    }

    public final gmcd a() {
        SyncOptions syncOptions0 = new SyncOptions();
        return gdtf.k(fhra.b(((cqee)this.a).e(1, new byte[0], syncOptions0, this.b, false, 15902)), new fkzc(), gmap.a);
    }
}

