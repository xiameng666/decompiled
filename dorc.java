import android.accounts.Account;
import com.google.android.gms.pay.SetSmartTapOverrideRequest;

public final class dorc implements azys {
    public final Account a;
    public final String b;
    public final long c;
    public final azts d;

    public dorc(azts azts0, Account account0, String s, long v) {
        this.d = azts0;
        this.a = account0;
        this.b = s;
        this.c = v;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        dota dota0 = (dota)object0;
        donm donm0 = (donm)dota0.H();
        SetSmartTapOverrideRequest setSmartTapOverrideRequest0 = new SetSmartTapOverrideRequest();
        setSmartTapOverrideRequest0.a = this.a;
        setSmartTapOverrideRequest0.b = this.b;
        setSmartTapOverrideRequest0.c = this.c;
        donm0.aJ(setSmartTapOverrideRequest0, new dorv(this.d, ((evqp)object1)), cclr.a(dota0.r));
    }
}

