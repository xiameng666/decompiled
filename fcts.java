import android.content.Context;
import com.google.android.gms.wearable.backup.wear.WearBackupOptInNotificationService;

public final class fcts implements Runnable {
    public final Context a;

    public fcts(Context context0) {
        this.a = context0;
    }

    @Override
    public final void run() {
        WearBackupOptInNotificationService.a.d("scheduleTaskIfNeededAsync", new Object[0]);
        glzd.g(gmbt.h(WearBackupOptInNotificationService.g()), new fcty(this.a), gmap.a);
    }
}

