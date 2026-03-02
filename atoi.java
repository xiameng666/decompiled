import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import java.util.List;

final class atoi extends ibsl implements ibtw {
    Object a;
    Object b;
    int c;
    final ator d;

    public atoi(ator ator0, ibrl ibrl0) {
        this.d = ator0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((atoi)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new atoi(this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ComponentName componentName0;
        Object object3;
        Object object2;
        Object object1 = ibrx.a;
        switch(this.c) {
            case 0: {
                ibnx.b(object0);
                long v = hxvd.a.c().b();
                this.c = 1;
                if(iccv.c(v, this) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                object2 = this.b;
                object3 = this.a;
                ibnx.b(object0);
                goto label_63;
            }
        }
        bboh bboh0 = ator.a;
        ((ggtj)bboh0.h()).x("Evaluating conditions in scheduleDialogRelaunchIfConditionsMet");
        ator ator0 = this.d;
        if(ator0.g != null && ator0.g.y()) {
            try {
                componentName0 = null;
                List list0 = ator0.b.getRunningTasks(1);
                ibuq.c(list0);
                ActivityManager.RunningTaskInfo activityManager$RunningTaskInfo0 = (ActivityManager.RunningTaskInfo)ibpo.T(list0);
                if(activityManager$RunningTaskInfo0 != null) {
                    componentName0 = activityManager$RunningTaskInfo0.topActivity;
                }
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                a.ae(ator.a.i(), "Failed to get top activity component.", illegalArgumentException0);
            }
            catch(SecurityException securityException0) {
                a.ae(ator.a.i(), "Failed to get top activity component.", securityException0);
            }
            catch(IllegalStateException illegalStateException0) {
                a.ae(ator.a.i(), "Failed to get top activity component.", illegalStateException0);
            }
            if(componentName0 == null) {
                ((ggtj)ator.a.h()).x("Top activity could not be determined. Skipping dialog relaunch.");
                return ibom.a;
            }
            String s = componentName0.getPackageName();
            ibuq.e(s, "getPackageName(...)");
            String s1 = componentName0.getClassName();
            ibuq.e(s1, "getClassName(...)");
            if(ibuq.m(s, "com.google.android.gms") && ibuq.m(s1, "com.google.android.gms.bankscamwarning.ui.BankWarningDialogActivity")) {
                ((ggtj)ator.a.h()).x("Bank warning dialog already in foreground. No need to relaunch dialog.");
                return ibom.a;
            }
            ator ator1 = this.d;
            if(!ator.l(s)) {
                ((ggtj)ator.a.h()).B("Top app %s, is not bank app. Skipping dialog relaunch.", s);
                return ibom.a;
            }
            String s2 = ator.i();
            if(s2 == null) {
                ((ggtj)ator.a.h()).x("No active projection app. Skipping relaunch.");
                return ibom.a;
            }
            if(ator.j(s2)) {
                ((ggtj)ator.a.h()).x("Active projection app is ignored. Skipping relaunch.");
                return ibom.a;
            }
            String s3 = (String)ator1.d.get();
            if(s3 == null) {
                ((ggtj)ator.a.i()).x("Session ID is null. Skipping relaunch.");
                return ibom.a;
            }
            this.a = s;
            this.b = s2;
            this.c = 2;
            object0 = ator1.a(s, s3, this);
            if(object0 != object1) {
                object3 = s;
                object2 = s2;
            label_63:
                if(((Boolean)object0).booleanValue()) {
                    ((ggtj)ator.a.h()).x("User has accepted risk or mitigation. Skipping relaunch.");
                    return ibom.a;
                }
                ((ggtj)ator.a.h()).x("Conditions met. Relaunching BankWarningDialogActivity.");
                ator.k(this.d, ((String)object2), ((String)object3));
                return ibom.a;
            }
            return object1;
        }
        ((ggtj)bboh0.h()).x("Skipping dialog relaunch: detection job is not active.");
        return ibom.a;
    }
}

