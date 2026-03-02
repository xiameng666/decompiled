import com.google.android.gms.wearable.backup.wear.WearBackupOptInNotificationService;
import java.util.List;

public final class fctx implements gfsi {
    public final WearBackupOptInNotificationService a;

    public fctx(WearBackupOptInNotificationService wearBackupOptInNotificationService0) {
        this.a = wearBackupOptInNotificationService0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        int v = (int)((ffck)object0).d;
        if(((long)v) < hzub.a.d().g()) {
            String s = hzub.e();
            List list0 = gfud.g(";").n(s);
            WearBackupOptInNotificationService.a.j("Current back off values: %s", new Object[]{list0});
            WearBackupOptInNotificationService.d(this.a, 1, Long.parseLong((v >= list0.size() ? ((String)gggq.p(list0)) : ((String)list0.get(glwy.a(v) - 1)))));
        }
        return (int)0;
    }
}

