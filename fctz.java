import com.google.android.gms.wearable.backup.wear.WearBackupOptInNotificationService;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class fctz implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        long v = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        long v1 = 0L;
        if((((ffck)object0).b & 4) != 0) {
            hfwn hfwn0 = ((ffck)object0).e;
            if(hfwn0 == null) {
                hfwn0 = hfwn.a;
            }
            long v2 = v - hfyn.d(hfwn0);
            v1 = Math.max(0L, hzub.a.d().i() - v2);
        }
        if((((ffck)object0).b & 1) != 0) {
            String s = hzub.e();
            List list0 = gfud.g(";").n(s);
            baun baun0 = WearBackupOptInNotificationService.a;
            baun0.h("Current back off values: %s", new Object[]{list0});
            hfwn hfwn1 = ((ffck)object0).c;
            if(hfwn1 == null) {
                hfwn1 = hfwn.a;
            }
            long v3 = v - hfyn.d(hfwn1);
            baun0.h("timeSinceLastShownSecs: %d", new Object[]{v3});
            v1 = Math.max(v1, Long.parseLong((((ffck)object0).d >= ((long)list0.size()) ? ((String)gggq.p(list0)) : ((String)list0.get(glwy.a(((ffck)object0).d) - 1)))) - v3);
        }
        return v1;
    }
}

