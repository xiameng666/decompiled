import android.app.backup.BackupManager;
import android.content.Context;

public final class cqiw {
    private final yzx a;

    public cqiw(yzx yzx0) {
        this.a = yzx0;
    }

    public final void a(Context context0, boolean z) {
        if(hxwm.l()) {
            eibx.c(context0, "remote_lock_setting", z);
        }
        this.a.d(Boolean.valueOf(z));
        if(hxwm.g()) {
            BackupManager.dataChanged("com.google.android.gms");
        }
    }

    public final boolean b(Context context0) {
        Boolean boolean0 = this.c();
        return boolean0 == null ? hxwm.r() || eiby.a(context0) : boolean0.booleanValue();
    }

    public final Boolean c() {
        return (Boolean)this.a.c();
    }
}

