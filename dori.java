import android.accounts.Account;
import com.google.android.gms.pay.HasAcceptedTosForPartnerRequest;

public final class dori implements azys {
    public final Account a;
    public final long b;

    public dori(Account account0, long v) {
        this.a = account0;
        this.b = v;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        dota dota0 = (dota)object0;
        donm donm0 = (donm)dota0.H();
        HasAcceptedTosForPartnerRequest hasAcceptedTosForPartnerRequest0 = new HasAcceptedTosForPartnerRequest();
        hasAcceptedTosForPartnerRequest0.a = this.a;
        hasAcceptedTosForPartnerRequest0.b = this.b;
        donm0.aa(hasAcceptedTosForPartnerRequest0, new doso(((evqp)object1)), cclr.a(dota0.r));
    }
}

