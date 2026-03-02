import android.content.Context;
import com.google.android.gms.wearable.backup.wear.WearBackupOptInNotificationService;

public final class fcty implements glzn {
    public final Context a;

    public fcty(Context context0) {
        this.a = context0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        if(((Boolean)object0).booleanValue()) {
            Context context0 = this.a;
            if(!WearBackupOptInNotificationService.e(context0)) {
                return glzd.f(gmbt.h(glzd.f(WearBackupOptInNotificationService.f(context0).a(), new fctz(), gmap.a)), new fctr(context0), gmap.a);
            }
        }
        WearBackupOptInNotificationService.a.d("Disabled, not scheduling", new Object[0]);
        return gmbx.a;
    }
}

