import android.accounts.Account;
import com.google.android.gms.pay.SetPassesUpdateNotificationsEnabledRequest;

public final class doro implements azys {
    public final Account a;
    public final azts b;

    public doro(azts azts0, Account account0) {
        this.b = azts0;
        this.a = account0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        dota dota0 = (dota)object0;
        donm donm0 = (donm)dota0.H();
        SetPassesUpdateNotificationsEnabledRequest setPassesUpdateNotificationsEnabledRequest0 = new SetPassesUpdateNotificationsEnabledRequest();
        setPassesUpdateNotificationsEnabledRequest0.a = this.a;
        setPassesUpdateNotificationsEnabledRequest0.b = false;
        donm0.aH(setPassesUpdateNotificationsEnabledRequest0, new dorw(this.b, ((evqp)object1)), cclr.a(dota0.r));
    }
}

