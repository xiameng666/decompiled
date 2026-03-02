import android.accounts.Account;
import com.google.android.gms.pay.SetAcceptedTosForPartnerRequest;

public final class dopf implements azys {
    public final Account a;
    public final long b;
    public final azts c;

    public dopf(azts azts0, Account account0, long v) {
        this.c = azts0;
        this.a = account0;
        this.b = v;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        dota dota0 = (dota)object0;
        donm donm0 = (donm)dota0.H();
        SetAcceptedTosForPartnerRequest setAcceptedTosForPartnerRequest0 = new SetAcceptedTosForPartnerRequest();
        setAcceptedTosForPartnerRequest0.a = this.a;
        setAcceptedTosForPartnerRequest0.b = this.b;
        donm0.aE(setAcceptedTosForPartnerRequest0, new dosb(this.c, ((evqp)object1)), cclr.a(dota0.r));
    }
}

