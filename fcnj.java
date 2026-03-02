import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.wearable.backup.wear.WearBackupOptInNotificationService;

public final class fcnj implements gfsi {
    public final fcnm a;
    public final String b;
    public final gqtz c;

    public fcnj(fcnm fcnm0, String s, gqtz gqtz0) {
        this.a = fcnm0;
        this.b = s;
        this.c = gqtz0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        fcnm fcnm0 = this.a;
        gqtz gqtz0 = this.c;
        Object object1 = (Account)object0;
        try {
            fcnm.a.h("Enabling backup for %s", new Object[]{baun.q(this.b)});
            fcnm0.e.c(((Account)object1));
            Context context0 = fcnm0.b;
            aqjl.a.d(context0, true);
            aqjl.a.b(context0, true);
            aqjl.a.c(context0, true);
            fcnm0.d.f(true);
            fcnm0.j(2, gqtz0);
            baun baun0 = WearBackupOptInNotificationService.a;
            baun0.d("Cancelling opt-in notification", new Object[0]);
            if(hzub.f()) {
                new jvr(context0).b("com.google.android.backup.notification.wear_backup_opt_in.tag", 2);
                return object1;
            }
            bayn bayn0 = bayn.f(context0);
            if(bayn0 == null) {
                baun0.f("Unable to cancel notification: notificationManager is null", new Object[0]);
                return object1;
            }
            bayn0.o("com.google.android.backup.notification.wear_backup_opt_in.tag", 2, evuh.bo);
            return object1;
        }
        catch(Throwable throwable0) {
            fcnm0.j(7, gqtz0);
            throw throwable0;
        }
    }
}

