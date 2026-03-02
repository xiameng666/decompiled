import android.accounts.Account;
import com.google.android.gms.pay.GetOutstandingPurchaseOrderIdRequest;

public final class doog implements azys {
    public final Account a;
    public final long b;
    public final azts c;

    public doog(azts azts0, Account account0, long v) {
        this.c = azts0;
        this.a = account0;
        this.b = v;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        dota dota0 = (dota)object0;
        donm donm0 = (donm)dota0.H();
        GetOutstandingPurchaseOrderIdRequest getOutstandingPurchaseOrderIdRequest0 = new GetOutstandingPurchaseOrderIdRequest();
        getOutstandingPurchaseOrderIdRequest0.a = this.a;
        getOutstandingPurchaseOrderIdRequest0.b = this.b;
        donm0.I(getOutstandingPurchaseOrderIdRequest0, new dosc(this.c, ((evqp)object1)), cclr.a(dota0.r));
    }
}

