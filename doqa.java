import android.accounts.Account;
import com.google.android.gms.pay.ClearSmartTapOverrideRequest;

public final class doqa implements azys {
    public final Account a;
    public final azts b;

    public doqa(azts azts0, Account account0) {
        this.b = azts0;
        this.a = account0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        dota dota0 = (dota)object0;
        donm donm0 = (donm)dota0.H();
        ClearSmartTapOverrideRequest clearSmartTapOverrideRequest0 = new ClearSmartTapOverrideRequest();
        clearSmartTapOverrideRequest0.a = this.a;
        donm0.d(clearSmartTapOverrideRequest0, new doru(this.b, ((evqp)object1)), cclr.a(dota0.r));
    }
}

